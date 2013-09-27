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
 * Plot options for area series.
 */
public class PlotArea extends PlotType {
    
    /**
     * Fill color or gradient for the area. When null, the series' color is used with the series'
     * fillOpacity. Defaults to null.
     */
    public String fillColor;
    
    /**
     * Fill opacity for the area. Defaults to .75.
     */
    public Double fillOpacity;
    
    /**
     * A separate color for the graph line. By default the line takes the color of the series, but
     * the lineColor setting allows setting a separate color for the line without altering the
     * fillColor. Defaults to null.
     */
    public String lineColor;
    
    /**
     * The Y axis value to serve as the base for the area, for distinguishing between values above
     * and below a threshold. Defaults to 0.
     */
    public Double threshold;
    
    /**
     * Whether the whole area or just the line should respond to mouseover tooltips and other mouse
     * or touch events. Defaults to false.
     */
    public Boolean trackByArea;
    
}
