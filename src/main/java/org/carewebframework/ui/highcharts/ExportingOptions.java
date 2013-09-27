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
 * Options for the exporting module.
 */
public class ExportingOptions extends Options {
    
    /**
     * Options for the export button.
     */
    public final ButtonOptions buttons_exportButton = new ButtonOptions();
    
    /**
     * Options for the print button.
     */
    public final ButtonOptions buttons_printButton = new ButtonOptions();
    
    /**
     * Whether to enable images in the export. Including image point markers, background images etc.
     * Defaults to false.
     */
    public Boolean enableImages;
    
    /**
     * Whether to enable the exporting module. Defaults to true.
     */
    public Boolean enabled;
    
    /**
     * The filename, without extension, to use for the exported chart. Defaults to "chart".
     */
    public String filename;
    
    /**
     * Default MIME type for exporting if chart.exportChart() is called without specifying a type
     * option. Possible values are image/png, image/jpeg, application/pdf and image/svg+xml.
     * Defaults to "image/png".
     */
    public ExportType type;
    
    /**
     * The URL for the server module converting the SVG string to an image format. By default this
     * points to Highslide Software's free web service. Defaults to http://export.highcharts.com.
     */
    public String url;
    
    /**
     * The pixel width of charts exported to PNG or JPG. Defaults to 800.
     */
    public Integer width;
    
}
