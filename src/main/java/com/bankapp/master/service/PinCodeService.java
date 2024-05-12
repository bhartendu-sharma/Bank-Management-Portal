package com.bankapp.master.service;

import com.bankapp.master.entity.PinCode;

import java.util.List;

public interface PinCodeService {
    List<PinCode> getAllPincodes();
    List<PinCode> getPincodesByStateId(Long stateId) ;

}
