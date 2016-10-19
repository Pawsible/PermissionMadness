
package com.braindamage.permissionmadness.Model.Model.CurrentWeatherrModel;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Speed {

    @SerializedName("Metric")
    @Expose
    private Metric____ metric;
    @SerializedName("Imperial")
    @Expose
    private Imperial____ imperial;

    /**
     * 
     * @return
     *     The metric
     */
    public Metric____ getMetric() {
        return metric;
    }

    /**
     * 
     * @param metric
     *     The Metric
     */
    public void setMetric(Metric____ metric) {
        this.metric = metric;
    }

    /**
     * 
     * @return
     *     The imperial
     */
    public Imperial____ getImperial() {
        return imperial;
    }

    /**
     * 
     * @param imperial
     *     The Imperial
     */
    public void setImperial(Imperial____ imperial) {
        this.imperial = imperial;
    }

}
