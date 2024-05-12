package com.bankapp.master.controller;


import com.bankapp.master.entity.State;
import com.bankapp.master.service.StateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class StateController {

    private final StateService stateService;

    @Autowired
    public StateController(StateService stateService) {
        this.stateService = stateService;
    }

    @GetMapping("/states")
    @ResponseBody
    public List<State> getAllStates() {
        return stateService.getAllStates();
    }


}
