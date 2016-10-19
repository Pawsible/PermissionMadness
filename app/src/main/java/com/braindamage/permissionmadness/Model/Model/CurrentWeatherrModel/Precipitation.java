
package com.braindamage.permissionmadness.Model.Model.CurrentWeatherrModel;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Precipitation {

    @SerializedName("Metric")
    @Expose
    private Metric______________ metric;
    @SerializedName("Imperial")
    @Expose
    private Imperial______________ imperial;

    /**
     * 
     * @return
     *     The metric
     */
    public Metric______________ getMetric() {
        return metric;
    }

    /**
     * 
     * @param metric
     *     The Metric
     */
    public void setMetric(Metric______________ metric) {
        this.metric = metric;
    }

    /**
     * 
     * @return
     *     The imperial
     */
    public Imperial______________ getImperial() {
        return imperial;
    }

    /**
     * 
     * @param imperial
     *     The Imperial
     */
    public void setImperial(Imperial______________ imperial) {
        this.imperial = imperial;
    }

}
