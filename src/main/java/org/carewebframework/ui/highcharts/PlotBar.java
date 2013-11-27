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
 * Plot options for bar series.
 */
public class PlotBar extends PlotType {
    
    /**
     * The color of the border surrounding each column or bar. Defaults to "#FFFFFF".
     */
    public String borderColor;
    
    /**
     * The corner radius of the border surrounding each column or bar. Defaults to 0.
     */
    public Integer borderRadius;
    
    /**
     * The width of the border surrounding each column or bar. Defaults to 1.
     */
    public Integer borderWidth;
    
    /**
     * Padding between each value groups, in x axis units. Defaults to 0.2.
     */
    public Double groupPadding;
    
    /**
     * Whether to group non-stacked columns or to let them render independent of each other.
     * Non-grouped columns will be laid out individually and overlap each other. Defaults to true.
     */
    public Boolean grouping;
    
    /**
     * The minimal height for a column or width for a bar. By default, 0 values are not shown. To
     * visualize a 0 (or close to zero) point, set the minimal point length to a pixel value like 3.
     * In stacked column charts, minPointLength might not be respected for tightly packed values.
     * Defaults to 0.
     */
    public Integer minPointLength;
    
    /**
     * Padding between each column or bar, in x axis units. Defaults to 0.1.
     */
    public Double pointPadding;
    
    /**
     * The X axis range that each point is valid for. This determines the width of the column. On a
     * categorized axis, the range will be 1 by default (one category unit). On linear and datetime
     * axes, the range will be computed as the distance between the two closest data points.
     */
    public Double pointRange;
    
    /**
     * A pixel value specifying a fixed width for each column or bar. When null, the width is
     * calculated from the pointPadding and groupPadding. Defaults to null.
     */
    public Integer pointWidth;
    
}
