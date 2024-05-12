package com.bankapp.master.service;

import com.bankapp.master.entity.PinCode;
import com.bankapp.master.repository.PinCodeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PinCodeServiceImpl implements PinCodeService {

    private final PinCodeRepository pincodeRepository;

    @Autowired
    public PinCodeServiceImpl(PinCodeRepository pincodeRepository) {
        this.pincodeRepository = pincodeRepository;
    }

    @Override
    public List<PinCode> getAllPincodes() {
        return pincodeRepository.findAll();
    }
    @Override
    public List<PinCode> getPincodesByStateId(Long stateId) {
        return pincodeRepository.findByCity_StateId(stateId);

    }
}
