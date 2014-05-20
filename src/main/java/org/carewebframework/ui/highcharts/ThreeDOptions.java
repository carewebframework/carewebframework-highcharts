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

public class ThreeDOptions extends Options {
    
    /**
     * One of the two rotation angles for the chart. Defaults to 0.
     */
    public Double alpha;
    
    /**
     * One of the two rotation angles for the chart. Defaults to 0.
     */
    public Double beta;
    
    /**
     * The total depth of the chart. Defaults to 100.
     */
    public Double depth;
    
    /**
     * Whether to render the chart using the 3D functionality. Defaults to false.
     */
    public Boolean enabled;
    
    /**
     * Defines the back panel of the frame around 3D charts.
     */
    public final ThreeDFrameOptions frame_back = new ThreeDFrameOptions();

    /**
     * The bottom of the frame around a 3D chart.
     */
    public final ThreeDFrameOptions frame_bottom = new ThreeDFrameOptions();

    /**
     * The side for the frame around a 3D chart.
     */
    public final ThreeDFrameOptions frame_side = new ThreeDFrameOptions();

    /**
     * Defines the distance the viewer is standing in front of the chart, this setting is important
     * to calculate the perspective effect in column and scatter charts. It is not used for 3D pie
     * charts. Defaults to 100.
     */
    public Double viewDistance;

}
