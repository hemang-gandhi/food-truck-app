package com.example.foodtruck.controller;

import com.example.foodtruck.dto.ResultDTO;
import com.example.foodtruck.service.FoodTruckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * FoodTruckController lists the endpoint(s) and executes respective services on call
 * locationDescription: The descriptive location to get the food truck information by
 * Author: Hemang Gandhi
 */
@RestController
public class FoodTruckController {
    @Autowired
    private FoodTruckService foodTruckService;

    @GetMapping("/food-truck")
    public List<ResultDTO> getFoodTruckInfo(@RequestParam("locationDescription") String locationDescription) {
        return foodTruckService.getFoodTruckInfo(locationDescription);
    }
}
