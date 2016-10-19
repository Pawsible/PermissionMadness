
package com.braindamage.permissionmadness.Model.Model.HourlyForecast;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class HourlyForecast {

    @SerializedName("DateTime")
    @Expose
    private String dateTime;
    @SerializedName("EpochDateTime")
    @Expose
    private int epochDateTime;
    @SerializedName("WeatherIcon")
    @Expose
    private int weatherIcon;
    @SerializedName("IconPhrase")
    @Expose
    private String iconPhrase;
    @SerializedName("IsDaylight")
    @Expose
    private boolean isDaylight;
    @SerializedName("Temperature")
    @Expose
    private Temperature temperature;
    @SerializedName("PrecipitationProbability")
    @Expose
    private int precipitationProbability;
    @SerializedName("MobileLink")
    @Expose
    private String mobileLink;
    @SerializedName("Link")
    @Expose
    private String link;

    /**
     * 
     * @return
     *     The dateTime
     */
    public String getDateTime() {
        return dateTime;
    }

    /**
     * 
     * @param dateTime
     *     The DateTime
     */
    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    /**
     * 
     * @return
     *     The epochDateTime
     */
    public int getEpochDateTime() {
        return epochDateTime;
    }

    /**
     * 
     * @param epochDateTime
     *     The EpochDateTime
     */
    public void setEpochDateTime(int epochDateTime) {
        this.epochDateTime = epochDateTime;
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
     *     The iconPhrase
     */
    public String getIconPhrase() {
        return iconPhrase;
    }

    /**
     * 
     * @param iconPhrase
     *     The IconPhrase
     */
    public void setIconPhrase(String iconPhrase) {
        this.iconPhrase = iconPhrase;
    }

    /**
     * 
     * @return
     *     The isDaylight
     */
    public boolean isIsDaylight() {
        return isDaylight;
    }

    /**
     * 
     * @param isDaylight
     *     The IsDaylight
     */
    public void setIsDaylight(boolean isDaylight) {
        this.isDaylight = isDaylight;
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
     *     The precipitationProbability
     */
    public int getPrecipitationProbability() {
        return precipitationProbability;
    }

    /**
     * 
     * @param precipitationProbability
     *     The PrecipitationProbability
     */
    public void setPrecipitationProbability(int precipitationProbability) {
        this.precipitationProbability = precipitationProbability;
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
