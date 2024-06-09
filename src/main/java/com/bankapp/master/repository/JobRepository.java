package com.bankapp.master.repository;

import com.bankapp.master.entity.JobTitle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobRepository extends JpaRepository<JobTitle,Long> {
}
