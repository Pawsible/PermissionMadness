
package com.braindamage.permissionmadness.Model.Model.CurrentWeatherrModel;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Pressure {

    @SerializedName("Metric")
    @Expose
    private Metric________ metric;
    @SerializedName("Imperial")
    @Expose
    private Imperial________ imperial;

    /**
     * 
     * @return
     *     The metric
     */
    public Metric________ getMetric() {
        return metric;
    }

    /**
     * 
     * @param metric
     *     The Metric
     */
    public void setMetric(Metric________ metric) {
        this.metric = metric;
    }

    /**
     * 
     * @return
     *     The imperial
     */
    public Imperial________ getImperial() {
        return imperial;
    }

    /**
     * 
     * @param imperial
     *     The Imperial
     */
    public void setImperial(Imperial________ imperial) {
        this.imperial = imperial;
    }

}
