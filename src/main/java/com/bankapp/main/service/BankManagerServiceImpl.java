package com.bankapp.main.service;

import com.bankapp.main.entity.BankManager;
import com.bankapp.main.repository.BankManagerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BankManagerServiceImpl implements BankManagerService {

    private final BankManagerRepository bankManagerRepository;

    @Autowired
    public BankManagerServiceImpl(BankManagerRepository bankManagerRepository) {
        this.bankManagerRepository = bankManagerRepository;
    }

    @Override
    public void saveBankManager(BankManager bankManager) {
        bankManagerRepository.save(bankManager);
    }

    @Override
    public List<BankManager> getAllBankManagers() {
        return bankManagerRepository.findAll();
    }

    @Override
    public Optional<BankManager> getBankManagerById(Long id) {
        return bankManagerRepository.findById(id);
    }

    @Override
    public void deleteBankManagerById(Long id) {
        bankManagerRepository.deleteById(id);
    }

}
