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

import java.util.ArrayList;
import java.util.List;

/**
 * Applies only to polar charts and angular gauges. This configuration object holds general options
 * for the combined X and Y axes set. Each xAxis or yAxis can reference the pane by index.
 */
public class PaneOptions extends Options {
    
    /**
     * An object, or array of objects, for backgrounds. Sub options include backgroundColor (which
     * can be solid or gradient), innerWidth, outerWidth, borderWidth, borderColor.
     */
    public final List<Object> background = new ArrayList<Object>();
    
    /**
     * The center of a polar chart or angular gauge, given as an array of [x, y] positions.
     * Positions can be given as integers that transform to pixels, or as percentages of the plot
     * area size. Defaults to ['50%', '50%'].
     */
    public final List<String> center = new ArrayList<String>();
    
    /**
     * The end angle of the polar X axis or gauge value axis, given in degrees where 0 is north.
     * Defaults to startAngle + 360.
     */
    public Integer endAngle;
    
    /**
     * The start angle of the polar X axis or gauge axis, given in degrees where 0 is north.
     * Defaults to 0.
     */
    public Integer startAngle;
}
