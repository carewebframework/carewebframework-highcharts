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

import java.lang.reflect.Field;

import org.zkoss.util.resource.Labels;

/**
 * Global settings for Highcharts. These are set on a per desktop basis. Values are loaded from
 * label properties. For example, to set the decimal separator in the lang options:
 * 
 * <pre>
 * highcharts.lang.decimalPoint=.
 * </pre>
 */
public class GlobalSettings extends Options {
    
    private static final String LABEL_PREFIX = "highcharts.";
    
    public final GlobalOptions global = new GlobalOptions();
    
    public final LanguageOptions lang = new LanguageOptions();
    
    /**
     * Create and load global settings.
     */
    protected GlobalSettings() {
        super();
        loadSettings("global.", global);
        loadSettings("lang.", lang);
    }
    
    /**
     * Load global settings into the specified options object.
     * 
     * @param cat This is the category prefix for the options.
     * @param options The options instance to receive the settings.
     */
    private void loadSettings(String cat, Options options) {
        for (Field field : options.getClass().getFields()) {
            try {
                String value = Labels.getLabel(LABEL_PREFIX + cat + field.getName());
                
                if (value != null && !value.isEmpty()) {
                    Class<?> type = field.getType();
                    
                    if (type.isArray()) {
                        field.set(options, value.split("\\,"));
                    } else if (type == Boolean.class) {
                        field.set(options, Boolean.valueOf(value));
                    } else {
                        field.set(options, value);
                    }
                }
            } catch (Exception e) {}
        }
    }
}
