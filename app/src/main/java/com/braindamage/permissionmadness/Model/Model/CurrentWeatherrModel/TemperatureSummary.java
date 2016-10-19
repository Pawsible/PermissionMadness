
package com.braindamage.permissionmadness.Model.Model.CurrentWeatherrModel;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class TemperatureSummary {

    @SerializedName("Past6HourRange")
    @Expose
    private Past6HourRange past6HourRange;
    @SerializedName("Past12HourRange")
    @Expose
    private Past12HourRange past12HourRange;
    @SerializedName("Past24HourRange")
    @Expose
    private Past24HourRange past24HourRange;

    /**
     * 
     * @return
     *     The past6HourRange
     */
    public Past6HourRange getPast6HourRange() {
        return past6HourRange;
    }

    /**
     * 
     * @param past6HourRange
     *     The Past6HourRange
     */
    public void setPast6HourRange(Past6HourRange past6HourRange) {
        this.past6HourRange = past6HourRange;
    }

    /**
     * 
     * @return
     *     The past12HourRange
     */
    public Past12HourRange getPast12HourRange() {
        return past12HourRange;
    }

    /**
     * 
     * @param past12HourRange
     *     The Past12HourRange
     */
    public void setPast12HourRange(Past12HourRange past12HourRange) {
        this.past12HourRange = past12HourRange;
    }

    /**
     * 
     * @return
     *     The past24HourRange
     */
    public Past24HourRange getPast24HourRange() {
        return past24HourRange;
    }

    /**
     * 
     * @param past24HourRange
     *     The Past24HourRange
     */
    public void setPast24HourRange(Past24HourRange past24HourRange) {
        this.past24HourRange = past24HourRange;
    }

}
