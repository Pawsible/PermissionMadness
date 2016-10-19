
package com.braindamage.permissionmadness.Model.Model.CurrentWeatherrModel;

import javax.annotation.Generated;

import com.braindamage.permissionmadness.Model.Model.CurrentWeatherModel.*;
import com.braindamage.permissionmadness.Model.Model.CurrentWeatherModel.Imperial;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Temperature {

    @SerializedName("Metric")
    @Expose
    private com.braindamage.permissionmadness.Model.Model.CurrentWeatherModel.Metric metric;
    @SerializedName("Imperial")
    @Expose
    private com.braindamage.permissionmadness.Model.Model.CurrentWeatherModel.Imperial imperial;

    /**
     * 
     * @return
     *     The metric
     */
    public com.braindamage.permissionmadness.Model.Model.CurrentWeatherModel.Metric getMetric() {
        return metric;
    }

    /**
     * 
     * @param metric
     *     The Metric
     */
    public void setMetric(com.braindamage.permissionmadness.Model.Model.CurrentWeatherModel.Metric metric) {
        this.metric = metric;
    }

    /**
     * 
     * @return
     *     The imperial
     */
    public com.braindamage.permissionmadness.Model.Model.CurrentWeatherModel.Imperial getImperial() {
        return imperial;
    }

    /**
     * 
     * @param imperial
     *     The Imperial
     */
    public void setImperial(Imperial imperial) {
        this.imperial = imperial;
    }

}
