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
 * Options for axis labels.
 */
public class AxisLabelOptions extends Options {
    
    /**
     * What part of the string the given position is anchored to. Can be one of "left", "center" or
     * "right". In inverted charts, x axis label alignment and y axis alignment are swapped.
     * Defaults to "center".
     */
    public AlignHorizontal align;
    
    /**
     * Enable or disable the axis labels. Defaults to true.
     */
    public Boolean enabled;
    
    /**
     * Callback JavaScript function to format the label.
     */
    @JavaScript
    public String formatter;
    
    /**
     * How to handle overflowing labels on horizontal axis. Can be undefined or "justify". If
     * "justify", labels will not render outside the plot area. If there is room to move it, it will
     * be aligned to the edge, else it will be removed. Defaults to undefined.
     */
    public String overflow;
    
    /**
     * Rotation of the labels in degrees. Defaults to 0.
     */
    public Integer rotation;
    
    /**
     * Horizontal axes only. The number of lines to spread the labels over to make room or tighter
     * labels. . Defaults to null.
     */
    public Integer staggerLines;
    
    /**
     * To show only every n'th label on the axis, set the step to n. Setting the step to 2 shows
     * every other label. Defaults to null.
     */
    public Integer step;
    
    /**
     * CSS styles for the label. Defaults to:
     * 
     * <pre>
     *     color: '#6D869F',
     *     fontWeight: 'bold'
     * </pre>
     */
    public final StyleOptions style = new StyleOptions();
    
    /**
     * The x position offset of the label relative to the tick position on the axis. Defaults to 0.
     */
    public Integer x;
    
    /**
     * The y position offset of the label relative to the tick position on the axis. Defaults to 0.
     */
    public Integer y;
}
