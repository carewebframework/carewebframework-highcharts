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
 * Plot options for pie series.
 */
public class PlotPie extends PlotType {
    
    /**
     * The color of the border surronding each slice. Defaults to "#FFFFFF".
     */
    public String borderColor;
    
    /**
     * The width of the border surronding each slice. Defaults to 1.
     */
    public Integer borderWidth;
    
    /**
     * The center of the pie chart relative to the plot area. Can be percentages or pixel values.
     * Defaults to ['50%', '50%'].
     */
    public String[] center;
    
    /**
     * The size of the inner diameter for the pie. A size greater than 0 renders a doughnut chart.
     * Can be a percentage or pixel value. Percentages are relative to the size of the plot area.
     * Pixel values are given as integers. Defaults to 0.
     */
    public String innerSize;
    
    /**
     * The diameter of the pie relative to the plot area. Can be a percentage or pixel value. Pixel
     * values are given as integers. Defaults to "75%".
     */
    public String size;
    
    /**
     * If a point is sliced, moved out from the center, how many pixels should it be moved?.
     * Defaults to 10.
     */
    public Integer slicedOffset;
}
