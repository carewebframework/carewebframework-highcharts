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
 * Plot options for plot error bar.
 */
public class PlotErrorBar extends PlotBar {
    
    /**
     * The color of the stem, the vertical line extending from the box to the whiskers. If null, the
     * series color is used. Defaults to null.
     */
    public String stemColor;
    
    /**
     * The dash style of the stem, the vertical line extending from the box to the whiskers.
     * Defaults to Solid.
     */
    public DashStyle stemDashStyle;
    
    /**
     * The width of the stem, the vertical line extending from the box to the whiskers. If null, the
     * width is inherited from the lineWidth option. Defaults to null.
     */
    public Integer stemWidth;
    
    /**
     * The color of the whiskers, the horizontal lines marking low and high values. When null, the
     * general series color is used. Defaults to null.
     */
    public String whiskerColor;
    
    /**
     * The length of the whiskers, the horizontal lines marking low and high values. It can be a
     * numerical pixel value, or a percentage value of the box width. Set 0 to disable whiskers.
     * Defaults to 50%.
     */
    public String whiskerLength;
    
    /**
     * The line width of the whiskers, the horizontal lines marking low and high values. When null,
     * the general lineWidth applies. Defaults to null.
     */
    public Integer whiskerWidth;
}
