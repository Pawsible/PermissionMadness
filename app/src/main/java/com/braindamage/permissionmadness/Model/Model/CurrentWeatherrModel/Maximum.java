
package com.braindamage.permissionmadness.Model.Model.CurrentWeatherrModel;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Maximum {

    @SerializedName("Metric")
    @Expose
    private Metric_______________________ metric;
    @SerializedName("Imperial")
    @Expose
    private Imperial_______________________ imperial;

    /**
     * 
     * @return
     *     The metric
     */
    public Metric_______________________ getMetric() {
        return metric;
    }

    /**
     * 
     * @param metric
     *     The Metric
     */
    public void setMetric(Metric_______________________ metric) {
        this.metric = metric;
    }

    /**
     * 
     * @return
     *     The imperial
     */
    public Imperial_______________________ getImperial() {
        return imperial;
    }

    /**
     * 
     * @param imperial
     *     The Imperial
     */
    public void setImperial(Imperial_______________________ imperial) {
        this.imperial = imperial;
    }

}
