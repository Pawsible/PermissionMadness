
package com.braindamage.permissionmadness.Model.Model.ForecastModel;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Day {

    @SerializedName("Icon")
    @Expose
    private int icon;
    @SerializedName("IconPhrase")
    @Expose
    private String iconPhrase;

    /**
     * 
     * @return
     *     The icon
     */
    public int getIcon() {
        return icon;
    }

    /**
     * 
     * @param icon
     *     The Icon
     */
    public void setIcon(int icon) {
        this.icon = icon;
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

}
