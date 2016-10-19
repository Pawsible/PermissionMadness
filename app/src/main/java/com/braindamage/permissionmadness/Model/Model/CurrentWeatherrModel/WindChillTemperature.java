
package com.braindamage.permissionmadness.Model.Model.CurrentWeatherrModel;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class WindChillTemperature {

    @SerializedName("Metric")
    @Expose
    private Metric___________ metric;
    @SerializedName("Imperial")
    @Expose
    private Imperial___________ imperial;

    /**
     * 
     * @return
     *     The metric
     */
    public Metric___________ getMetric() {
        return metric;
    }

    /**
     * 
     * @param metric
     *     The Metric
     */
    public void setMetric(Metric___________ metric) {
        this.metric = metric;
    }

    /**
     * 
     * @return
     *     The imperial
     */
    public Imperial___________ getImperial() {
        return imperial;
    }

    /**
     * 
     * @param imperial
     *     The Imperial
     */
    public void setImperial(Imperial___________ imperial) {
        this.imperial = imperial;
    }

}
