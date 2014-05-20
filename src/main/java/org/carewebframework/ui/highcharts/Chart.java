/**
 * This Source Code Form is subject to the terms of the Mozilla Public License, v. 2.0.
 * If a copy of the MPL was not distributed with this file, You can obtain one at
 * http://mozilla.org/MPL/2.0/.
 *
 * This Source Code Form is also subject to the terms of the Health-Related Additional
 * Disclaimer of Warranty and Limitation of Liability available at
 * http://www.carewebframework.org/licensing/disclaimer.
 */
package org.carewebframework.ui.highcharts;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.zkoss.zk.au.out.AuInvoke;
import org.zkoss.zk.ui.Desktop;
import org.zkoss.zk.ui.Page;
import org.zkoss.zul.impl.XulElement;

/**
 * ZK wrapper for HighCharts component.
 */
public class Chart extends XulElement implements IMapConverter {

    static {
        Util.init();
    }

    private static final long serialVersionUID = 1L;

    private static final String GLOBAL_SETTINGS = Chart.class.getName() + ".global";

    public static class ChartSettings extends Options {

        public final ChartOptions chart = new ChartOptions();

        public final List<String> colors = new ArrayList<String>();

        public final CreditsOptions credits = new CreditsOptions();

        public final ExportingOptions exporting = new ExportingOptions();

        public final LegendOptions legend = new LegendOptions();

        public final LoadingOptions loading = new LoadingOptions();

        public final NavigationOptions navigation = new NavigationOptions();

        public final PaneOptions pane = new PaneOptions();

        public final PlotOptions plotOptions = null;

        public final List<Series> series = new ArrayList<Series>();

        public final TitleOptions subtitle = new TitleOptions();

        public final TitleOptions title = new TitleOptions();

        public final TooltipOptions tooltip = new TooltipOptions();

        public final List<Axis> xAxis = new ArrayList<Axis>();

        public final List<Axis> yAxis = new ArrayList<Axis>();

    }

    public final ChartSettings options = new ChartSettings();

    private boolean running;

    /**
     * Create default chart (line plot, single x- and y-axis).
     */
    public Chart() {
        super();
        addXAxis();
        addYAxis();
        setType("line");
    }

    /**
     * Sets the default colors for the chart's series. When all colors are used, new colors are
     * pulled from the start again.
     *
     * @param colors List of default colors. If null or empty, the Highcharts defaults are used.
     */
    public void setDefaultColors(String... colors) {
        options.colors.clear();

        if (colors != null) {
            options.colors.addAll(Arrays.asList(colors));
        }
    }

    /**
     * Returns the chart type.
     *
     * @return The chart type.
     */
    public String getType() {
        return options.chart.type;
    }

    /**
     * Sets the chart type. This will remove any existing series.
     *
     * @param type One of the supported chart types.
     */
    public void setType(String type) {
        try {
            Field field = ChartSettings.class.getField("plotOptions");
            field.setAccessible(true);
            PlotOptions plotOptions = Util.getPlotType(type);
            plotOptions.type = type;
            field.set(options, plotOptions);
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        options.chart.type = type;
        options.series.clear();
    }

    /**
     * Convenience method for returning the x-axis. If there are no x-axes, returns null. If there
     * are multiple x-axes, returns the first only.
     *
     * @return The x-axis.
     */
    public Axis getXAxis() {
        return options.xAxis.isEmpty() ? null : options.xAxis.get(0);
    }

    /**
     * Convenience method for returning the y-axis. If there are no y-axes, returns null. If there
     * are multiple y-axes, returns the first only.
     *
     * @return The y-axis.
     */
    public Axis getYAxis() {
        return options.yAxis.isEmpty() ? null : options.yAxis.get(0);
    }

    /**
     * Adds a new series to the chart using the chart's default type.
     *
     * @return The newly created series.
     */
    public Series addSeries() {
        return addSeries(options.chart.type);
    }

    /**
     * Adds a new series to the chart using the specified type.
     *
     * @param type The plot type.
     * @return The newly created series.
     */
    public Series addSeries(String type) {
        Series series = new Series(type);
        options.series.add(series);
        return series;
    }

    /**
     * Adds an additional x axis.
     *
     * @return The newly added axis.
     */
    public Axis addXAxis() {
        return new Axis(options.xAxis);
    }

    /**
     * Adds an additional y axis.
     *
     * @return The newly added axis.
     */
    public Axis addYAxis() {
        return new Axis(options.yAxis);
    }

    /**
     * Build the graph on the client.
     */
    public void run() {
        init();
        invoke("_run", toMap());
        running = true;
    }

    /**
     * Returns true if a chart is currently running on the client.
     *
     * @return True if a chart is running.
     */
    public boolean isRunning() {
        return running;
    }

    /**
     * Removes all series and data points and destroys the client graph.
     */
    public void clear() {
        running = false;
        options.series.clear();
        invoke("_clear", null);
    }

    /**
     * Force a redraw of the chart.
     */
    public void redraw() {
        if (running) {
            invoke("_redraw", null);
        } else {
            run();
        }
    }

    /**
     * Send global settings to client if necessary.
     */
    private void init() {
        if (shouldInitialize()) {
            invoke("_init", new GlobalSettings().toMap());
        }
    }

    /**
     * Returns true if global settings need to be sent to client. This occurs once per desktop.
     *
     * @return True if global settings need to be sent.
     */
    private boolean shouldInitialize() {
        Desktop dt = getDesktop();

        if (dt != null && !dt.hasAttribute(GLOBAL_SETTINGS)) {
            dt.setAttribute(GLOBAL_SETTINGS, true);
            return true;
        }

        return false;
    }

    /**
     * Converts all options to map for sending to client.
     */
    @Override
    public OptionsMap toMap() {
        options.chart.renderTo = getUuid();
        return options.toMap();
    }

    /**
     * Convenience method for getting title.
     *
     * @return Title text
     */
    public String getTitle() {
        return options.title.text;
    }

    /**
     * Convenience method for setting title.
     *
     * @param text Title text
     */
    public void setTitle(String text) {
        options.title.text = text;
        updateTitle();
    }

    /**
     * Convenience method for getting subtitle.
     *
     * @return Subtitle text
     */
    public String getSubtitle() {
        return options.subtitle.text;
    }

    /**
     * Convenience method for setting subtitle.
     *
     * @param text Subtitle text
     */
    public void setSubtitle(String text) {
        options.subtitle.text = text;
        updateTitle();
    }

    /**
     * Calls the exportChart function on the chart.
     */
    public void export() {
        ensureRunning("Exporting");
        invokeJS("_export", options.exporting.buttons_exportButton.onclick);
    }

    /**
     * Calls the print function on the chart.
     */
    public void print() {
        ensureRunning("Printing");
        invokeJS("_print", options.exporting.buttons_printButton.onclick);
    }

    /**
     * Invokes the specified widget function, passing the JavaScript snippet as its argument.
     *
     * @param func Widget function name.
     * @param js JavaScript snippet.
     */
    private void invokeJS(String func, String js) {
        invoke(func, Util.toJS(js));
    }

    /**
     * Invokes the specified widget function with the provided argument.
     *
     * @param func Widget function name.
     * @param arg Function argument (may be null);
     */
    private void invoke(String func, Object arg) {
        response(new AuInvoke(this, func, arg));
    }

    /**
     * If the chart is active, dynamically update the title and subtitle.
     */
    private void updateTitle() {
        if (running) {
            OptionsMap map = new OptionsMap();
            map.put("title", options.title);
            map.put("subtitle", options.subtitle);
            invoke("_title", map);
        }
    }

    /**
     * Throws an exception if a chart is not currently running.
     *
     * @param operation The operation to be invoked.
     */
    private void ensureRunning(String operation) {
        if (!running) {
            throw new RuntimeException(operation + " requires an active chart.");
        }
    }

    @Override
    public String getWidgetClass() {
        return "highcharts.ext.Hchart";
    }

    @Override
    public void onPageDetached(Page page) {
        running = false;
        super.onPageDetached(page);
    }

}
