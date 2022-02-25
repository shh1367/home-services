package com.example.homeservices.repository;

import com.example.homeservices.domain.entity.Boos;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BoosRepository extends JpaRepository<Boos, Long> {
}
