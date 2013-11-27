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

public class DialOptions extends Options {
    
    /**
     * The background or fill color of the gauge's dial. Defaults to black.
     */
    public String backgroundColor;
    
    /**
     * The length of the dial's base part, relative to the total radius or length of the dial.
     * Defaults to 70%.
     */
    public String baseLength;
    
    /**
     * The pixel width of the base of the gauge dial. The base is the part closest to the pivot,
     * defined by baseLength. Defaults to 3.
     */
    public Integer baseWidth;
    
    /**
     * The border color or stroke of the gauge's dial. By default, the borderWidth is 0, so this
     * must be set in addition to a custom border color. Defaults to silver.
     */
    public String borderColor;
    
    /**
     * The width of the gauge dial border in pixels. Defaults to 0.
     */
    public Integer borderWidth;
    
    /**
     * The radius or length of the dial, in percentages relative to the radius of the gauge itself.
     * Defaults to 80%.
     */
    public String radius;
    
    /**
     * The length of the dial's rear end, the part that extends out on the other side of the pivot.
     * Relative to the dial's length. Defaults to 10%.
     */
    public String rearLength;
    
    /**
     * The width of the top of the dial, closest to the perimeter. The pivot narrows in from the
     * base to the top. Defaults to 1.
     */
    public String topWidth;
}
