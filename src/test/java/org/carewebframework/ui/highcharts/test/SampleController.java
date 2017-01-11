package org.carewebframework.ui.highcharts.test;

import java.util.Arrays;

import org.carewebframework.ui.highcharts.AlignHorizontal;
import org.carewebframework.ui.highcharts.AlignVertical;
import org.carewebframework.ui.highcharts.Axis;
import org.carewebframework.ui.highcharts.Chart;
import org.carewebframework.ui.highcharts.Orientation;
import org.carewebframework.ui.highcharts.PlotLineOptions;
import org.carewebframework.ui.highcharts.Series;
import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.util.GenericForwardComposer;

/**
 * Controller that demonstrates how to implement one of the
 * <a href="http://www.highcharts.com/demo/line-basic">examples</a> from the HighCharts
 * documentation.
 */
public class SampleController extends GenericForwardComposer<Component> {
    
    private static final long serialVersionUID = 1L;
    
    private static final String[] CATEGORIES = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov",
            "Dec" };
    
    private static final Double[] TOKYO = { 7.0, 6.9, 9.5, 14.5, 18.2, 21.5, 25.2, 26.5, 23.3, 18.3, 13.9, 9.6 };
    
    private static final Double[] NEW_YORK = { -0.2, 0.8, 5.7, 11.3, 17.0, 22.0, 24.8, 24.1, 20.1, 14.1, 8.6, 2.5 };
    
    private static final Double[] BERLIN = { -0.9, 0.6, 3.5, 8.4, 13.5, 17.0, 18.6, 17.9, 14.3, 9.0, 3.9, 1.0 };
    
    private static final Double[] LONDON = { 3.9, 4.2, 5.7, 8.5, 11.9, 15.2, 17.0, 16.6, 14.2, 10.3, 6.6, 4.8 };
    
    private Chart chart;
    
    @Override
    public void doAfterCompose(Component comp) throws Exception {
        super.doAfterCompose(comp);
        chart.setTitle("Monthly Average Temperature");
        chart.setSubtitle("Source: WorldClimate.com");
        Axis xAxis = chart.getXAxis();
        xAxis.categories.addAll(Arrays.asList(CATEGORIES));
        Axis yAxis = chart.getYAxis();
        yAxis.title.text = "Temperature (°C)";
        PlotLineOptions plo = new PlotLineOptions();
        yAxis.plotLines.add(plo);
        plo.value = 0.0;
        plo.width = 1;
        plo.color = "#808080";
        chart.options.tooltip.valueSuffix = "°C";
        chart.options.legend.layout = Orientation.vertical;
        chart.options.legend.align = AlignHorizontal.right;
        chart.options.legend.verticalAlign = AlignVertical.middle;
        chart.options.legend.borderWidth = 0;
        addSeries("Tokyo", TOKYO);
        addSeries("New York", NEW_YORK);
        addSeries("Berlin", BERLIN);
        addSeries("London", LONDON);
        chart.run();
    }
    
    private void addSeries(String name, Double[] data) {
        Series series = chart.addSeries();
        series.name = name;
        
        for (Double value : data) {
            series.addDataPoint(value);
        }
    }
    
}
