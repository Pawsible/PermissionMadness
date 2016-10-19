
package com.braindamage.permissionmadness.Model.Model.CurrentWeatherrModel;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Minimum__ {

    @SerializedName("Metric")
    @Expose
    private Metric__________________________ metric;
    @SerializedName("Imperial")
    @Expose
    private Imperial__________________________ imperial;

    /**
     * 
     * @return
     *     The metric
     */
    public Metric__________________________ getMetric() {
        return metric;
    }

    /**
     * 
     * @param metric
     *     The Metric
     */
    public void setMetric(Metric__________________________ metric) {
        this.metric = metric;
    }

    /**
     * 
     * @return
     *     The imperial
     */
    public Imperial__________________________ getImperial() {
        return imperial;
    }

    /**
     * 
     * @param imperial
     *     The Imperial
     */
    public void setImperial(Imperial__________________________ imperial) {
        this.imperial = imperial;
    }

}
