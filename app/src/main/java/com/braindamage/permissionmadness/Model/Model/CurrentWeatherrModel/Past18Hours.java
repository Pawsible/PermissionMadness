
package com.braindamage.permissionmadness.Model.Model.CurrentWeatherrModel;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Past18Hours {

    @SerializedName("Metric")
    @Expose
    private Metric____________________ metric;
    @SerializedName("Imperial")
    @Expose
    private Imperial____________________ imperial;

    /**
     * 
     * @return
     *     The metric
     */
    public Metric____________________ getMetric() {
        return metric;
    }

    /**
     * 
     * @param metric
     *     The Metric
     */
    public void setMetric(Metric____________________ metric) {
        this.metric = metric;
    }

    /**
     * 
     * @return
     *     The imperial
     */
    public Imperial____________________ getImperial() {
        return imperial;
    }

    /**
     * 
     * @param imperial
     *     The Imperial
     */
    public void setImperial(Imperial____________________ imperial) {
        this.imperial = imperial;
    }

}
