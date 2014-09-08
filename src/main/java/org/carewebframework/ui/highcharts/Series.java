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

import java.util.ArrayList;
import java.util.List;

public class Series extends Options {
    
    /**
     * A list of data points. Range series values are given by low and high. Example:
     *
     * <pre>
     * data: [{
     *     name: 'Point 1',
     *     color: '#00FF00',
     *     y: 0
     * }, {
     *     name: 'Point 2',
     *     color: '#FF00FF',
     *     y: 5
     * }]
     * </pre>
     */
    public final List<DataPoint> data = new ArrayList<DataPoint>();
    
    /**
     * The index of the series in the chart, affecting the internal index in the chart.series array,
     * the visible Z index as well as the order in the legend. Defaults to undefined.
     */
    public Integer index;
    
    /**
     * The sequential index of the series in the legend.
     */
    public Integer legendIndex;
    
    /**
     * The name of the series as shown in the legend, tooltip etc. Defaults to "".
     */
    public String name;
    
    /**
     * This option allows grouping series in a stacked chart. The stack option can be a string or a
     * number or anything else, as long as the grouped series' stack options match each other.
     * Defaults to null.
     */
    public Object stack;
    
    /**
     * The type of series. Defaults to "line".
     */
    public final String type;
    
    /**
     * When using dual or multiple x axes, this number defines which xAxis the particular series is
     * connected to. It refers to the index of the axis in the xAxis array, with 0 being the first.
     * Defaults to 0.
     */
    public Integer xAxis;
    
    /**
     * When using dual or multiple y axes, this number defines which yAxis the particular series is
     * connected to. It refers to the index of the axis in the yAxis array, with 0 being the first.
     * Defaults to 0.
     */
    public Integer yAxis;
    
    /**
     * Additional options.
     */
    public transient final PlotOptions plotOptions;
    
    protected Series(String type) {
        this.type = type;
        this.plotOptions = Util.getPlotType(type);
    }
    
    /**
     * Adds a single data point.
     *
     * @param y Y value
     * @return The newly added data point.
     */
    public DataPoint addDataPoint(double y) {
        DataPoint dp = new DataPoint();
        dp.y = y;
        data.add(dp);
        return dp;
    }
    
    /**
     * Adds a single data point.
     *
     * @param x X value
     * @param y Y value
     * @return The newly added data point.
     */
    public DataPoint addDataPoint(double x, double y) {
        DataPoint dp = addDataPoint(y);
        dp.x = x;
        return dp;
    }
    
    /**
     * Adds a list of data point values.
     *
     * @param values Data points to add.
     */
    public void addDataPoints(List<DataPoint> values) {
        data.addAll(values);
    }
    
    /**
     * Adds a list of y values.
     *
     * @param yvalues Y values to add.
     */
    public void addDataPoints(double... yvalues) {
        for (double y : yvalues) {
            addDataPoint(y);
        }
    }
    
    /**
     * Clear all data points.
     */
    public void clear() {
        data.clear();
    }
    
    /**
     * Override to merge plot options into series options.
     */
    @Override
    public OptionsMap toMap() {
        OptionsMap map = super.toMap();
        map.putAll(plotOptions.toMap());
        return map;
    }
}
