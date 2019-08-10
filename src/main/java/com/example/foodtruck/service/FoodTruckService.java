package com.example.foodtruck.service;

import com.example.foodtruck.dto.ResultDTO;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Service interface
 * Author: Hemang Gandhi
 */
@Service
public interface FoodTruckService {
    List<ResultDTO> getFoodTruckInfo(String locationDescription);
}
