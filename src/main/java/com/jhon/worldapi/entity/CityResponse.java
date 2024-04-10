package com.jhon.worldapi.entity;

import java.util.List;

public class CityResponse {
    private List<CityEntity> cities;

    public CityResponse(List<CityEntity> cities) {
        this.cities = cities;
    }

    public List<CityEntity> getCities() {
        return cities;
    }

    public void setCities(List<CityEntity> cities) {
        this.cities = cities;
    }
}
