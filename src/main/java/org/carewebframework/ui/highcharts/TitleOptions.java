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

public class TitleOptions extends Options {
    
    /**
     * The horizontal alignment of the title or subtitle. Can be one of "left", "center" and
     * "right". Defaults to "center".
     */
    public AlignHorizontal align;
    
    /**
     * When the title or subtitle is floating, the plot area will not move to make space for it.
     * Defaults to false.
     */
    public Boolean floating;
    
    /**
     * The margin between the title and the plot area, or if a subtitle is present, the margin
     * between the subtitle and the plot area. Defaults to 15. Ignored for subtitles.
     */
    public Integer margin;
    
    /**
     * CSS styles for the title or subtitle. Use this for font styling, but use align, x and y for
     * text alignment. Defaults to:
     * 
     * <pre>
     *     color: '#3E576F'
     *     fontSize: '16px' (title only)
     * </pre>
     */
    public final StyleOptions style = new StyleOptions();
    
    /**
     * The title or subtitle of the chart. To disable, set the text to null. Defaults to
     * "Chart title" for title and "" for subtitle.
     */
    public String text;
    
    /**
     * The vertical alignment of the title or subtitle. Can be one of "top", "middle" and "bottom".
     * Defaults to "top".
     */
    public AlignVertical verticalAlign;
    
    /**
     * The x position of the title or subtitle relative to the alignment within chart.spacingLeft
     * and chart.spacingRight. Defaults to 0.
     */
    public Integer x;
    
    /**
     * The y position of the subtitle relative to the alignment within chart.spacingTop and
     * chart.spacingBottom. Defaults to 15 for title and 30 for subtitle.
     */
    public Integer y;
}
