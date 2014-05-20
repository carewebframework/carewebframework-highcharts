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
public class PlotSolidGauge extends PlotType {
    
    /**
     * Allow the dial to overshoot the end of the perimeter axis by this many degrees. Say if the
     * gauge axis goes from 0 to 60, a value of 100, or 1000, will show 5 degrees beyond the end of
     * the axis. Defaults to 0.
     */
    public Double overshoot;

    /**
     * When this option is true, the dial will wrap around the axes. For instance, in a full-range
     * gauge going from 0 to 360, a value of 400 will point to 40. When wrap is false, the dial
     * stops at 360. Defaults to true.
     */
    public Boolean wrap;
    
}
