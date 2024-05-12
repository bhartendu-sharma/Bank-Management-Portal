package com.bankapp.master.controller;

import com.bankapp.master.entity.City;
import com.bankapp.master.entity.PinCode;
import com.bankapp.master.service.PinCodeService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class PinCodeController {
    private final PinCodeService pincodeService;

    public PinCodeController(PinCodeService pincodeService) {
        this.pincodeService = pincodeService;
    }

    @GetMapping("/pincodes")
    @ResponseBody
    public List<PinCode> getAllPinCodes() {
        return pincodeService.getAllPincodes();
    }


    @GetMapping("/pincodes/{stateId}")
    @ResponseBody
    public List<PinCode> getPinCodesByState(@PathVariable Long stateId) {
        return pincodeService.getPincodesByStateId(stateId);
    }

}
