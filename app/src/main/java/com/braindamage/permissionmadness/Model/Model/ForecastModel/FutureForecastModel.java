
package com.braindamage.permissionmadness.Model.Model.ForecastModel;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class FutureForecastModel {

    @SerializedName("Headline")
    @Expose
    private Headline headline;
    @SerializedName("DailyForecasts")
    @Expose
    private List<DailyForecast> dailyForecasts = new ArrayList<DailyForecast>();

    /**
     * 
     * @return
     *     The headline
     */
    public Headline getHeadline() {
        return headline;
    }

    /**
     * 
     * @param headline
     *     The Headline
     */
    public void setHeadline(Headline headline) {
        this.headline = headline;
    }

    /**
     * 
     * @return
     *     The dailyForecasts
     */
    public List<DailyForecast> getDailyForecasts() {
        return dailyForecasts;
    }

    /**
     * 
     * @param dailyForecasts
     *     The DailyForecasts
     */
    public void setDailyForecasts(List<DailyForecast> dailyForecasts) {
        this.dailyForecasts = dailyForecasts;
    }

}
