package com.hrworker.repositories;

import com.hrworker.entities.Worker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface WorkerRepository extends JpaRepository<Worker, Long> {
}
