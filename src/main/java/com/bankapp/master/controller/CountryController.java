package com.bankapp.master.controller;

import com.bankapp.master.entity.Country;
import com.bankapp.master.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class CountryController {

    private final CountryService countryService;

    @Autowired
    public CountryController(CountryService countryService) {
        this.countryService = countryService;
    }


    @GetMapping("/countries")
    @ResponseBody
    public List<Country> getAllCountries() {
        return countryService.getAllCountries();
    }
}
