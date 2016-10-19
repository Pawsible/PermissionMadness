
package com.braindamage.permissionmadness.Model.Model.CurrentWeatherrModel;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Past24HourRange {

    @SerializedName("Minimum")
    @Expose
    private Minimum__ minimum;
    @SerializedName("Maximum")
    @Expose
    private Maximum__ maximum;

    /**
     * 
     * @return
     *     The minimum
     */
    public Minimum__ getMinimum() {
        return minimum;
    }

    /**
     * 
     * @param minimum
     *     The Minimum
     */
    public void setMinimum(Minimum__ minimum) {
        this.minimum = minimum;
    }

    /**
     * 
     * @return
     *     The maximum
     */
    public Maximum__ getMaximum() {
        return maximum;
    }

    /**
     * 
     * @param maximum
     *     The Maximum
     */
    public void setMaximum(Maximum__ maximum) {
        this.maximum = maximum;
    }

}
