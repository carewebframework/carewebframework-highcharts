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

public class PivotOptions extends Options {
    
    /**
     * The background color or fill of the pivot. Defaults to black.
     */
    public String backgroundColor;
    
    /**
     * The border or stroke color of the pivot. In able to change this, the borderWidth must also be
     * set to something other than the default 0. Defaults to silver.
     */
    public String borderColor;
    
    /**
     * The border or stroke width of the pivot. Defaults to 0.
     */
    public Integer borderWidth;
    
    /**
     * The pixel radius of the pivot. Defaults to 5.
     */
    public Integer radius;
    
}
