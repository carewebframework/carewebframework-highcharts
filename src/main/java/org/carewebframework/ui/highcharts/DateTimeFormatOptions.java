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
 *
 * <pre>
 * Supported format specifiers are:
 * 
 * %a: Short weekday, like 'Mon'.
 * %A: Long weekday, like 'Monday'.
 * %d: Two digit day of the month, 01 to 31.
 * %e: Day of the month, 1 through 31.
 * %b: Short month, like 'Jan'.
 * %B: Long month, like 'January'.
 * %m: Two digit month number, 01 through 12.
 * %y: Two digits year, like 09 for 2009.
 * %Y: Four digits year, like 2009.
 * %H: Two digits hours in 24h format, 00 through 23.
 * %I: Two digits hours in 12h format, 00 through 11.
 * %l  Hours in 12h format, 1 through 11. (Lower case L)
 * %M: Two digits minutes, 00 through 59.
 * %p: Upper case AM or PM.
 * %P: Lower case AM or PM.
 * %S: Two digits seconds, 00 through 59
 *
 * </pre>
 */
public class DateTimeFormatOptions extends Options {

    /**
     * Axis defaults: "%H:%M:%S.%L" <br>
     * Tooltip defaults: "%A, %b %e, %H:%M:%S.%L"
     */
    public String millisecond;

    /**
     * Axis defaults: "%H:%M:%S" <br>
     * Tooltip defaults: "%A, %b %e, %H:%M:%S"
     */
    public String second;

    /**
     * Axis defaults: "%H:%M" <br>
     * Tooltip defaults: "%A, %b %e, %H:%M"
     */
    public String minute;

    /**
     * Axis defaults: "%H:%M" <br>
     * Tooltip defaults: "%A, %b %e, %H:%M"
     */
    public String hour;

    /**
     * Axis defaults: "%e. %b" <br>
     * Tooltip defaults: "%A, %b %e, %Y"
     */
    public String day;

    /**
     * Axis defaults: "%e. %b" <br>
     * Tooltip defaults: "Week from %A, %b %e, %Y"
     */
    public String week;

    /**
     * Axis defaults: "%b \'%y" <br>
     * Tooltip defaults: "%B %Y"
     */
    public String month;

    /**
     * Axis defaults: "%Y" <br>
     * Tooltip defaults: "%Y"
     */
    public String year;

    /**
     * Sets all formats to the specified value.
     *
     * @param value
     */
    public void setAllFormats(String value) {
        setDateFormats(value);
        setTimeFormats(value);
    }

    /**
     * Sets all date formats to specified value.
     *
     * @param value
     */
    public void setDateFormats(String value) {
        day = value;
        month = value;
        week = value;
        year = value;
    }

    /**
     * Sets all time formats to specified value.
     *
     * @param value
     */
    public void setTimeFormats(String value) {
        hour = value;
        millisecond = value;
        minute = value;
        second = value;
    }

}
