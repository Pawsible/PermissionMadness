
package com.braindamage.permissionmadness.Model.Model.CurrentWeatherrModel;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Wind {

    @SerializedName("Direction")
    @Expose
    private Direction direction;
    @SerializedName("Speed")
    @Expose
    private Speed speed;

    /**
     * 
     * @return
     *     The direction
     */
    public Direction getDirection() {
        return direction;
    }

    /**
     * 
     * @param direction
     *     The Direction
     */
    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    /**
     * 
     * @return
     *     The speed
     */
    public Speed getSpeed() {
        return speed;
    }

    /**
     * 
     * @param speed
     *     The Speed
     */
    public void setSpeed(Speed speed) {
        this.speed = speed;
    }

}
