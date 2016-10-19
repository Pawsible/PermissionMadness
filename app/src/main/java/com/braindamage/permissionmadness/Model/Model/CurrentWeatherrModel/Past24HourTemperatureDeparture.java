
package com.braindamage.permissionmadness.Model.Model.CurrentWeatherrModel;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Past24HourTemperatureDeparture {

    @SerializedName("Metric")
    @Expose
    private Metric_________ metric;
    @SerializedName("Imperial")
    @Expose
    private Imperial_________ imperial;

    /**
     * 
     * @return
     *     The metric
     */
    public Metric_________ getMetric() {
        return metric;
    }

    /**
     * 
     * @param metric
     *     The Metric
     */
    public void setMetric(Metric_________ metric) {
        this.metric = metric;
    }

    /**
     * 
     * @return
     *     The imperial
     */
    public Imperial_________ getImperial() {
        return imperial;
    }

    /**
     * 
     * @param imperial
     *     The Imperial
     */
    public void setImperial(Imperial_________ imperial) {
        this.imperial = imperial;
    }

}
