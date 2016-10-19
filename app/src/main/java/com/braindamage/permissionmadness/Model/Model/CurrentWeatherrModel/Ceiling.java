
package com.braindamage.permissionmadness.Model.Model.CurrentWeatherrModel;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Ceiling {

    @SerializedName("Metric")
    @Expose
    private Metric_______ metric;
    @SerializedName("Imperial")
    @Expose
    private Imperial_______ imperial;

    /**
     * 
     * @return
     *     The metric
     */
    public Metric_______ getMetric() {
        return metric;
    }

    /**
     * 
     * @param metric
     *     The Metric
     */
    public void setMetric(Metric_______ metric) {
        this.metric = metric;
    }

    /**
     * 
     * @return
     *     The imperial
     */
    public Imperial_______ getImperial() {
        return imperial;
    }

    /**
     * 
     * @param imperial
     *     The Imperial
     */
    public void setImperial(Imperial_______ imperial) {
        this.imperial = imperial;
    }

}
