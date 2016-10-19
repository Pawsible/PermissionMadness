
package com.braindamage.permissionmadness.Model.Model.CurrentWeatherrModel;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Past9Hours {

    @SerializedName("Metric")
    @Expose
    private Metric__________________ metric;
    @SerializedName("Imperial")
    @Expose
    private Imperial__________________ imperial;

    /**
     * 
     * @return
     *     The metric
     */
    public Metric__________________ getMetric() {
        return metric;
    }

    /**
     * 
     * @param metric
     *     The Metric
     */
    public void setMetric(Metric__________________ metric) {
        this.metric = metric;
    }

    /**
     * 
     * @return
     *     The imperial
     */
    public Imperial__________________ getImperial() {
        return imperial;
    }

    /**
     * 
     * @param imperial
     *     The Imperial
     */
    public void setImperial(Imperial__________________ imperial) {
        this.imperial = imperial;
    }

}
