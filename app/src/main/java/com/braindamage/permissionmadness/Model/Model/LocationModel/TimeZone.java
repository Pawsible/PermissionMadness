
package com.braindamage.permissionmadness.Model.Model.LocationModel;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class TimeZone {

    @SerializedName("Code")
    @Expose
    private String code;
    @SerializedName("Name")
    @Expose
    private String name;
    @SerializedName("GmtOffset")
    @Expose
    private double gmtOffset;
    @SerializedName("IsDaylightSaving")
    @Expose
    private boolean isDaylightSaving;
    @SerializedName("NextOffsetChange")
    @Expose
    private Object nextOffsetChange;

    /**
     * 
     * @return
     *     The code
     */
    public String getCode() {
        return code;
    }

    /**
     * 
     * @param code
     *     The Code
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * 
     * @return
     *     The name
     */
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name
     *     The Name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     * @return
     *     The gmtOffset
     */
    public double getGmtOffset() {
        return gmtOffset;
    }

    /**
     * 
     * @param gmtOffset
     *     The GmtOffset
     */
    public void setGmtOffset(double gmtOffset) {
        this.gmtOffset = gmtOffset;
    }

    /**
     * 
     * @return
     *     The isDaylightSaving
     */
    public boolean isIsDaylightSaving() {
        return isDaylightSaving;
    }

    /**
     * 
     * @param isDaylightSaving
     *     The IsDaylightSaving
     */
    public void setIsDaylightSaving(boolean isDaylightSaving) {
        this.isDaylightSaving = isDaylightSaving;
    }

    /**
     * 
     * @return
     *     The nextOffsetChange
     */
    public Object getNextOffsetChange() {
        return nextOffsetChange;
    }

    /**
     * 
     * @param nextOffsetChange
     *     The NextOffsetChange
     */
    public void setNextOffsetChange(Object nextOffsetChange) {
        this.nextOffsetChange = nextOffsetChange;
    }

}
