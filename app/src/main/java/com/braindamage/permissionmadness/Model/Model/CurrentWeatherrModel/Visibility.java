
package com.braindamage.permissionmadness.Model.Model.CurrentWeatherrModel;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Visibility {

    @SerializedName("Metric")
    @Expose
    private Metric______ metric;
    @SerializedName("Imperial")
    @Expose
    private Imperial______ imperial;

    /**
     * 
     * @return
     *     The metric
     */
    public Metric______ getMetric() {
        return metric;
    }

    /**
     * 
     * @param metric
     *     The Metric
     */
    public void setMetric(Metric______ metric) {
        this.metric = metric;
    }

    /**
     * 
     * @return
     *     The imperial
     */
    public Imperial______ getImperial() {
        return imperial;
    }

    /**
     * 
     * @param imperial
     *     The Imperial
     */
    public void setImperial(Imperial______ imperial) {
        this.imperial = imperial;
    }

}
