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
 * Options for tooltip rendering.
 */
public class TooltipOptions extends Options {
    
    /**
     * Enable or disable animation of the tooltip. In old browsers combined with data-heavy charts,
     * the animation may be slow, so turning it off can be a good idea. Defaults to true.
     */
    public Boolean animation;
    
    /**
     * The background color or gradient for the tooltip. Defaults to "rgba(255, 255, 255, .85)".
     */
    public String backgroundColor;
    
    /**
     * The color of the tooltip border. When null, the border takes the color of the corresponding
     * series or point. Defaults to "auto".
     */
    public String borderColor;
    
    /**
     * The radius of the rounded border corners. Defaults to 5.
     */
    public Integer borderRadius;
    
    /**
     * The pixel width of the tooltip border. Defaults to 2.
     */
    public Integer borderWidth;
    
    /**
     * Display crosshairs to connect the points with their corresponding axis values. The crosshairs
     * can be defined as a boolean, an array of booleans or an object.
     * <ul>
     * <li>Boolean</li> If the crosshairs option is true, a single crosshair relating to the x axis
     * will be shown.
     * <li>Array of booleans</li> In an array of booleans, the first value turns on the x axis
     * crosshair and the second value to the y axis crosshair. Use [true, true] to show complete
     * crosshairs.
     * <li>Array of objects</li> In an array of objects, the first value applies to the x axis
     * crosshair and the second value to the y axis crosshair. For each dimension, a width, color,
     * dashStyle and zIndex can be given.
     * </ul>
     * Defaults to null.
     */
    public Object crosshairs;
    
    /**
     * Enable or disable the tooltip. Defaults to true.
     */
    public Boolean enabled;
    
    /**
     * A string to append to the tooltip format.
     */
    public String footerFormat;
    
    /**
     * Callback function to format the text of the tooltip.
     */
    @JavaScript
    public String formatter;
    
    /**
     * Not sure if this is supported?
     */
    public String headerFormat;
    
    /**
     * The HTML of the point's line in the tooltip. Variables are enclosed by curly brackets.
     * Available variables are point.x, point.y, series.name and series.color and other properties
     * on the same form. Furthermore, point.y can be extended by the tooltip.yPrefix and
     * tooltip.ySuffix variables. This can also be overridden for each series, which makes it a good
     * hook for displaying units. Defaults to
     * <code>&lt;span style="color:{series.color}">{series.name}&lt;/span>: &lt;b>{point.y}&lt;/b><br/>}</code>
     */
    public String pointFormat;
    
    /**
     * A callback function to place the tooltip in a default position.
     */
    @JavaScript
    public String positioner;
    
    /**
     * Whether to apply a drop shadow to the tooltip. Defaults to true.
     */
    public Boolean shadow;
    
    /**
     * When the tooltip is shared, the entire plot area will capture mouse movement, and tooltip
     * texts for all series will be shown in a single bubble. This is recommended for single series
     * charts and for iPad optimized sites. Defaults to false.
     */
    public Boolean shared;
    
    /**
     * Proximity snap for graphs or single points. Does not apply to bars, columns and pie slices.
     * It defaults to 10 for mouse-powered devices and 25 for touch devices. Defaults to 10/25.
     */
    public Integer snap;
    
    /**
     * CSS styles for the tooltip. The tooltip can also be styled through the CSS class
     * .highcharts-tooltip. Default value:
     * 
     * <pre>
     * style: {
     *     color: '#333333',
     *     fontSize: '9pt',
     *     padding: '5px'
     * }
     * </pre>
     */
    public final StyleOptions style = new StyleOptions();
    
    /**
     * Use HTML to render the contents of the tooltip instead of SVG. Using HTML allows advanced
     * formatting like tables and images in the tooltip. It is also recommended for rtl languages as
     * it works around rtl bugs in early Firefox. Defaults to false.
     */
    public Boolean useHTML;
    
    /**
     * How many decimals to show in each series' y value. This is overridable in each series'
     * tooltip options object. The default is to preserve all decimals.
     */
    public Integer valueDecimals;
    
    /**
     * A string to prepend to each series' y value. Overridable in each series' tooltip options
     * object. Defaults to "".
     */
    public String valuePrefix;
    
    /**
     * A string to append to each series' y value. Overridable in each series' tooltip options
     * object. Defaults to "".
     */
    public String valueSuffix;
    
    /**
     * The format for the date in the tooltip header if the X axis is a datetime axis. The default
     * is a best guess based on the smallest distance between points in the chart.
     */
    public String xDateFormat;
    
}
