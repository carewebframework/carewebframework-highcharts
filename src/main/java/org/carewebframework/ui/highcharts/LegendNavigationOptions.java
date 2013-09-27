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
 * Options for the paging or navigation appearing when the legend overflows.
 */
public class LegendNavigationOptions extends Options {
    
    /**
     * The color for the active up or down arrow in the legend page navigation. Defaults to #3E576F.
     */
    public String activeColor;
    
    /**
     * How to animate the pages when navigating up or down. A value of true applies the default
     * navigation given in the chart.animation option. Additional options can be given as an object
     * containing values for easing and duration. Defaults to true.
     */
    public Boolean animation;
    
    /**
     * The pixel size of the up and down arrows in the legend paging navigation. Defaults to 12.
     */
    public Integer arrowSize;
    
    /**
     * The color of the inactive up or down arrow in the legend page navigation. Defaults to #CCC.
     */
    public String inactiveColor;
    
    /**
     * Text styles for the legend page navigation.
     */
    public final StyleOptions style = new StyleOptions();
}
