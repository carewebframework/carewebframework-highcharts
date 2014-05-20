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

public class DataPoint extends Options implements Comparable<DataPoint> {

    /**
     * Individual color for the point. Defaults to null.
     */
    public String color;

    /**
     * Individual data label for each point.
     *
     * @see DataLabelOptions
     */
    public final DataLabelOptions dataLabels = new DataLabelOptions();

    /**
     * An id for the point. Defaults to null.
     */
    public String id;

    /**
     * Pies only. The sequential index of the pie slice in the legend. Defaults to undefined.
     */
    public Integer legendIndex;

    /**
     * Marker options.
     */
    public final MarkerOptions marker = new MarkerOptions();

    /**
     * The name of the point as shown in the legend, tooltip, dataLabel etc. Defaults to "".
     */
    public String name;

    /**
     * Pie series only. Whether to display a slice offset from the center. Defaults to false.
     */
    public Boolean sliced;

    /**
     * The x value of the point. Defaults to null.
     */
    public Double x;

    /**
     * The x value of the point. Defaults to null.
     */
    public Double y;

    /**
     * Sort by x value, then y value.
     */
    @Override
    public int compareTo(DataPoint dp) {
        int result = compare(x, dp.x);
        return result == 0 ? compare(y, dp.y) : result;
    }

    private int compare(Double d1, Double d2) {
        return d1 == d2 ? 0 : d1 == null ? -1 : d2 == null ? 1 : d1.compareTo(d2);
    }
}
