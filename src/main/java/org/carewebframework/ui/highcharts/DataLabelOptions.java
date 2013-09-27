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
 * Options for data labels.
 */
public class DataLabelOptions extends Options {
    
    /**
     * The alignment of the data label compared to the point. Can be one of "left", "center" or
     * "right". Defaults to "center".
     */
    public AlignHorizontal align;
    
    /**
     * The background color or gradient for the data label. Defaults to undefined.
     */
    public String backgroundColor;
    
    /**
     * The border color for the data label. Defaults to undefined.
     */
    public String borderColor;
    
    /**
     * The border radius in pixels for the data label. Defaults to 0.
     */
    public Integer borderRadius;
    
    /**
     * The border width in pixels for the data label. Defaults to 0.
     */
    public Integer borderWidth;
    
    /**
     * The text color for the data labels. Defaults to null.
     */
    public String color;
    
    /**
     * Enable or disable the data labels. Defaults to false.
     */
    public Boolean enabled;
    
    /**
     * Callback JavaScript function to format the data label.
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
     * When either the borderWidth or the backgroundColor is set, this is the padding within the
     * box. Defaults to 2. Defaults to 2.
     */
    public Integer padding;
    
    /**
     * Rotation of the labels in degrees. Defaults to 0.
     */
    public Integer rotation;
    
    /**
     * The shadow of the box. Works best with borderWidth or backgroundColor. The shadow can be an
     * object configuration containing color, offsetX, offsetY, opacity and width. Defaults to
     * false.
     */
    public Object shadow;
    
    /**
     * CSS styles for the label.
     */
    public final StyleOptions style = new StyleOptions();
    
    /**
     * The x position offset of the label relative to the point. Defaults to 0.
     */
    public Integer x;
    
    /**
     * The y position offset of the label relative to the point. Defaults to -6.
     */
    public Integer y;
}
