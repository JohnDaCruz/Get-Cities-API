package com.jhon.worldapi.service;

import com.jhon.worldapi.entity.CityEntity;
import com.jhon.worldapi.entity.CityResponse;
import com.jhon.worldapi.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityService {
    public final CityRepository cityRepository;

    @Autowired
    public CityService(CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }

    public CityResponse getAllCities(){
        List<CityEntity> getCities = cityRepository.findAll();
        //List<CityEntity> cities = getCities.to;
        return new CityResponse(getCities);
    }
}
