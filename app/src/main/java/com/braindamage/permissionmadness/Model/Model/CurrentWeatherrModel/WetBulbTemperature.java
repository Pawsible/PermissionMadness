
package com.braindamage.permissionmadness.Model.Model.CurrentWeatherrModel;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class WetBulbTemperature {

    @SerializedName("Metric")
    @Expose
    private Metric____________ metric;
    @SerializedName("Imperial")
    @Expose
    private Imperial____________ imperial;

    /**
     * 
     * @return
     *     The metric
     */
    public Metric____________ getMetric() {
        return metric;
    }

    /**
     * 
     * @param metric
     *     The Metric
     */
    public void setMetric(Metric____________ metric) {
        this.metric = metric;
    }

    /**
     * 
     * @return
     *     The imperial
     */
    public Imperial____________ getImperial() {
        return imperial;
    }

    /**
     * 
     * @param imperial
     *     The Imperial
     */
    public void setImperial(Imperial____________ imperial) {
        this.imperial = imperial;
    }

}
