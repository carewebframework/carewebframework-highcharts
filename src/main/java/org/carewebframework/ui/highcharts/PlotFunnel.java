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
 * Plot options for funnel plot.
 */
public class PlotFunnel extends PlotPie {
    
    /**
     * The height of the neck, the lower part of a funnel. If it is a number it defines the pixel
     * height, if it is a percentage string it is the percentage of the plot area height.
     */
    public String height;
    
    /**
     * Equivalent to chart.ignoreHiddenSeries, this option tells whether the series shall be redrawn
     * as if the hidden point were null. The default value is true.
     */
    public Boolean ignoreHiddenPoint;
    
    /**
     * The height of the neck, the lower part of the funnel. A number defines pixel width, a
     * percentage string defines a percentage of the plot area height. Defaults to 25%.
     */
    public String neckHeight;
    
    /**
     * The width of the neck, the lower part of the funnel. A number defines pixel width, a
     * percentage string defines a percentage of the plot area width.
     */
    public String neckWidth;
    
}
