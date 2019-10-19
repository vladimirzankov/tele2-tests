package ru.zankov.model;

public class Region {

    private String regionId;
    private String regionName;
    private String roamingProductId;
    private String roamingSlug;
    private String regionGroupName;
    private String areaSlug;

    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public String getRoamingProductId() {
        return roamingProductId;
    }

    public void setRoamingProductId(String roamingProductId) {
        this.roamingProductId = roamingProductId;
    }

    public String getRoamingSlug() {
        return roamingSlug;
    }

    public void setRoamingSlug(String roamingSlug) {
        this.roamingSlug = roamingSlug;
    }

    public String getRegionGroupName() {
        return regionGroupName;
    }

    public void setRegionGroupName(String regionGroupName) {
        this.regionGroupName = regionGroupName;
    }

    public String getAreaSlug() {
        return areaSlug;
    }

    public void setAreaSlug(String areaSlug) {
        this.areaSlug = areaSlug;
    }
}
