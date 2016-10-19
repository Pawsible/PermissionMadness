
package com.braindamage.permissionmadness.Model.Model.CurrentWeatherrModel;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class RealFeelTemperature {

    @SerializedName("Metric")
    @Expose
    private Metric_ metric;
    @SerializedName("Imperial")
    @Expose
    private Imperial_ imperial;

    /**
     * 
     * @return
     *     The metric
     */
    public Metric_ getMetric() {
        return metric;
    }

    /**
     * 
     * @param metric
     *     The Metric
     */
    public void setMetric(Metric_ metric) {
        this.metric = metric;
    }

    /**
     * 
     * @return
     *     The imperial
     */
    public Imperial_ getImperial() {
        return imperial;
    }

    /**
     * 
     * @param imperial
     *     The Imperial
     */
    public void setImperial(Imperial_ imperial) {
        this.imperial = imperial;
    }

}
