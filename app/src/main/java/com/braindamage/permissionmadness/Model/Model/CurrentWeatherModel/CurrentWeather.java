
package com.braindamage.permissionmadness.Model.Model.CurrentWeatherModel;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class CurrentWeather {

    @SerializedName("LocalObservationDateTime")
    @Expose
    private String localObservationDateTime;
    @SerializedName("EpochTime")
    @Expose
    private int epochTime;
    @SerializedName("WeatherText")
    @Expose
    private String weatherText;
    @SerializedName("WeatherIcon")
    @Expose
    private int weatherIcon;
    @SerializedName("IsDayTime")
    @Expose
    private boolean isDayTime;
    @SerializedName("Temperature")
    @Expose
    private Temperature temperature;
    @SerializedName("MobileLink")
    @Expose
    private String mobileLink;
    @SerializedName("Link")
    @Expose
    private String link;

    /**
     * 
     * @return
     *     The localObservationDateTime
     */
    public String getLocalObservationDateTime() {
        return localObservationDateTime;
    }

    /**
     * 
     * @param localObservationDateTime
     *     The LocalObservationDateTime
     */
    public void setLocalObservationDateTime(String localObservationDateTime) {
        this.localObservationDateTime = localObservationDateTime;
    }

    /**
     * 
     * @return
     *     The epochTime
     */
    public int getEpochTime() {
        return epochTime;
    }

    /**
     * 
     * @param epochTime
     *     The EpochTime
     */
    public void setEpochTime(int epochTime) {
        this.epochTime = epochTime;
    }

    /**
     * 
     * @return
     *     The weatherText
     */
    public String getWeatherText() {
        return weatherText;
    }

    /**
     * 
     * @param weatherText
     *     The WeatherText
     */
    public void setWeatherText(String weatherText) {
        this.weatherText = weatherText;
    }

    /**
     * 
     * @return
     *     The weatherIcon
     */
    public int getWeatherIcon() {
        return weatherIcon;
    }

    /**
     * 
     * @param weatherIcon
     *     The WeatherIcon
     */
    public void setWeatherIcon(int weatherIcon) {
        this.weatherIcon = weatherIcon;
    }

    /**
     * 
     * @return
     *     The isDayTime
     */
    public boolean isIsDayTime() {
        return isDayTime;
    }

    /**
     * 
     * @param isDayTime
     *     The IsDayTime
     */
    public void setIsDayTime(boolean isDayTime) {
        this.isDayTime = isDayTime;
    }

    /**
     * 
     * @return
     *     The temperature
     */
    public Temperature getTemperature() {
        return temperature;
    }

    /**
     * 
     * @param temperature
     *     The Temperature
     */
    public void setTemperature(Temperature temperature) {
        this.temperature = temperature;
    }

    /**
     * 
     * @return
     *     The mobileLink
     */
    public String getMobileLink() {
        return mobileLink;
    }

    /**
     * 
     * @param mobileLink
     *     The MobileLink
     */
    public void setMobileLink(String mobileLink) {
        this.mobileLink = mobileLink;
    }

    /**
     * 
     * @return
     *     The link
     */
    public String getLink() {
        return link;
    }

    /**
     * 
     * @param link
     *     The Link
     */
    public void setLink(String link) {
        this.link = link;
    }

}
