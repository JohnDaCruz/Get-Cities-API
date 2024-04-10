package com.jhon.worldapi.controller;

import com.jhon.worldapi.entity.CityEntity;
import com.jhon.worldapi.entity.CityResponse;
import com.jhon.worldapi.repository.CityRepository;
import com.jhon.worldapi.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.ErrorResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class CityController {

    private final CityService cityService;

    @Autowired
    public CityController(CityService cityService) {
        this.cityService = cityService;
    }

    @GetMapping("/get-cities")
    public ResponseEntity<CityResponse> getAll(){
        try{
            var cityServiceReturn = cityService.getAllCities();
            if(cityServiceReturn == null){
                return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
            }
            return ResponseEntity.status(HttpStatus.FOUND).body(cityServiceReturn);

        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.FOUND).build();
        }
    }
}
