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
 * A collection of options for buttons and menus appearing in the exporting module.
 */
public class NavigationOptions extends Options {
    
    /**
     * A collection of options for buttons appearing in the exporting module.
     */
    public final ButtonOptions buttonOptions = new ButtonOptions();
    
    /**
     * CSS styles for the hover state of the individual items within the popup menu appearing by
     * default when the export icon is clicked. The menu items are rendered in HTML. Defaults to
     * 
     * <pre>
     *     background: '#4572A5'
     *     color: '#FFFFFF'
     * </pre>
     */
    public final StyleOptions menuItemHoverStyle = new StyleOptions();
    
    /**
     * CSS styles for the individual items within the popup menu appearing by default when the
     * export icon is clicked. The menu items are rendered in HTML. Defaults to
     * 
     * <pre>
     *     padding: '0 5px'
     *     background: none
     *     color: '#303030'
     * </pre>
     */
    public final StyleOptions menuItemStyle = new StyleOptions();
    
    /**
     * CSS styles for the popup menu appearing by default when the export icon is clicked. This menu
     * is rendered in HTML. Defaults to
     * 
     * <pre>
     *     border: '1px solid #A0A0A0'
     *     background: '#FFFFFF'
     * </pre>
     */
    public final StyleOptions menuStyle = new StyleOptions();
}
