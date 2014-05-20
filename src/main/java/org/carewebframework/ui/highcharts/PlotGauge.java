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
 * Plot options for gauge plot.
 */
public class PlotGauge extends PlotOptions {
    
    /**
     * Options for the dial or arrow pointer of the gauge.
     */
    public final DialOptions dial = new DialOptions();
    
    /**
     * Options for the pivot or the center point of the gauge.
     */
    public final PivotOptions pivot = new PivotOptions();
    
}
