
package com.braindamage.permissionmadness.Model.Model.CurrentWeatherrModel;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Maximum__ {

    @SerializedName("Metric")
    @Expose
    private Metric___________________________ metric;
    @SerializedName("Imperial")
    @Expose
    private Imperial___________________________ imperial;

    /**
     * 
     * @return
     *     The metric
     */
    public Metric___________________________ getMetric() {
        return metric;
    }

    /**
     * 
     * @param metric
     *     The Metric
     */
    public void setMetric(Metric___________________________ metric) {
        this.metric = metric;
    }

    /**
     * 
     * @return
     *     The imperial
     */
    public Imperial___________________________ getImperial() {
        return imperial;
    }

    /**
     * 
     * @param imperial
     *     The Imperial
     */
    public void setImperial(Imperial___________________________ imperial) {
        this.imperial = imperial;
    }

}
