
package com.braindamage.permissionmadness.Model.Model.CurrentWeatherrModel;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Past3Hours {

    @SerializedName("Metric")
    @Expose
    private Metric________________ metric;
    @SerializedName("Imperial")
    @Expose
    private Imperial________________ imperial;

    /**
     * 
     * @return
     *     The metric
     */
    public Metric________________ getMetric() {
        return metric;
    }

    /**
     * 
     * @param metric
     *     The Metric
     */
    public void setMetric(Metric________________ metric) {
        this.metric = metric;
    }

    /**
     * 
     * @return
     *     The imperial
     */
    public Imperial________________ getImperial() {
        return imperial;
    }

    /**
     * 
     * @param imperial
     *     The Imperial
     */
    public void setImperial(Imperial________________ imperial) {
        this.imperial = imperial;
    }

}
