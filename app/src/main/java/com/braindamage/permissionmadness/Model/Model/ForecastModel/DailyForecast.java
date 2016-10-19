
package com.braindamage.permissionmadness.Model.Model.ForecastModel;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class DailyForecast {

    @SerializedName("Date")
    @Expose
    private String date;
    @SerializedName("EpochDate")
    @Expose
    private int epochDate;
    @SerializedName("Temperature")
    @Expose
    private Temperature temperature;
    @SerializedName("Day")
    @Expose
    private Day day;
    @SerializedName("Night")
    @Expose
    private Night night;
    @SerializedName("Sources")
    @Expose
    private List<String> sources = new ArrayList<String>();
    @SerializedName("MobileLink")
    @Expose
    private String mobileLink;
    @SerializedName("Link")
    @Expose
    private String link;

    /**
     * 
     * @return
     *     The date
     */
    public String getDate() {
        return date;
    }

    /**
     * 
     * @param date
     *     The Date
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * 
     * @return
     *     The epochDate
     */
    public int getEpochDate() {
        return epochDate;
    }

    /**
     * 
     * @param epochDate
     *     The EpochDate
     */
    public void setEpochDate(int epochDate) {
        this.epochDate = epochDate;
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
     *     The day
     */
    public Day getDay() {
        return day;
    }

    /**
     * 
     * @param day
     *     The Day
     */
    public void setDay(Day day) {
        this.day = day;
    }

    /**
     * 
     * @return
     *     The night
     */
    public Night getNight() {
        return night;
    }

    /**
     * 
     * @param night
     *     The Night
     */
    public void setNight(Night night) {
        this.night = night;
    }

    /**
     * 
     * @return
     *     The sources
     */
    public List<String> getSources() {
        return sources;
    }

    /**
     * 
     * @param sources
     *     The Sources
     */
    public void setSources(List<String> sources) {
        this.sources = sources;
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
