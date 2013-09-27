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
 * Highchart by default puts a credits label in the lower right corner of the chart. This can be
 * changed using these options.
 */
public class CreditsOptions extends Options {
    
    /**
     * Whether to show the credits text. Defaults to false.
     */
    public Boolean enabled = false;
    
    /**
     * The URL for the credits label. Defaults to "http://www.highcharts.com".
     */
    public String href;
    
    /**
     * Position configuration for the credits label.
     * 
     * @see CreditsPositionOptions
     */
    public final CreditsPositionOptions position = new CreditsPositionOptions();
    
    /**
     * CSS styles for the credits label. Defaults to:
     * 
     * <pre>
     *     cursor: 'pointer'
     *     color: '#909090'
     *     fontSize: '10px'
     * </pre>
     */
    public final StyleOptions style = new StyleOptions();
    
    /**
     * The text for the credits label. Defaults to "Highcharts.com".
     */
    public String text;
}
