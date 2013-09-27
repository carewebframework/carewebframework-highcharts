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
import java.lang.reflect.Modifier;

/**
 * Base class for options. Supports interconverting class-based properties to a map and vice-versa.
 */
public abstract class Options implements IMapConverter {
    
    @Override
    public OptionsMap toMap() {
        OptionsMap map = new OptionsMap();
        toMap(getClass(), map);
        return map;
    }
    
    /**
     * Set each of the class' fields into a map. Ignores private and transient fields. Recurses for
     * each superclass until the root Options class is reached.
     * 
     * @param clazz
     * @param map
     */
    private void toMap(Class<?> clazz, OptionsMap map) {
        if (clazz == Options.class) {
            return;
        }
        
        toMap(clazz.getSuperclass(), map);
        
        for (Field field : clazz.getDeclaredFields()) {
            int modifiers = field.getModifiers();
            
            if (!Modifier.isTransient(modifiers) && !Modifier.isPrivate(modifiers)) {
                try {
                    String name = field.getName();
                    Object value = field.get(this);
                    
                    if (field.isAnnotationPresent(JavaScript.class)) {
                        value = Util.toJS(value.toString());
                    }
                    
                    if (value != null) {
                        setValue(name, value, map);
                    }
                } catch (Exception e) {}
            }
        }
    }
    
    /**
     * Sets the name/value pair into the specified map. If the name contains an underscore, the
     * value is stored in a submap using the first part of the name as the top level key and the
     * second part as the subkey.
     * 
     * @param name
     * @param value
     * @param map
     */
    private void setValue(String name, Object value, OptionsMap map) {
        if (name.contains("_")) {
            String pcs[] = name.split("\\_", 2);
            name = pcs[0];
            OptionsMap submap = (OptionsMap) map.get(name);
            
            if (submap == null) {
                submap = new OptionsMap();
            }
            
            setValue(pcs[1], value, submap);
            map.put(name, submap);
        } else {
            map.put(name, value);
        }
    }
    
    /**
     * Copies this instance to a target of the same class.
     * 
     * @param target
     */
    public void copyTo(Options target) {
        if (target.getClass() != getClass()) {
            throw new IllegalArgumentException();
        }
        
        for (Field field : getClass().getFields()) {
            if (field.isAccessible() && !Modifier.isTransient(field.getModifiers())) {
                try {
                    field.set(target, field.get(this));
                } catch (Exception e) {}
            }
        }
        
    }
}
