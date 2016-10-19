
package com.braindamage.permissionmadness.Model.Model.CurrentWeatherrModel;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class PastHour {

    @SerializedName("Metric")
    @Expose
    private Metric_______________ metric;
    @SerializedName("Imperial")
    @Expose
    private Imperial_______________ imperial;

    /**
     * 
     * @return
     *     The metric
     */
    public Metric_______________ getMetric() {
        return metric;
    }

    /**
     * 
     * @param metric
     *     The Metric
     */
    public void setMetric(Metric_______________ metric) {
        this.metric = metric;
    }

    /**
     * 
     * @return
     *     The imperial
     */
    public Imperial_______________ getImperial() {
        return imperial;
    }

    /**
     * 
     * @param imperial
     *     The Imperial
     */
    public void setImperial(Imperial_______________ imperial) {
        this.imperial = imperial;
    }

}
