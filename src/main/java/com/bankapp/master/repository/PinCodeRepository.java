package com.bankapp.master.repository;

import com.bankapp.master.entity.PinCode;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PinCodeRepository extends JpaRepository<PinCode, Long> {
    List<PinCode> findByCity_StateId(Long stateId);

}
