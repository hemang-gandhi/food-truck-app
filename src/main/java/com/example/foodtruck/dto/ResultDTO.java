package com.example.foodtruck.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * The ResultDTO is the response returned to the user/UI
 * objectId: ObejectID value of the food truck from the SF Dataset
 * facilityType: Facility type, e.g., Truck
 * locationDescription: The requested location description
 * foodItems: All available food truck item types.
 * Author: Hemang Gandhi
 */
public class ResultDTO {
    @JsonProperty("objectId")
    private String objectId;
    @JsonProperty("facilityType")
    private String facilityType;
    @JsonProperty("locationDescription")
    private String locationDescription;
    @JsonProperty("foodItems")
    private List<String> foodItems;

    public ResultDTO(String objectId, String facilityType, String locationDescription, List<String> foodItems) {
        this.objectId = objectId;
        this.facilityType = facilityType;
        this.locationDescription = locationDescription;
        this.foodItems = foodItems;
    }
}
