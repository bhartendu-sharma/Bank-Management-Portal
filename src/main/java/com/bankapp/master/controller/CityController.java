package com.bankapp.master.controller;

import com.bankapp.master.entity.City;
import com.bankapp.master.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class CityController {
    private final CityService cityService;

    @Autowired
    public CityController(CityService cityService) {
        this.cityService = cityService;
    }

    @GetMapping("/cities")
    @ResponseBody
    public List<City> getAllCities() {
        return cityService.getAllCities();
    }

    @GetMapping("/cities/{stateId}")
    @ResponseBody
    public List<City> getCitiesByState(@PathVariable Long stateId) {
        return cityService.getCitiesByStateId(stateId);
    }

}
