package com.bankapp.master.service;

import com.bankapp.master.entity.City;

import java.util.List;

public interface CityService {
    List<City> getAllCities();
    List<City> getCitiesByStateId(Long stateId);

    }
