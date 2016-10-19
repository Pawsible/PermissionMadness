
package com.braindamage.permissionmadness.Model.Model.CurrentWeatherrModel;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Past6Hours {

    @SerializedName("Metric")
    @Expose
    private Metric_________________ metric;
    @SerializedName("Imperial")
    @Expose
    private Imperial_________________ imperial;

    /**
     * 
     * @return
     *     The metric
     */
    public Metric_________________ getMetric() {
        return metric;
    }

    /**
     * 
     * @param metric
     *     The Metric
     */
    public void setMetric(Metric_________________ metric) {
        this.metric = metric;
    }

    /**
     * 
     * @return
     *     The imperial
     */
    public Imperial_________________ getImperial() {
        return imperial;
    }

    /**
     * 
     * @param imperial
     *     The Imperial
     */
    public void setImperial(Imperial_________________ imperial) {
        this.imperial = imperial;
    }

}
