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
 * Options for shadow effect.
 */
public class ShadowOptions extends Options {
    
    /**
     * Color of shadow.
     */
    public String color;
    
    /**
     * X offset for shadow.
     */
    public Integer offsetX;
    
    /**
     * Y offset for shadow.
     */
    public Integer offsetY;
    
    /**
     * Opacity factor for shadow.
     */
    public Double opacity;
    
    /**
     * Pixel width of shadow.
     */
    public Integer width;
}
