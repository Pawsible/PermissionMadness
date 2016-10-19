
package com.braindamage.permissionmadness.Model.Model.LocationModel;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class LocationPojo {

    @SerializedName("Version")
    @Expose
    private int version;
    @SerializedName("Key")
    @Expose
    private String key;
    @SerializedName("Type")
    @Expose
    private String type;
    @SerializedName("Rank")
    @Expose
    private int rank;
    @SerializedName("LocalizedName")
    @Expose
    private String localizedName;
    @SerializedName("EnglishName")
    @Expose
    private String englishName;
    @SerializedName("PrimaryPostalCode")
    @Expose
    private String primaryPostalCode;
    @SerializedName("Region")
    @Expose
    private Region region;
    @SerializedName("Country")
    @Expose
    private Country country;
    @SerializedName("AdministrativeArea")
    @Expose
    private AdministrativeArea administrativeArea;
    @SerializedName("TimeZone")
    @Expose
    private TimeZone timeZone;
    @SerializedName("GeoPosition")
    @Expose
    private GeoPosition geoPosition;
    @SerializedName("IsAlias")
    @Expose
    private boolean isAlias;
    @SerializedName("SupplementalAdminAreas")
    @Expose
    private List<SupplementalAdminArea> supplementalAdminAreas = new ArrayList<SupplementalAdminArea>();

    /**
     * 
     * @return
     *     The version
     */
    public int getVersion() {
        return version;
    }

    /**
     * 
     * @param version
     *     The Version
     */
    public void setVersion(int version) {
        this.version = version;
    }

    /**
     * 
     * @return
     *     The key
     */
    public String getKey() {
        return key;
    }

    /**
     * 
     * @param key
     *     The Key
     */
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * 
     * @return
     *     The type
     */
    public String getType() {
        return type;
    }

    /**
     * 
     * @param type
     *     The Type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 
     * @return
     *     The rank
     */
    public int getRank() {
        return rank;
    }

    /**
     * 
     * @param rank
     *     The Rank
     */
    public void setRank(int rank) {
        this.rank = rank;
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

    /**
     * 
     * @return
     *     The primaryPostalCode
     */
    public String getPrimaryPostalCode() {
        return primaryPostalCode;
    }

    /**
     * 
     * @param primaryPostalCode
     *     The PrimaryPostalCode
     */
    public void setPrimaryPostalCode(String primaryPostalCode) {
        this.primaryPostalCode = primaryPostalCode;
    }

    /**
     * 
     * @return
     *     The region
     */
    public Region getRegion() {
        return region;
    }

    /**
     * 
     * @param region
     *     The Region
     */
    public void setRegion(Region region) {
        this.region = region;
    }

    /**
     * 
     * @return
     *     The country
     */
    public Country getCountry() {
        return country;
    }

    /**
     * 
     * @param country
     *     The Country
     */
    public void setCountry(Country country) {
        this.country = country;
    }

    /**
     * 
     * @return
     *     The administrativeArea
     */
    public AdministrativeArea getAdministrativeArea() {
        return administrativeArea;
    }

    /**
     * 
     * @param administrativeArea
     *     The AdministrativeArea
     */
    public void setAdministrativeArea(AdministrativeArea administrativeArea) {
        this.administrativeArea = administrativeArea;
    }

    /**
     * 
     * @return
     *     The timeZone
     */
    public TimeZone getTimeZone() {
        return timeZone;
    }

    /**
     * 
     * @param timeZone
     *     The TimeZone
     */
    public void setTimeZone(TimeZone timeZone) {
        this.timeZone = timeZone;
    }

    /**
     * 
     * @return
     *     The geoPosition
     */
    public GeoPosition getGeoPosition() {
        return geoPosition;
    }

    /**
     * 
     * @param geoPosition
     *     The GeoPosition
     */
    public void setGeoPosition(GeoPosition geoPosition) {
        this.geoPosition = geoPosition;
    }

    /**
     * 
     * @return
     *     The isAlias
     */
    public boolean isIsAlias() {
        return isAlias;
    }

    /**
     * 
     * @param isAlias
     *     The IsAlias
     */
    public void setIsAlias(boolean isAlias) {
        this.isAlias = isAlias;
    }

    /**
     * 
     * @return
     *     The supplementalAdminAreas
     */
    public List<SupplementalAdminArea> getSupplementalAdminAreas() {
        return supplementalAdminAreas;
    }

    /**
     * 
     * @param supplementalAdminAreas
     *     The SupplementalAdminAreas
     */
    public void setSupplementalAdminAreas(List<SupplementalAdminArea> supplementalAdminAreas) {
        this.supplementalAdminAreas = supplementalAdminAreas;
    }

}
