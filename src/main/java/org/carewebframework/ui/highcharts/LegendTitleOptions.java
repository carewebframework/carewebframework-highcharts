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

public class LegendTitleOptions extends Options {
    
    /**
     * Generic CSS styles for the legend title. Defaults to:
     * 
     * <pre>
     * style: {
     *    fontWeight: 'bold'
     * }
     * </pre>
     */
    public final StyleOptions style = new StyleOptions();
    
    /**
     * A text or HTML string for the title. Defaults to null.
     */
    public String text;
    
}
