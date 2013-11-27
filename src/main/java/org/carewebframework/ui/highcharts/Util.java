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

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.zkoss.json.JavaScriptValue;

/**
 * Static utility methods.
 */
public class Util {
    
    private static final Map<String, Class<? extends PlotType>> plotTypes = new HashMap<String, Class<? extends PlotType>>();
    
    /**
     * Converts a collection of IMapConverter items to a list of maps.
     * 
     * @param items IMapConverter items to convert.
     * @return List of converted items.
     */
    public static List<OptionsMap> toMaps(Collection<? extends IMapConverter> items) {
        List<OptionsMap> list = new ArrayList<OptionsMap>();
        
        for (IMapConverter mc : items) {
            list.add(mc.toMap());
        }
        
        return list;
    }
    
    /**
     * Returns the plot type from its text identifier.
     * 
     * @param type The text identifier for the plot type.
     * @return An instance of the specified plot type.
     */
    public static PlotType getPlotType(String type) {
        try {
            return plotTypes.get(type).newInstance();
        } catch (Exception e) {
            throw new IllegalArgumentException("Invalid plot type: " + type);
        }
    }
    
    /**
     * Converts a JavaScript snippet to serializable form. If the snippet does not have a function
     * wrapper, a no-argument wrapper will be added.
     * 
     * @param snippet JS code snippet.
     * @return A JavaScriptValue object or null if the input was null.
     */
    protected static JavaScriptValue toJS(String snippet) {
        return snippet == null ? null : new JavaScriptValue(snippet.startsWith("function") ? snippet : "function() {"
                + snippet + "}");
    }
    
    /**
     * Load time initializations.
     */
    protected static void init() {
        plotTypes.put("area", PlotArea.class);
        plotTypes.put("arearange", PlotAreaRange.class);
        plotTypes.put("areaspline", PlotAreaSpline.class);
        plotTypes.put("areasplinerange", PlotAreaSplineRange.class);
        plotTypes.put("bar", PlotBar.class);
        plotTypes.put("boxplot", PlotBox.class);
        plotTypes.put("bubble", PlotBubble.class);
        plotTypes.put("column", PlotColumn.class);
        plotTypes.put("columnrange", PlotColumnRange.class);
        plotTypes.put("errorbar", PlotErrorBar.class);
        plotTypes.put("funnel", PlotFunnel.class);
        plotTypes.put("gauge", PlotGauge.class);
        plotTypes.put("line", PlotLine.class);
        plotTypes.put("pie", PlotPie.class);
        plotTypes.put("scatter", PlotScatter.class);
        plotTypes.put("spline", PlotSpline.class);
        plotTypes.put("waterfall", PlotWaterfall.class);
    }
    
    /**
     * Enforce static class.
     */
    private Util() {
    };
    
}
