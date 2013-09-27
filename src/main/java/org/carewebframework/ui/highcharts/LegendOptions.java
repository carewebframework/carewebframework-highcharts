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
 * The legend is a box containing a symbol and name for each series item or point item in the chart.
 */
public class LegendOptions extends Options {
    
    /**
     * The horizontal alignment of the legend box within the chart area. Defaults to "center".
     */
    public AlignHorizontal align;
    
    /**
     * The background color of the legend, filling the rounded corner border. Defaults to null.
     */
    public String backgroundColor;
    
    /**
     * The color of the drawn border around the legend. Defaults to #909090.
     */
    public String borderColor;
    
    /**
     * The border corner radius of the legend. Defaults to 5.
     */
    public Integer borderRadius;
    
    /**
     * The width of the drawn border around the legend. Defaults to 1.
     */
    public Integer borderWidth;
    
    /**
     * Enable or disable the legend. Defaults to true.
     */
    public Boolean enabled;
    
    /**
     * When the legend is floating, the plot area ignores it and is allowed to be placed below it.
     * Defaults to false.
     */
    public Boolean floating;
    
    /**
     * CSS styles for each legend item when the corresponding series or point is hidden. Properties
     * are inherited from style unless overridden here. Defaults to:
     * 
     * <pre>
     *     color: '#CCC'
     * </pre>
     */
    public final StyleOptions itemHiddenStyle = new StyleOptions();
    
    /**
     * CSS styles for each legend item in hover mode. Properties are inherited from style unless
     * overridden here. Defaults to:
     * 
     * <pre>
     *     color: '#000'
     * </pre>
     */
    public final StyleOptions itemHoverStyle = new StyleOptions();
    
    /**
     * The pixel bottom margin for each legend item. Defaults to 0.
     */
    public Integer itemMarginBottom;
    
    /**
     * The pixel top margin for each legend item. Defaults to 0.
     */
    public Integer itemMarginTop;
    
    /**
     * CSS styles for each legend item. Defaults to:
     * 
     * <pre>
     *     cursor: 'pointer'
     *     color: '#3E576F'
     * </pre>
     */
    public final StyleOptions itemStyle = new StyleOptions();
    
    /**
     * The width for each legend item. This is useful in a horizontal layout with many items when
     * you want the items to align vertically. . Defaults to null.
     */
    public Integer itemWidth;
    
    /**
     * Callback function to format each of the series' labels.
     */
    @JavaScript
    public String labelFormatter;
    
    /**
     * The layout of the legend items. Can be one of "horizontal" or "vertical". Defaults to
     * "horizontal".
     */
    public Orientation layout;
    
    /**
     * If the plot area sized is calculated automatically and the legend is not floating, the legend
     * margin is the space between the legend and the axis labels or plot area. Defaults to 15.
     */
    public Integer margin;
    
    /**
     * Maximum pixel height for the legend. When the maximum height is extended, navigation will
     * show. Defaults to undefined.
     */
    public Integer maxHeight;
    
    /**
     * Options for the paging or navigation appearing when the legend has overflowed.
     */
    public final LegendNavigationOptions navigation = new LegendNavigationOptions();
    
    /**
     * The inner padding of the legend box. Defaults to 8.
     */
    public Integer padding;
    
    /**
     * Whether to reverse the order of the legend items compared to the order of the series or
     * points as defined in the configuration object. Defaults to false.
     */
    public Boolean reversed;
    
    /**
     * Whether to show the symbol on the right side of the text rather than the left side. This is
     * common in Arabic and Hebraic. Defaults to false.
     */
    public Boolean rtl;
    
    /**
     * Whether to apply a drop shadow to the legend. A backgroundColor also needs to be applied for
     * this to take effect. Since 2.3 the shadow can be an object configuration containing color,
     * offsetX, offsetY, opacity and width. Defaults to false.
     */
    public Object shadow;
    
    /**
     * The pixel padding between the legend item symbol and the legend item text. Defaults to 5.
     */
    public Integer symbolPadding;
    
    /**
     * The pixel width of the legend item symbol. Defaults to 30.
     */
    public Integer symbolWidth;
    
    /**
     * The vertical alignment of the legend box. Can be one of "top", "middle" or "bottom". Vertical
     * position can be further determined by the y option. Defaults to "bottom".
     */
    public AlignVertical verticalAlign;
    
    /**
     * The width of the legend box, not including style.padding. . Defaults to null.
     */
    public Integer width;
    
    /**
     * The x offset of the legend relative to it's horizontal alignment align within
     * chart.spacingLeft and chart.spacingRight. Negative x moves it to the left, positive x moves
     * it to the right. The default value of 15 together with align: "center" puts it in the center
     * of the plot area. Defaults to 0.
     */
    public Integer x;
    
    /**
     * The vertical offset of the legend relative to it's vertical alignment verticalAlign within
     * chart.spacingTop and chart.spacingBottom. Negative y moves it up, positive y moves it down.
     * Defaults to 0.
     */
    public Integer y;
}
