
package com.braindamage.permissionmadness.Model.Model.CurrentWeatherrModel;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Past24Hours {

    @SerializedName("Metric")
    @Expose
    private Metric_____________________ metric;
    @SerializedName("Imperial")
    @Expose
    private Imperial_____________________ imperial;

    /**
     * 
     * @return
     *     The metric
     */
    public Metric_____________________ getMetric() {
        return metric;
    }

    /**
     * 
     * @param metric
     *     The Metric
     */
    public void setMetric(Metric_____________________ metric) {
        this.metric = metric;
    }

    /**
     * 
     * @return
     *     The imperial
     */
    public Imperial_____________________ getImperial() {
        return imperial;
    }

    /**
     * 
     * @param imperial
     *     The Imperial
     */
    public void setImperial(Imperial_____________________ imperial) {
        this.imperial = imperial;
    }

}
