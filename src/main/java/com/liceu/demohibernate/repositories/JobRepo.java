package com.liceu.demohibernate.repositories;

import com.liceu.demohibernate.models.Job;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobRepo extends JpaRepository<Job,Long> {
}
