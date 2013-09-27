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
 * Global options that don't apply to each chart. These options, like the language options, must be
 * set using the Highcharts.setOptions method.
 */
public class GlobalOptions extends Options {
    
    /**
     * Path to the pattern image required by VML browsers in order to draw radial gradients.
     * Defaults to http://code.highcharts.com/{version}/gfx/vml-radial-gradient.png.
     */
    public String VMLRadialGradientURL;
    
    /**
     * he URL to the additional file to lazy load for Android 2.x devices. These devices don't
     * support SVG, so we download a helper file that contains canvg, its dependency rbcolor, and
     * our own CanVG Renderer class. To avoid hot linking to our site, you can install
     * canvas-tools.js on your own server and change this option accordingly. Defaults to
     * "http://www.highcharts.com/js/canvas-tools.js".
     */
    public String canvasToolsURL;
    
    /**
     * Whether to use UTC time for axis scaling, tickmark placement and time display in
     * Highcharts.dateFormat. Advantages of using UTC is that the time displays equally regardless
     * of the user agent's time zone settings. Local time can be used when the data is loaded in
     * real time or when correct Daylight Saving Time transitions are required. Defaults to false.
     */
    public Boolean useUTC = false;
}
