package com.example.foodtruck.controller;

import com.example.foodtruck.dto.ResultDTO;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class FoodTruckControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testGetFoodTruckInfo() throws Exception {
        String locationDescription = "TOWNSEND ST: LUSK ST to 04TH ST (252 - 299)";
        String objectId = "1328724";
        String facilityType = "Truck";
        List<String> foodItems = new ArrayList<>();
        foodItems.add("Hot Dogs");
        foodItems.add("Hamburgers");
        foodItems.add("Nachos");
        foodItems.add("Steaks");
        foodItems.add("Pastas");
        foodItems.add("Asian Dishes");
        foodItems.add("Tri-Tip Sandwiches");
        foodItems.add("Sodas & Water");

        ResultDTO first = new ResultDTO(objectId, facilityType, locationDescription, foodItems);

        String objectIdSecond = "1328723";
        ResultDTO second = new ResultDTO(objectIdSecond, facilityType, locationDescription, foodItems);

        List<ResultDTO> resultDTOList = new ArrayList<>();
        resultDTOList.add(first);
        resultDTOList.add(second);

        String apiUrl = "/food-truck";

        MvcResult result = mockMvc.perform(MockMvcRequestBuilders.get(apiUrl)
                .param("locationDescription", locationDescription)
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isOk()).andReturn();

        ObjectMapper mapper = new ObjectMapper();
        String jsonString = mapper.writeValueAsString(resultDTOList);

        assertEquals(jsonString, result.getResponse().getContentAsString());
    }
}
