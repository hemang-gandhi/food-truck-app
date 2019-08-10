package com.example.foodtruck.models;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * The response from the public SF Data set for food trucks.
 * Only relevant information for this prototype are fetched,
 * although all other properties are kept to extend for any other functionality.
 * Author: Hemang Gandhi
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "objectid",
        "applicant",
        "facilitytype",
        "cnn",
        "locationdescription",
        "address",
        "blocklot",
        "block",
        "lot",
        "permit",
        "status",
        "fooditems",
        "x",
        "y",
        "latitude",
        "longitude",
        "schedule",
        "approved",
        "received",
        "priorpermit",
        "expirationdate",
        "location",
        "dayshours"
})
public class FoodTruckResponse {

    @JsonProperty("objectid")
    private String objectid;
    @JsonProperty("applicant")
    private String applicant;
    @JsonProperty("facilitytype")
    private String facilitytype;
    @JsonProperty("cnn")
    private String cnn;
    @JsonProperty("locationdescription")
    private String locationdescription;
    @JsonProperty("address")
    private String address;
    @JsonProperty("blocklot")
    private String blocklot;
    @JsonProperty("block")
    private String block;
    @JsonProperty("lot")
    private String lot;
    @JsonProperty("permit")
    private String permit;
    @JsonProperty("status")
    private String status;
    @JsonProperty("fooditems")
    private String fooditems;
    @JsonProperty("x")
    private String x;
    @JsonProperty("y")
    private String y;
    @JsonProperty("latitude")
    private String latitude;
    @JsonProperty("longitude")
    private String longitude;
    @JsonProperty("schedule")
    private String schedule;
    @JsonProperty("approved")
    private String approved;
    @JsonProperty("received")
    private String received;
    @JsonProperty("priorpermit")
    private String priorpermit;
    @JsonProperty("expirationdate")
    private String expirationdate;
    @JsonProperty("location")
    private Location location;
    @JsonProperty("dayshours")
    private String dayshours;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("objectid")
    public String getObjectid() {
        return objectid;
    }

    @JsonProperty("objectid")
    public void setObjectid(String objectid) {
        this.objectid = objectid;
    }

    @JsonProperty("applicant")
    public String getApplicant() {
        return applicant;
    }

    @JsonProperty("applicant")
    public void setApplicant(String applicant) {
        this.applicant = applicant;
    }

    @JsonProperty("facilitytype")
    public String getFacilitytype() {
        return facilitytype;
    }

    @JsonProperty("facilitytype")
    public void setFacilitytype(String facilitytype) {
        this.facilitytype = facilitytype;
    }

    @JsonProperty("cnn")
    public String getCnn() {
        return cnn;
    }

    @JsonProperty("cnn")
    public void setCnn(String cnn) {
        this.cnn = cnn;
    }

    @JsonProperty("locationdescription")
    public String getLocationdescription() {
        return locationdescription;
    }

    @JsonProperty("locationdescription")
    public void setLocationdescription(String locationdescription) {
        this.locationdescription = locationdescription;
    }

    @JsonProperty("address")
    public String getAddress() {
        return address;
    }

    @JsonProperty("address")
    public void setAddress(String address) {
        this.address = address;
    }

    @JsonProperty("blocklot")
    public String getBlocklot() {
        return blocklot;
    }

    @JsonProperty("blocklot")
    public void setBlocklot(String blocklot) {
        this.blocklot = blocklot;
    }

    @JsonProperty("block")
    public String getBlock() {
        return block;
    }

    @JsonProperty("block")
    public void setBlock(String block) {
        this.block = block;
    }

    @JsonProperty("lot")
    public String getLot() {
        return lot;
    }

    @JsonProperty("lot")
    public void setLot(String lot) {
        this.lot = lot;
    }

    @JsonProperty("permit")
    public String getPermit() {
        return permit;
    }

    @JsonProperty("permit")
    public void setPermit(String permit) {
        this.permit = permit;
    }

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    @JsonProperty("fooditems")
    public String getFooditems() {
        return fooditems;
    }

    @JsonProperty("fooditems")
    public void setFooditems(String fooditems) {
        this.fooditems = fooditems;
    }

    @JsonProperty("x")
    public String getX() {
        return x;
    }

    @JsonProperty("x")
    public void setX(String x) {
        this.x = x;
    }

    @JsonProperty("y")
    public String getY() {
        return y;
    }

    @JsonProperty("y")
    public void setY(String y) {
        this.y = y;
    }

    @JsonProperty("latitude")
    public String getLatitude() {
        return latitude;
    }

    @JsonProperty("latitude")
    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    @JsonProperty("longitude")
    public String getLongitude() {
        return longitude;
    }

    @JsonProperty("longitude")
    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    @JsonProperty("schedule")
    public String getSchedule() {
        return schedule;
    }

    @JsonProperty("schedule")
    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    @JsonProperty("approved")
    public String getApproved() {
        return approved;
    }

    @JsonProperty("approved")
    public void setApproved(String approved) {
        this.approved = approved;
    }

    @JsonProperty("received")
    public String getReceived() {
        return received;
    }

    @JsonProperty("received")
    public void setReceived(String received) {
        this.received = received;
    }

    @JsonProperty("priorpermit")
    public String getPriorpermit() {
        return priorpermit;
    }

    @JsonProperty("priorpermit")
    public void setPriorpermit(String priorpermit) {
        this.priorpermit = priorpermit;
    }

    @JsonProperty("expirationdate")
    public String getExpirationdate() {
        return expirationdate;
    }

    @JsonProperty("expirationdate")
    public void setExpirationdate(String expirationdate) {
        this.expirationdate = expirationdate;
    }

    @JsonProperty("location")
    public Location getLocation() {
        return location;
    }

    @JsonProperty("location")
    public void setLocation(Location location) {
        this.location = location;
    }

    @JsonProperty("dayshours")
    public String getDayshours() {
        return dayshours;
    }

    @JsonProperty("dayshours")
    public void setDayshours(String dayshours) {
        this.dayshours = dayshours;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}

