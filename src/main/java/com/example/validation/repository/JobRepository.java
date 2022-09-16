package com.example.validation.repository;

import com.example.validation.entity.Job;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobRepository extends JpaRepository<Job, Long> {
    boolean existsJobByJobName(String jobName);
}
