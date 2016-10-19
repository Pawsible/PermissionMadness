
package com.braindamage.permissionmadness.Model.Model.CurrentWeatherrModel;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Past12HourRange {

    @SerializedName("Minimum")
    @Expose
    private Minimum_ minimum;
    @SerializedName("Maximum")
    @Expose
    private Maximum_ maximum;

    /**
     * 
     * @return
     *     The minimum
     */
    public Minimum_ getMinimum() {
        return minimum;
    }

    /**
     * 
     * @param minimum
     *     The Minimum
     */
    public void setMinimum(Minimum_ minimum) {
        this.minimum = minimum;
    }

    /**
     * 
     * @return
     *     The maximum
     */
    public Maximum_ getMaximum() {
        return maximum;
    }

    /**
     * 
     * @param maximum
     *     The Maximum
     */
    public void setMaximum(Maximum_ maximum) {
        this.maximum = maximum;
    }

}
