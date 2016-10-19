
package com.braindamage.permissionmadness.Model.Model.CurrentWeatherrModel;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class RealFeelTemperatureShade {

    @SerializedName("Metric")
    @Expose
    private Metric__ metric;
    @SerializedName("Imperial")
    @Expose
    private Imperial__ imperial;

    /**
     * 
     * @return
     *     The metric
     */
    public Metric__ getMetric() {
        return metric;
    }

    /**
     * 
     * @param metric
     *     The Metric
     */
    public void setMetric(Metric__ metric) {
        this.metric = metric;
    }

    /**
     * 
     * @return
     *     The imperial
     */
    public Imperial__ getImperial() {
        return imperial;
    }

    /**
     * 
     * @param imperial
     *     The Imperial
     */
    public void setImperial(Imperial__ imperial) {
        this.imperial = imperial;
    }

}
