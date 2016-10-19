
package com.braindamage.permissionmadness.Model.Model.LocationModel;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class SupplementalAdminArea {

    @SerializedName("Level")
    @Expose
    private int level;
    @SerializedName("LocalizedName")
    @Expose
    private String localizedName;
    @SerializedName("EnglishName")
    @Expose
    private String englishName;

    /**
     * 
     * @return
     *     The level
     */
    public int getLevel() {
        return level;
    }

    /**
     * 
     * @param level
     *     The Level
     */
    public void setLevel(int level) {
        this.level = level;
    }

    /**
     * 
     * @return
     *     The localizedName
     */
    public String getLocalizedName() {
        return localizedName;
    }

    /**
     * 
     * @param localizedName
     *     The LocalizedName
     */
    public void setLocalizedName(String localizedName) {
        this.localizedName = localizedName;
    }

    /**
     * 
     * @return
     *     The englishName
     */
    public String getEnglishName() {
        return englishName;
    }

    /**
     * 
     * @param englishName
     *     The EnglishName
     */
    public void setEnglishName(String englishName) {
        this.englishName = englishName;
    }

}
