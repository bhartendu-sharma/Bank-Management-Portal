package com.bankapp.main.service;

import com.bankapp.main.entity.BankManager;

import java.util.List;
import java.util.Optional;

public interface BankManagerService {
    void saveBankManager(BankManager bankManager);
    List<BankManager> getAllBankManagers();
    Optional<BankManager> getBankManagerById(Long id);
    void deleteBankManagerById(Long id);
    // Other methods as needed
}
