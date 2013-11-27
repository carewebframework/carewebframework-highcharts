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
 * Plot options for bubble plot.
 */
public class PlotBubble extends PlotType {
    
    /**
     * Whether to display negative sized bubbles. The threshold is given by the zThreshold option,
     * and negative bubbles can be visualized by setting negativeColor. Defaults to true.
     */
    public Boolean displayNegative;
    
    /**
     * Maximum bubble size. Bubbles will automatically size between the minSize and maxSize to
     * reflect the z value of each bubble. Can be either pixels (when no unit is given), or a
     * percentage of the smallest one of the plot width and height. Defaults to 20%.
     */
    public String maxSize;
    
    /**
     * Minimum bubble size. Bubbles will automatically size between the minSize and maxSize to
     * reflect the z value of each bubble. Can be either pixels (when no unit is given), or a
     * percentage of the smallest one of the plot width and height. Defaults to 8.
     */
    public String minSize;
    
    /**
     * Whether the bubble's value should be represented by the area or the width of the bubble. The
     * default, area, corresponds best to the human perception of the size of each bubble. Defaults
     * to area.
     */
    public String sizeBy;
    
    /**
     * When displayNegative is false, bubbles with lower Z values are skipped. When displayNegative
     * is true and a negativeColor is given, points with lower Z is colored. Defaults to 0.
     */
    public Double zThreshold;
}
