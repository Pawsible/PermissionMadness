
package com.braindamage.permissionmadness.Model.Model.CurrentWeatherrModel;

import javax.annotation.Generated;

import com.braindamage.permissionmadness.Model.Model.CurrentWeatherModel.Temperature;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class CurrentWeatherrModel {

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
    @SerializedName("RealFeelTemperature")
    @Expose
    private RealFeelTemperature realFeelTemperature;
    @SerializedName("RealFeelTemperatureShade")
    @Expose
    private RealFeelTemperatureShade realFeelTemperatureShade;
    @SerializedName("RelativeHumidity")
    @Expose
    private int relativeHumidity;
    @SerializedName("DewPoint")
    @Expose
    private DewPoint dewPoint;
    @SerializedName("Wind")
    @Expose
    private Wind wind;
    @SerializedName("WindGust")
    @Expose
    private WindGust windGust;
    @SerializedName("UVIndex")
    @Expose
    private int uVIndex;
    @SerializedName("UVIndexText")
    @Expose
    private String uVIndexText;
    @SerializedName("Visibility")
    @Expose
    private Visibility visibility;
    @SerializedName("ObstructionsToVisibility")
    @Expose
    private String obstructionsToVisibility;
    @SerializedName("CloudCover")
    @Expose
    private int cloudCover;
    @SerializedName("Ceiling")
    @Expose
    private Ceiling ceiling;
    @SerializedName("Pressure")
    @Expose
    private Pressure pressure;
    @SerializedName("PressureTendency")
    @Expose
    private PressureTendency pressureTendency;
    @SerializedName("Past24HourTemperatureDeparture")
    @Expose
    private Past24HourTemperatureDeparture past24HourTemperatureDeparture;
    @SerializedName("ApparentTemperature")
    @Expose
    private ApparentTemperature apparentTemperature;
    @SerializedName("WindChillTemperature")
    @Expose
    private WindChillTemperature windChillTemperature;
    @SerializedName("WetBulbTemperature")
    @Expose
    private WetBulbTemperature wetBulbTemperature;
    @SerializedName("Precip1hr")
    @Expose
    private Precip1hr precip1hr;
    @SerializedName("PrecipitationSummary")
    @Expose
    private PrecipitationSummary precipitationSummary;
    @SerializedName("TemperatureSummary")
    @Expose
    private TemperatureSummary temperatureSummary;
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
     *     The realFeelTemperature
     */
    public RealFeelTemperature getRealFeelTemperature() {
        return realFeelTemperature;
    }

    /**
     * 
     * @param realFeelTemperature
     *     The RealFeelTemperature
     */
    public void setRealFeelTemperature(RealFeelTemperature realFeelTemperature) {
        this.realFeelTemperature = realFeelTemperature;
    }

    /**
     * 
     * @return
     *     The realFeelTemperatureShade
     */
    public RealFeelTemperatureShade getRealFeelTemperatureShade() {
        return realFeelTemperatureShade;
    }

    /**
     * 
     * @param realFeelTemperatureShade
     *     The RealFeelTemperatureShade
     */
    public void setRealFeelTemperatureShade(RealFeelTemperatureShade realFeelTemperatureShade) {
        this.realFeelTemperatureShade = realFeelTemperatureShade;
    }

    /**
     * 
     * @return
     *     The relativeHumidity
     */
    public int getRelativeHumidity() {
        return relativeHumidity;
    }

    /**
     * 
     * @param relativeHumidity
     *     The RelativeHumidity
     */
    public void setRelativeHumidity(int relativeHumidity) {
        this.relativeHumidity = relativeHumidity;
    }

    /**
     * 
     * @return
     *     The dewPoint
     */
    public DewPoint getDewPoint() {
        return dewPoint;
    }

    /**
     * 
     * @param dewPoint
     *     The DewPoint
     */
    public void setDewPoint(DewPoint dewPoint) {
        this.dewPoint = dewPoint;
    }

    /**
     * 
     * @return
     *     The wind
     */
    public Wind getWind() {
        return wind;
    }

    /**
     * 
     * @param wind
     *     The Wind
     */
    public void setWind(Wind wind) {
        this.wind = wind;
    }

    /**
     * 
     * @return
     *     The windGust
     */
    public WindGust getWindGust() {
        return windGust;
    }

    /**
     * 
     * @param windGust
     *     The WindGust
     */
    public void setWindGust(WindGust windGust) {
        this.windGust = windGust;
    }

    /**
     * 
     * @return
     *     The uVIndex
     */
    public int getUVIndex() {
        return uVIndex;
    }

    /**
     * 
     * @param uVIndex
     *     The UVIndex
     */
    public void setUVIndex(int uVIndex) {
        this.uVIndex = uVIndex;
    }

    /**
     * 
     * @return
     *     The uVIndexText
     */
    public String getUVIndexText() {
        return uVIndexText;
    }

    /**
     * 
     * @param uVIndexText
     *     The UVIndexText
     */
    public void setUVIndexText(String uVIndexText) {
        this.uVIndexText = uVIndexText;
    }

    /**
     * 
     * @return
     *     The visibility
     */
    public Visibility getVisibility() {
        return visibility;
    }

    /**
     * 
     * @param visibility
     *     The Visibility
     */
    public void setVisibility(Visibility visibility) {
        this.visibility = visibility;
    }

    /**
     * 
     * @return
     *     The obstructionsToVisibility
     */
    public String getObstructionsToVisibility() {
        return obstructionsToVisibility;
    }

    /**
     * 
     * @param obstructionsToVisibility
     *     The ObstructionsToVisibility
     */
    public void setObstructionsToVisibility(String obstructionsToVisibility) {
        this.obstructionsToVisibility = obstructionsToVisibility;
    }

    /**
     * 
     * @return
     *     The cloudCover
     */
    public int getCloudCover() {
        return cloudCover;
    }

    /**
     * 
     * @param cloudCover
     *     The CloudCover
     */
    public void setCloudCover(int cloudCover) {
        this.cloudCover = cloudCover;
    }

    /**
     * 
     * @return
     *     The ceiling
     */
    public Ceiling getCeiling() {
        return ceiling;
    }

    /**
     * 
     * @param ceiling
     *     The Ceiling
     */
    public void setCeiling(Ceiling ceiling) {
        this.ceiling = ceiling;
    }

    /**
     * 
     * @return
     *     The pressure
     */
    public Pressure getPressure() {
        return pressure;
    }

    /**
     * 
     * @param pressure
     *     The Pressure
     */
    public void setPressure(Pressure pressure) {
        this.pressure = pressure;
    }

    /**
     * 
     * @return
     *     The pressureTendency
     */
    public PressureTendency getPressureTendency() {
        return pressureTendency;
    }

    /**
     * 
     * @param pressureTendency
     *     The PressureTendency
     */
    public void setPressureTendency(PressureTendency pressureTendency) {
        this.pressureTendency = pressureTendency;
    }

    /**
     * 
     * @return
     *     The past24HourTemperatureDeparture
     */
    public Past24HourTemperatureDeparture getPast24HourTemperatureDeparture() {
        return past24HourTemperatureDeparture;
    }

    /**
     * 
     * @param past24HourTemperatureDeparture
     *     The Past24HourTemperatureDeparture
     */
    public void setPast24HourTemperatureDeparture(Past24HourTemperatureDeparture past24HourTemperatureDeparture) {
        this.past24HourTemperatureDeparture = past24HourTemperatureDeparture;
    }

    /**
     * 
     * @return
     *     The apparentTemperature
     */
    public ApparentTemperature getApparentTemperature() {
        return apparentTemperature;
    }

    /**
     * 
     * @param apparentTemperature
     *     The ApparentTemperature
     */
    public void setApparentTemperature(ApparentTemperature apparentTemperature) {
        this.apparentTemperature = apparentTemperature;
    }

    /**
     * 
     * @return
     *     The windChillTemperature
     */
    public WindChillTemperature getWindChillTemperature() {
        return windChillTemperature;
    }

    /**
     * 
     * @param windChillTemperature
     *     The WindChillTemperature
     */
    public void setWindChillTemperature(WindChillTemperature windChillTemperature) {
        this.windChillTemperature = windChillTemperature;
    }

    /**
     * 
     * @return
     *     The wetBulbTemperature
     */
    public WetBulbTemperature getWetBulbTemperature() {
        return wetBulbTemperature;
    }

    /**
     * 
     * @param wetBulbTemperature
     *     The WetBulbTemperature
     */
    public void setWetBulbTemperature(WetBulbTemperature wetBulbTemperature) {
        this.wetBulbTemperature = wetBulbTemperature;
    }

    /**
     * 
     * @return
     *     The precip1hr
     */
    public Precip1hr getPrecip1hr() {
        return precip1hr;
    }

    /**
     * 
     * @param precip1hr
     *     The Precip1hr
     */
    public void setPrecip1hr(Precip1hr precip1hr) {
        this.precip1hr = precip1hr;
    }

    /**
     * 
     * @return
     *     The precipitationSummary
     */
    public PrecipitationSummary getPrecipitationSummary() {
        return precipitationSummary;
    }

    /**
     * 
     * @param precipitationSummary
     *     The PrecipitationSummary
     */
    public void setPrecipitationSummary(PrecipitationSummary precipitationSummary) {
        this.precipitationSummary = precipitationSummary;
    }

    /**
     * 
     * @return
     *     The temperatureSummary
     */
    public TemperatureSummary getTemperatureSummary() {
        return temperatureSummary;
    }

    /**
     * 
     * @param temperatureSummary
     *     The TemperatureSummary
     */
    public void setTemperatureSummary(TemperatureSummary temperatureSummary) {
        this.temperatureSummary = temperatureSummary;
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
