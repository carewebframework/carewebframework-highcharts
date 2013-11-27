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
 * Plot options for box plot.
 */
public class PlotBox extends PlotBar {
    
    /**
     * The fill color of the box. Defaults to #FFFFFF.
     */
    public String fillColor;
    
    /**
     * The color of the median line. If null, the general series color applies. Defaults to null.
     */
    public String medianColor;
    
    /**
     * The pixel width of the median line. If null, the lineWidth is used. Defaults to 2.
     */
    public Integer medianWidth;
    
}
