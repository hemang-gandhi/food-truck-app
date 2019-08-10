package com.example.foodtruck.serviceImpl;

import com.example.foodtruck.dto.ResultDTO;
import com.example.foodtruck.models.FoodTruckResponse;
import com.example.foodtruck.service.FoodTruckService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Service implementation for FoodTruck API
 * Author: Hemang Gandhi
 */
@Service
public class FoodTruckServiceImpl implements FoodTruckService {

    /**
     * The token to access the public SF Data set.
     */
    @Value("${app.rememberedToken}")
    private String rememberedToken;

    /**
     * The API to fetch the food truck information by locationDescription
     */
    private static final String foodTruckApi = "https://data.sfgov.org/resource/rqzj-sfat.json?locationdescription=";

    /**
     * Overridden service method to get food truck information
     * @param locationDescription
     * @return ResultDTO
     * Author: Hemang Gandhi
     */
    @Override
    public List<ResultDTO> getFoodTruckInfo(String locationDescription) {
        final String uri = foodTruckApi + locationDescription;

        RestTemplate restTemplate = new RestTemplate();
        HttpEntity<String> entity = getHttpEntity();
        ResponseEntity<List<FoodTruckResponse>> result = restTemplate.exchange(uri, HttpMethod.GET, entity, new ParameterizedTypeReference<List<FoodTruckResponse>>() {
        });

        return getResultDTO(result);
    }

    /**
     * Method to return the result in the required format
     * @param result
     * @return List<ResultDTO>
     */
    private List<ResultDTO> getResultDTO(ResponseEntity<List<FoodTruckResponse>> result) {
        if (result != null) {
            return Objects.requireNonNull(result.getBody()).stream()
                    .map(foodTruckResponse ->
                            new ResultDTO(foodTruckResponse.getObjectid(),
                                    foodTruckResponse.getFacilitytype(),
                                    foodTruckResponse.getLocationdescription(),
                                    Arrays.asList(Optional.ofNullable(foodTruckResponse.getFooditems())
                                            .orElse("").split(": ")))
                    ).collect(Collectors.toList());
        }
        return null;
    }

    /**
     * Gets the HTTPEntity with required params
     * @return HttpEntity
     */
    private HttpEntity<String> getHttpEntity() {
        LinkedMultiValueMap<String, String> map = new LinkedMultiValueMap<>();
        map.put("Content-Type", Arrays.asList("application/json"));
        map.put("x-api-key", Arrays.asList(rememberedToken));
        return new HttpEntity<>("", map);
    }
}
