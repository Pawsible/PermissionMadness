
package com.braindamage.permissionmadness.Model.Model.CurrentWeatherrModel;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class DewPoint {

    @SerializedName("Metric")
    @Expose
    private Metric___ metric;
    @SerializedName("Imperial")
    @Expose
    private Imperial___ imperial;

    /**
     * 
     * @return
     *     The metric
     */
    public Metric___ getMetric() {
        return metric;
    }

    /**
     * 
     * @param metric
     *     The Metric
     */
    public void setMetric(Metric___ metric) {
        this.metric = metric;
    }

    /**
     * 
     * @return
     *     The imperial
     */
    public Imperial___ getImperial() {
        return imperial;
    }

    /**
     * 
     * @param imperial
     *     The Imperial
     */
    public void setImperial(Imperial___ imperial) {
        this.imperial = imperial;
    }

}
