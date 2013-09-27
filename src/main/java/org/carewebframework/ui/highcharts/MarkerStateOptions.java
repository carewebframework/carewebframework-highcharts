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
 * Options for marker hover and select states.
 */
public class MarkerStateOptions extends Options {
    
    /**
     * Enable or disable the point marker. Defaults to true.
     */
    public Boolean enabled;
    
    /**
     * The fill color of the point marker. When null, the series' or point's color is used. Defaults
     * to null.
     */
    public String fillColor;
    
    /**
     * The color of the point marker's outline. When null, the series' or point's color is used.
     * Defaults to "#FFFFFF".
     */
    public String lineColor;
    
    /**
     * The width of the point marker's outline. Defaults to 0.
     */
    public Integer lineWidth;
    
    /**
     * The radius of the point marker. In hover state, it defaults to the normal state's radius + 2.
     */
    public Integer radius;
    
}
