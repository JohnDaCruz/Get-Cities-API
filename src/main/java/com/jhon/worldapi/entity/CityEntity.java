package com.jhon.worldapi.entity;

import jakarta.persistence.*;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.List;



@Entity
@Table(name = "city")
public class CityEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private int id;

    @Column(name = "Name", length = 35, nullable = false)
    private String name;

    @Column(name = "CountryCode", length = 3, nullable = false)
    private String countryCode;

    @Column(name = "District", length = 20, nullable = false)
    private String district;

    @Column(name = "Population", nullable = false)
    private int population;

    public CityEntity() {

    }

    public CityEntity(int id, String name, String countryCode, String district, int population) {
        this.id = id;
        this.name = name;
        this.countryCode = countryCode;
        this.district = district;
        this.population = population;
    }

    public CityEntity(int id, String city1, String country1) {
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

}
