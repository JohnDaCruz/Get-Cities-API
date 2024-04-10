package com.jhon.worldapi.controller;

import com.jhon.worldapi.entity.CityEntity;
import com.jhon.worldapi.entity.CityResponse;
import com.jhon.worldapi.service.CityService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@SpringBootTest
class CityControllerTest {

    @Mock
    CityService cityService;

    @InjectMocks
    CityController cityController;
    
    @Test
    void getAllCities_ReturnFound() {
        //Arrange
        List<CityEntity> cities = List.of(new CityEntity(1, "City1", "County1"));
        CityResponse cityResponse = new CityResponse(cities);

        //Act
        when(cityService.getAllCities()).thenReturn(cityResponse);
        ResponseEntity<CityResponse> responseEntity = cityController.getAll();

        //Assert
        assertEquals(HttpStatus.FOUND, responseEntity.getStatusCode());
    }

    @Test
    void getAllCities_ReturnServerError(){
        //Arrange
        when(cityService.getAllCities()).thenReturn(null);

        //Act
        ResponseEntity<CityResponse> responseEntity = cityController.getAll();

        //Assert
        assertEquals(HttpStatus.INTERNAL_SERVER_ERROR,responseEntity.getStatusCode());
    }

}