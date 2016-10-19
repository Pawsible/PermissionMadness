
package com.braindamage.permissionmadness.Model.Model.CurrentWeatherrModel;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Past12Hours {

    @SerializedName("Metric")
    @Expose
    private Metric___________________ metric;
    @SerializedName("Imperial")
    @Expose
    private Imperial___________________ imperial;

    /**
     * 
     * @return
     *     The metric
     */
    public Metric___________________ getMetric() {
        return metric;
    }

    /**
     * 
     * @param metric
     *     The Metric
     */
    public void setMetric(Metric___________________ metric) {
        this.metric = metric;
    }

    /**
     * 
     * @return
     *     The imperial
     */
    public Imperial___________________ getImperial() {
        return imperial;
    }

    /**
     * 
     * @param imperial
     *     The Imperial
     */
    public void setImperial(Imperial___________________ imperial) {
        this.imperial = imperial;
    }

}
