
package com.braindamage.permissionmadness.Model.Model.CurrentWeatherrModel;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class PressureTendency {

    @SerializedName("LocalizedText")
    @Expose
    private String localizedText;
    @SerializedName("Code")
    @Expose
    private String code;

    /**
     * 
     * @return
     *     The localizedText
     */
    public String getLocalizedText() {
        return localizedText;
    }

    /**
     * 
     * @param localizedText
     *     The LocalizedText
     */
    public void setLocalizedText(String localizedText) {
        this.localizedText = localizedText;
    }

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

}
