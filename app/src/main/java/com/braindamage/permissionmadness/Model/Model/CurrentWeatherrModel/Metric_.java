
package com.braindamage.permissionmadness.Model.Model.CurrentWeatherrModel;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Metric_ {

    @SerializedName("Value")
    @Expose
    private double value;
    @SerializedName("Unit")
    @Expose
    private String unit;
    @SerializedName("UnitType")
    @Expose
    private int unitType;

    /**
     * 
     * @return
     *     The value
     */
    public double getValue() {
        return value;
    }

    /**
     * 
     * @param value
     *     The Value
     */
    public void setValue(double value) {
        this.value = value;
    }

    /**
     * 
     * @return
     *     The unit
     */
    public String getUnit() {
        return unit;
    }

    /**
     * 
     * @param unit
     *     The Unit
     */
    public void setUnit(String unit) {
        this.unit = unit;
    }

    /**
     * 
     * @return
     *     The unitType
     */
    public int getUnitType() {
        return unitType;
    }

    /**
     * 
     * @param unitType
     *     The UnitType
     */
    public void setUnitType(int unitType) {
        this.unitType = unitType;
    }

}
