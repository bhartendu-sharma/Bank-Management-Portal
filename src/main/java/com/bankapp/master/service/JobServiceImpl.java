package com.bankapp.master.service;

import com.bankapp.master.entity.JobTitle;
import com.bankapp.master.repository.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class JobServiceImpl implements JobService{

    private final JobRepository jobRepository;

    @Autowired
    public JobServiceImpl(JobRepository jobRepository) {
        this.jobRepository = jobRepository;
    }

    @Override
    public List<JobTitle> getAllJobTitles() {
        return jobRepository.findAll();
    }
}
