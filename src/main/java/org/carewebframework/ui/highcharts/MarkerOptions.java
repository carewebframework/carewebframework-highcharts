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
 * Options for point markers.
 */
public class MarkerOptions extends Options {
    
    /**
     * Enable or disable the point marker. Defaults to true.
     */
    public Boolean enabled;
    
    /**
     * he fill color of the point marker. When null, the series' or point's color is used. Defaults
     * to null.
     */
    public String fillColor;
    
    /**
     * The color of the point marker's outline. When null, the series' or point's color is used.
     * Defaults to "#FFFFFF".
     */
    public String lineColor;
    
    /**
     * The width of the point marker's outline. Defaults to 0.
     */
    public Integer lineWidth;
    
    /**
     * The radius of the point marker. Defaults to 0.
     */
    public Integer radius;
    
    /**
     * Marker states for hover.
     */
    public transient final MarkerStateOptions hover_state = new MarkerStateOptions();
    
    /**
     * Marker states for select.
     */
    public transient final MarkerStateOptions select_state = new MarkerStateOptions();
    
    /**
     * Hover and select states.
     */
    public final OptionsMap states = new OptionsMap();
    
    /**
     * A predefined shape or symbol for the marker. When null, the symbol is pulled from
     * options.symbols. Other possible values are "circle", "square", "diamond", "triangle" and
     * "triangle-down". Additionally, the URL to a graphic can be given on this form:
     * "url(graphic.png)". Defaults to null.
     */
    public String symbol;
    
    @Override
    public OptionsMap toMap() {
        OptionsMap map = super.toMap();
        states.clear();
        map.put("hover", hover_state.toMap());
        map.put("select", select_state.toMap());
        return map;
    }
}
