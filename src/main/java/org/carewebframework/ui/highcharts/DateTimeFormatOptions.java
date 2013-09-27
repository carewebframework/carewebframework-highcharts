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
 * For a date/time axis, the scale will automatically adjust to the appropriate unit. This class
 * gives the default string representations used for each unit.
 */
public class DateTimeFormatOptions extends Options {
    
    /**
     * Defaults to: "%H = %M = %S"
     */
    public String second;
    
    /**
     * Defaults to: "%H = %M"
     */
    public String minute;
    
    /**
     * Defaults to: "%H = %M"
     */
    public String hour;
    
    /**
     * Defaults to: "%e. %b"
     */
    public String day;
    
    /**
     * Defaults to: "%e. %b"
     */
    public String week;
    
    /**
     * Defaults to: "%b \'%y"
     */
    public String month;
    
    /**
     * Defaults to: "%Y"
     */
    public String year;
    
}
