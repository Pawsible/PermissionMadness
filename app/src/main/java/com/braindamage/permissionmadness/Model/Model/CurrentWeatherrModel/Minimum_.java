
package com.braindamage.permissionmadness.Model.Model.CurrentWeatherrModel;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Minimum_ {

    @SerializedName("Metric")
    @Expose
    private Metric________________________ metric;
    @SerializedName("Imperial")
    @Expose
    private Imperial________________________ imperial;

    /**
     * 
     * @return
     *     The metric
     */
    public Metric________________________ getMetric() {
        return metric;
    }

    /**
     * 
     * @param metric
     *     The Metric
     */
    public void setMetric(Metric________________________ metric) {
        this.metric = metric;
    }

    /**
     * 
     * @return
     *     The imperial
     */
    public Imperial________________________ getImperial() {
        return imperial;
    }

    /**
     * 
     * @param imperial
     *     The Imperial
     */
    public void setImperial(Imperial________________________ imperial) {
        this.imperial = imperial;
    }

}
