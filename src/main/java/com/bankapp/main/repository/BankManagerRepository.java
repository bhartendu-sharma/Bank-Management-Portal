package com.bankapp.main.repository;

import com.bankapp.main.entity.BankManager;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BankManagerRepository extends JpaRepository<BankManager, Long> {
    // Add custom query methods if needed
}

