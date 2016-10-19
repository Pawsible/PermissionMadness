
package com.braindamage.permissionmadness.Model.Model.CurrentWeatherrModel;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Speed_ {

    @SerializedName("Metric")
    @Expose
    private Metric_____ metric;
    @SerializedName("Imperial")
    @Expose
    private Imperial_____ imperial;

    /**
     * 
     * @return
     *     The metric
     */
    public Metric_____ getMetric() {
        return metric;
    }

    /**
     * 
     * @param metric
     *     The Metric
     */
    public void setMetric(Metric_____ metric) {
        this.metric = metric;
    }

    /**
     * 
     * @return
     *     The imperial
     */
    public Imperial_____ getImperial() {
        return imperial;
    }

    /**
     * 
     * @param imperial
     *     The Imperial
     */
    public void setImperial(Imperial_____ imperial) {
        this.imperial = imperial;
    }

}
