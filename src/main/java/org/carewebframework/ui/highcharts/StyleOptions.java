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
 * Used to hold style options.
 */
public class StyleOptions implements IMapConverter {
    
    private final OptionsMap styles = new OptionsMap();
    
    /**
     * Adds the requested style.
     * 
     * @param style A CSS style.
     * @param value Value to set (or null to remove).
     * @return The StyleOptions instance (for chaining).
     */
    public StyleOptions addStyle(String style, String value) {
        styles.put(style, value);
        return this;
    }
    
    /**
     * Returns the underlying map.
     */
    @Override
    public OptionsMap toMap() {
        return styles;
    }
    
}
