
package com.braindamage.permissionmadness.Model.Model.CurrentWeatherrModel;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Maximum_ {

    @SerializedName("Metric")
    @Expose
    private Metric_________________________ metric;
    @SerializedName("Imperial")
    @Expose
    private Imperial_________________________ imperial;

    /**
     * 
     * @return
     *     The metric
     */
    public Metric_________________________ getMetric() {
        return metric;
    }

    /**
     * 
     * @param metric
     *     The Metric
     */
    public void setMetric(Metric_________________________ metric) {
        this.metric = metric;
    }

    /**
     * 
     * @return
     *     The imperial
     */
    public Imperial_________________________ getImperial() {
        return imperial;
    }

    /**
     * 
     * @param imperial
     *     The Imperial
     */
    public void setImperial(Imperial_________________________ imperial) {
        this.imperial = imperial;
    }

}
