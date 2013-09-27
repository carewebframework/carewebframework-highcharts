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
 * A linear gradient that lets us create gradients in plot bands instead of just using solid colors.
 * I only put the properties I needed into this class. The highcharts' javascript class has more
 * properties than this so feel free to add them if you need to. According to:
 * http://www.w3.org/TR/SVG/pservers.html#LinearGradients linear gradients are defined as a line in
 * a coordinate system that has its origin in the top left (0, 0) and with (1, 1) being in the
 * bottom right. In other words, it starts in the top left and as you go to the right, x increases
 * and as you go down, y increases.
 */
public class LinearGradient extends Options {
    
    /**
     * The x1 coordinate of the line that defines the gradient.
     */
    public Double x1;
    
    /**
     * The y1 coordinate of the line that defines the gradient.
     */
    public Double y1;
    
    /**
     * The x2 coordinate of the line that defines the gradient.
     */
    public Double x2;
    
    /**
     * The y2 coordinate of the line that defines the gradient.
     */
    public Double y2;
    
}
