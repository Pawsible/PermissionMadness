
package com.braindamage.permissionmadness.Model.Model.CurrentWeatherrModel;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Precip1hr {

    @SerializedName("Metric")
    @Expose
    private Metric_____________ metric;
    @SerializedName("Imperial")
    @Expose
    private Imperial_____________ imperial;

    /**
     * 
     * @return
     *     The metric
     */
    public Metric_____________ getMetric() {
        return metric;
    }

    /**
     * 
     * @param metric
     *     The Metric
     */
    public void setMetric(Metric_____________ metric) {
        this.metric = metric;
    }

    /**
     * 
     * @return
     *     The imperial
     */
    public Imperial_____________ getImperial() {
        return imperial;
    }

    /**
     * 
     * @param imperial
     *     The Imperial
     */
    public void setImperial(Imperial_____________ imperial) {
        this.imperial = imperial;
    }

}
