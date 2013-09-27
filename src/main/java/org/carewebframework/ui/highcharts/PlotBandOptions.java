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
 * A colored band stretching across the plot area marking an interval on the axis.
 */
public class PlotBandOptions extends Options {
    
    /**
     * The color of the plot band.
     */
    public String color;
    
    /**
     * The linear gradient that defines the line which defines the direction of the gradient.
     */
    public final LinearGradient color_linearGradient = new LinearGradient();
    
    /**
     * The radial gradient that defines the line which defines the direction of the gradient.
     */
    public final RadialGradient color_radialGradient = new RadialGradient();
    
    /**
     * The "stops" that define where the color transitions happen in the linear gradient. The first
     * element is a value between 0 and 1 that define where along the line the transition happens
     * (like a percentage) and the second element is the actual color (#FFBBAA for example).
     */
    public String[][] color_stops;
    
    /**
     * The start position of the plot band in axis units. Defaults to null.
     */
    public Double from;
    
    /**
     * An id used for identifying the plot band in Axis.removePlotBand. Defaults to null.
     */
    public String id;
    
    /**
     * Text labels for the plot bands.
     */
    public final PlotLabelOptions label = new PlotLabelOptions();
    
    /**
     * The end position of the plot band in axis units. Defaults to null.
     */
    public Double to;
    
    /**
     * The z index of the plot band within the chart. Defaults to null.
     */
    public Integer zIndex;
}
