package com.example.validation.services;

import com.example.validation.entity.Job;
import com.example.validation.exception.ResourceEmptyException;
import com.example.validation.repository.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JobService {
    @Autowired
    private JobRepository jobRepository;
    public void saveJob(Job job) throws ResourceEmptyException {
        if (jobRepository.existsJobByJobName(job.getJobName())){
            jobRepository.save(job);
        }else {
            jobRepository.save(job);
        }
    }
}
