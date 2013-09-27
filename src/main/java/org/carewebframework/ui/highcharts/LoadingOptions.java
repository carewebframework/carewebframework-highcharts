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
 * The loading options control the appearance of the loading screen that covers the plot area on
 * chart operations. This screen only appears after an explicit call to chart.showLoading(). It is a
 * utility for developers to communicate to the end user that something is going on, for example
 * while retrieving new data via an XHR connection. The "Loading..." text itself is not part of this
 * configuration object, but part of the lang object.
 */
public class LoadingOptions extends Options {
    
    /**
     * The duration in milliseconds of the fade out effect. Defaults to 100.
     */
    public Integer hideDuration;
    
    /**
     * CSS styles for the loading label span. Defaults to:
     * 
     * <pre>
     *     fontWeight: 'bold'
     *     position: 'relative'
     *     top: '1em'
     * </pre>
     */
    public final StyleOptions labelStyle = new StyleOptions();
    
    /**
     * The duration in milliseconds of the fade in effect. Defaults to 100.
     */
    public Integer showDuration;
    
    /**
     * CSS styles for the loading screen that covers the plot area. Defaults to:
     * 
     * <pre>
     *     position: 'absolute',
     *     backgroundColor: 'white',
     *     opacity: 0.5,
     *     textAlign: 'center'
     * </pre>
     */
    public final StyleOptions style = new StyleOptions();
}
