
package com.braindamage.permissionmadness.Model.Model.CurrentWeatherrModel;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class ApparentTemperature {

    @SerializedName("Metric")
    @Expose
    private Metric__________ metric;
    @SerializedName("Imperial")
    @Expose
    private Imperial__________ imperial;

    /**
     * 
     * @return
     *     The metric
     */
    public Metric__________ getMetric() {
        return metric;
    }

    /**
     * 
     * @param metric
     *     The Metric
     */
    public void setMetric(Metric__________ metric) {
        this.metric = metric;
    }

    /**
     * 
     * @return
     *     The imperial
     */
    public Imperial__________ getImperial() {
        return imperial;
    }

    /**
     * 
     * @param imperial
     *     The Imperial
     */
    public void setImperial(Imperial__________ imperial) {
        this.imperial = imperial;
    }

}
