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

/**
 * Base class for all plot types.
 */
public abstract class PlotType extends Options {
    
    /**
     * Allow this series' points to be selected by clicking on the markers, bars or pie slices.
     * Defaults to false.
     */
    public Boolean allowPointSelect;
    
    /**
     * Enable or disable the initial animation when a series is displayed. Since version 2.1, the
     * animation can be set as a configuration object. Please note that this option only applies to
     * the initial animation of the series itself. For other animations, see #chart.animation and
     * the animation parameter under the API methods. The following properties are supported:
     * 
     * <pre>
     * <b>duration</b> The duration of the animation in milliseconds. 
     * <b>easing</b> When using jQuery as the set to linear or swing. More easing functions are
     * available with the use of jQuery plug-ins, most notably the jQuery UI suite. See the jQuery
     * docs. When using MooToos as the general framework, use the property name transition instead
     * of easing.
     * </pre>
     * 
     * For polar charts, the animation is disabled in legacy IE browsers. Defaults to true.
     */
    public Boolean animation;
    
    /**
     * The main color or the series. In line type series it applies to the line and the point
     * markers unless otherwise specified. In bar type series it applies to the bars unless a color
     * is specified per point. The default value is pulled from the options.colors array.
     */
    public String color;
    
    /**
     * Polar charts only. Whether to connect the ends of a line series plot across the extremes.
     * Defaults to true.
     */
    public Boolean connectEnds;
    
    /**
     * Whether to connect a graph line across null points. Defaults to false.
     */
    public Boolean connectNulls;
    
    /**
     * When the series contains less points than the crop threshold, all points are drawn, event if
     * the points fall outside the visible plot area at the current zoom. The advantage of drawing
     * all points (including markers and columns), is that animation is performed on updates. On the
     * other hand, when the series contains more points than the crop threshold, the series data is
     * cropped to only contain points that fall within the plot area. The advantage of cropping away
     * invisible points is to increase performance on large series. . Defaults to 300.
     */
    public Double cropThreshold;
    
    /**
     * You can set the cursor to "pointer" if you have click events attached to the series, to
     * signal to the user that the points and lines can be clicked. Defaults to ''.
     */
    public String cursor;
    
    /**
     * A name for the dash style to use for the graph. Applies only to series type having a graph,
     * like line, spline, area and scatter in case it has a lineWidth. The value for the dashStyle
     * include:
     * <ul>
     * <li>Solid</li>
     * <li>ShortDash</li>
     * <li>ShortDot</li>
     * <li>ShortDashDot</li>
     * <li>ShortDashDotDot</li>
     * <li>Dot</li>
     * <li>Dash</li>
     * <li>LongDash</li>
     * <li>DashDot</li>
     * <li>LongDashDot</li>
     * <li>LongDashDotDot</li>
     * </ul>
     * Defaults to null.
     */
    public DashStyle dashStyle;
    
    /**
     * Options for data labels.
     * 
     * @see DataLabelOptions
     */
    public final DataLabelOptions dataLabels = new DataLabelOptions();
    
    /**
     * Enable or disable the mouse tracking for a specific series. This includes point tooltips and
     * click events on graphs and points. For large datasets it improves performance. Defaults to
     * true.
     */
    public Boolean enableMouseTracking;
    
    /**
     * An id for the series. Defaults to null.
     */
    public String id;
    
    /**
     * Pixel with of the graph line. Defaults to 2.
     */
    public Integer lineWidth;
    
    /**
     * Options for point markers.
     * 
     * @see MarkerOptions
     */
    public final MarkerOptions marker = new MarkerOptions();
    
    /**
     * If no x values are given for the points in a series, pointInterval defines the interval of
     * the x values. For example, if a series contains one value every decade starting from year 0,
     * set pointInterval to 10. Defaults to 1.
     */
    public Double pointInterval;
    
    /**
     * Possible values: null, "on", "between". In a column chart, when pointPlacement is "on", the
     * point will not create any padding of the X axis. In a polar column chart this means that the
     * first column points directly north. If the pointPlacement is "between", the columns will be
     * laid out between ticks. This is useful for example for visualising an amount between two
     * points in time or in a certain sector of a polar chart. Defaults to null in cartesian charts,
     * "between" in polar charts.
     */
    public String pointPlacement;
    
    /**
     * If no x values are given for the points in a series, pointStart defines on what value to
     * start. For example, if a series contains one yearly value starting from 1945, set pointStart
     * to 1945. Defaults to 0.
     */
    public Double pointStart;
    
    /**
     * Whether to select the series initially. If showCheckbox is true, the checkbox next to the
     * series name will be checked for a selected series. Defaults to false.
     */
    public Boolean selected;
    
    /**
     * Boolean value whether to apply a drop shadow to the graph line. Optionally can be a
     * ShadowOptions object. Defaults to true.
     * 
     * @see ShadowOptions
     */
    public Object shadow;
    
    /**
     * If true, a checkbox is displayed next to the legend item to allow selecting the series. The
     * state of the checkbox is determined by the selected option. Defaults to false.
     */
    public Boolean showCheckbox;
    
    /**
     * Whether to display this particular series or series type in the legend. Defaults to true.
     */
    public Boolean showInLegend;
    
    /**
     * Whether to stack the values of each series on top of each other. Possible values are null to
     * disable, "normal" to stack by value or "percent". Defaults to null.
     */
    public String stacking;
    
    /**
     * Sticky tracking of mouse events. When true, the mouseOut event on a series isn't triggered
     * until the mouse moves over another series, or out of the plot area. When false, the mouseOut
     * event on a series is triggered when the mouse leaves the area around the series' graph or
     * markers. This also implies the tooltip. When stickyTracking is false and tooltip.shared is
     * false, the tooltip will be hidden when moving the mouse between series. Defaults to true.
     */
    public Boolean stickyTracking;
    
    /**
     * A configuration object for the tooltip rendering of each single series.
     */
    public final TooltipOptions tooltip = new TooltipOptions();
    
    /**
     * When a series contains a data array that is longer than this, only one dimensional arrays of
     * numbers, or two dimensional arrays with x and y values are allowed. Also, only the first
     * point is tested, and the rest are assumed to be the same format. This saves expensive data
     * checking and indexing in long series. Defaults to 1000.
     */
    public Integer turboThreshold;
    
    /**
     * Set the initial visibility of the series. Defaults to true.
     */
    public Boolean visible;
    
    /**
     * Define the z index of the series. Defaults to null.
     */
    public Integer zIndex;
    
}
