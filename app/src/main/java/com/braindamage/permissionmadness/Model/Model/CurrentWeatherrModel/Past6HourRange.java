
package com.braindamage.permissionmadness.Model.Model.CurrentWeatherrModel;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Past6HourRange {

    @SerializedName("Minimum")
    @Expose
    private Minimum minimum;
    @SerializedName("Maximum")
    @Expose
    private Maximum maximum;

    /**
     * 
     * @return
     *     The minimum
     */
    public Minimum getMinimum() {
        return minimum;
    }

    /**
     * 
     * @param minimum
     *     The Minimum
     */
    public void setMinimum(Minimum minimum) {
        this.minimum = minimum;
    }

    /**
     * 
     * @return
     *     The maximum
     */
    public Maximum getMaximum() {
        return maximum;
    }

    /**
     * 
     * @param maximum
     *     The Maximum
     */
    public void setMaximum(Maximum maximum) {
        this.maximum = maximum;
    }

}
