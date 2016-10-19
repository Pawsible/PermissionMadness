
package com.braindamage.permissionmadness.Model.Model.ForecastModel;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Headline {

    @SerializedName("EffectiveDate")
    @Expose
    private String effectiveDate;
    @SerializedName("EffectiveEpochDate")
    @Expose
    private int effectiveEpochDate;
    @SerializedName("Severity")
    @Expose
    private int severity;
    @SerializedName("Text")
    @Expose
    private String text;
    @SerializedName("Category")
    @Expose
    private String category;
    @SerializedName("EndDate")
    @Expose
    private String endDate;
    @SerializedName("EndEpochDate")
    @Expose
    private int endEpochDate;
    @SerializedName("MobileLink")
    @Expose
    private String mobileLink;
    @SerializedName("Link")
    @Expose
    private String link;

    /**
     * 
     * @return
     *     The effectiveDate
     */
    public String getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * 
     * @param effectiveDate
     *     The EffectiveDate
     */
    public void setEffectiveDate(String effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    /**
     * 
     * @return
     *     The effectiveEpochDate
     */
    public int getEffectiveEpochDate() {
        return effectiveEpochDate;
    }

    /**
     * 
     * @param effectiveEpochDate
     *     The EffectiveEpochDate
     */
    public void setEffectiveEpochDate(int effectiveEpochDate) {
        this.effectiveEpochDate = effectiveEpochDate;
    }

    /**
     * 
     * @return
     *     The severity
     */
    public int getSeverity() {
        return severity;
    }

    /**
     * 
     * @param severity
     *     The Severity
     */
    public void setSeverity(int severity) {
        this.severity = severity;
    }

    /**
     * 
     * @return
     *     The text
     */
    public String getText() {
        return text;
    }

    /**
     * 
     * @param text
     *     The Text
     */
    public void setText(String text) {
        this.text = text;
    }

    /**
     * 
     * @return
     *     The category
     */
    public String getCategory() {
        return category;
    }

    /**
     * 
     * @param category
     *     The Category
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * 
     * @return
     *     The endDate
     */
    public String getEndDate() {
        return endDate;
    }

    /**
     * 
     * @param endDate
     *     The EndDate
     */
    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    /**
     * 
     * @return
     *     The endEpochDate
     */
    public int getEndEpochDate() {
        return endEpochDate;
    }

    /**
     * 
     * @param endEpochDate
     *     The EndEpochDate
     */
    public void setEndEpochDate(int endEpochDate) {
        this.endEpochDate = endEpochDate;
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
