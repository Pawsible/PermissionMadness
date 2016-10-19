
package com.braindamage.permissionmadness.Model.Model.CurrentWeatherrModel;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Minimum {

    @SerializedName("Metric")
    @Expose
    private Metric______________________ metric;
    @SerializedName("Imperial")
    @Expose
    private Imperial______________________ imperial;

    /**
     * 
     * @return
     *     The metric
     */
    public Metric______________________ getMetric() {
        return metric;
    }

    /**
     * 
     * @param metric
     *     The Metric
     */
    public void setMetric(Metric______________________ metric) {
        this.metric = metric;
    }

    /**
     * 
     * @return
     *     The imperial
     */
    public Imperial______________________ getImperial() {
        return imperial;
    }

    /**
     * 
     * @param imperial
     *     The Imperial
     */
    public void setImperial(Imperial______________________ imperial) {
        this.imperial = imperial;
    }

}
