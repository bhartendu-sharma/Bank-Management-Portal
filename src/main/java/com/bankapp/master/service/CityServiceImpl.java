package com.bankapp.master.service;

import com.bankapp.master.entity.City;
import com.bankapp.master.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityServiceImpl implements CityService {

    private final CityRepository cityRepository;

    @Autowired
    public CityServiceImpl(CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }

    @Override
    public List<City> getAllCities() {
        return cityRepository.findAll();
    }
    @Override
    public List<City> getCitiesByStateId(Long stateId) {
        return cityRepository.findByStateId(stateId);
    }
}
