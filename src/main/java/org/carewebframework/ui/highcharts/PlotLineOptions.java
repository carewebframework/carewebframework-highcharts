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
 * A line stretching across the plot area, marking a specific value on one of the axes.
 */
public class PlotLineOptions extends Options {
    
    /**
     * The color of the plot line. Defaults to null.
     */
    public String color;
    
    /**
     * The dashing or dot style for the plot line. Defaults to Solid.
     */
    public DashStyle dashStyle;
    
    /**
     * An id used for identifying the plot line in Axis.removePlotBand. Defaults to null.
     */
    public String id;
    
    /**
     * Text labels for the plot bands.
     */
    public final PlotLabelOptions label = new PlotLabelOptions();
    
    /**
     * The position of the line in axis units. Defaults to null.
     */
    public Double value;
    
    /**
     * The width or thickness of the plot line. Defaults to null.
     */
    public Integer width;
    
    /**
     * The z index of the plot line within the chart. Defaults to null.
     */
    public Integer zIndex;
}
