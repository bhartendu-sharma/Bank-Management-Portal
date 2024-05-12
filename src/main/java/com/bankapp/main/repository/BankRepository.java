package com.bankapp.main.repository;

import com.bankapp.main.entity.Bank;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BankRepository extends JpaRepository<Bank, Long> {
    // You can add custom query methods here if needed
}
