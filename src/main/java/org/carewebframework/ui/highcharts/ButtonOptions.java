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
import java.util.List;

/**
 * Options for buttons (e.g., print or export buttons).
 */
public class ButtonOptions extends Options {
    
    /**
     * Alignment for the buttons. Defaults to "right".
     */
    public AlignHorizontal align;
    
    /**
     * Background color for the buttons.
     */
    public String backgroundColor;
    
    /**
     * The border color of the buttons. Defaults to "#B0B0B0".
     */
    public String borderColor;
    
    /**
     * The border corner radius of the buttons. Defaults to 3.
     */
    public Integer borderRadius;
    
    /**
     * The border width of the buttons. Defaults to 1.
     */
    public Integer borderWidth;
    
    /**
     * Whether to enable buttons. Defaults to true.
     */
    public Boolean enabled;
    
    /**
     * Pixel height of the buttons. Defaults to 20.
     */
    public Integer height;
    
    /**
     * Color of the button border on hover. Defaults to #909090.
     */
    public String hoverBorderColor;
    
    /**
     * Defaults to #768F3E.
     */
    public String hoverSymbolFill;
    
    /**
     * Stroke (line) color for the symbol within the button on hover. Defaults to #4572A5.
     */
    public String hoverSymbolStroke;
    
    /**
     * A collection of config options for the menu items. Each options object consists of a text
     * option which is a string to show in the menu item, as well as an onclick parameter which is a
     * callback function to run on click. By default, there is one menu item for each of the
     * available export types. Menu items can be customized by defining a new array of items and
     * assigning null to unwanted positions.
     */
    public final List<ActionOptions> menuItems = new ArrayList<ActionOptions>();
    
    /**
     * A click handler callback to use on the button directly instead of the default. The "this"
     * variable will be the Highcharts object.
     */
    @JavaScript
    public String onclick;
    
    /**
     * The symbol for the button. Points to a definition function in the Highcharts.Renderer.symbols
     * collection. The default exportIcon function is part of the exporting module. Defaults to
     * "exportIcon".
     */
    public String symbol;
    
    /**
     * Defaults to #A8BF77.
     */
    public String symbolFill;
    
    /**
     * The pixel size of the symbol on the button. Defaults to 12.
     */
    public Integer symbolSize;
    
    /**
     * The color of the symbol's stroke or line. Defaults to "#A0A0A0".
     */
    public String symbolStroke;
    
    /**
     * The pixel stroke width of the symbol on the button. Defaults to 1.
     */
    public Integer symbolStrokeWidth;
    
    /**
     * The x position of the center of the symbol inside the button. Defaults to 11.5.
     */
    public Double symbolX;
    
    /**
     * The y position of the center of the symbol inside the button. Defaults to 10.5.
     */
    public Double symbolY;
    
    /**
     * A text string to add to the individual button. Defaults to null.
     */
    public String text;
    
    /**
     * The vertical alignment of the buttons. Can be one of "top", "middle" or "bottom". Defaults to
     * "top".
     */
    public AlignVertical verticalAlign;
    
    /**
     * The pixel width of the button. Defaults to 24.
     */
    public Integer width;
    
    /**
     * The horizontal position of the button relative to the align option. Defaults to 10.
     */
    public Integer x;
    
    /**
     * The vertical offset of the button's position relative to its verticalAlign. Defaults to 10.
     */
    public Integer y;
    
}
