package com.example.homeservices.repository;


import com.example.homeservices.domain.entity.Specialist;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpecialistRepository extends JpaRepository<Specialist, Long> {
}
