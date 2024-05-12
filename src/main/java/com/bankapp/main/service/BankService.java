package com.bankapp.main.service;

import com.bankapp.main.entity.Bank;

import java.util.List;

public interface BankService {
    List<Bank> getAllBanks();
    Bank getBankById(Long id);
    Bank registerBank(Bank bank);
    void deleteBank(Long id);
}
