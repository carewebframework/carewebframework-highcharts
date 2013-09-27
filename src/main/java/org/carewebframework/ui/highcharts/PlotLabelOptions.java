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
 * Options for text labels for plot bands or plot lines.
 */
public class PlotLabelOptions extends Options {
    
    /**
     * Horizontal alignment of the label. Can be one of "left", "center" or "right". Defaults to
     * "center".
     */
    public AlignHorizontal align;
    
    /**
     * Rotation of the text label in degrees . Defaults to 0.
     */
    public Integer rotation;
    
    /**
     * CSS styles for the text label.
     */
    public final StyleOptions style = new StyleOptions();
    
    /**
     * The string text itself. A subset of HTML is supported.
     */
    public String text;
    
    /**
     * The text alignment for the label. While align determines where the texts anchor point is
     * placed within the plot band, textAlign determines how the text is aligned against its anchor
     * point. Possible values are "left", "center" and "right". Defaults to the same as the align
     * option.
     */
    public AlignHorizontal textAlign;
    
    /**
     * Vertical alignment of the label relative to the plot band. Can be one of "top", "middle" or
     * "bottom". Defaults to "top".
     */
    public AlignVertical verticalAlign;
    
    /**
     * Horizontal position relative the alignment. Default varies by orientation.
     */
    public Integer x;
    
    /**
     * Vertical position of the text baseline relative to the alignment. Default varies by
     * orientation.
     */
    public Integer y;
}
