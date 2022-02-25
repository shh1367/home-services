package com.example.homeservices.repository;

import com.example.homeservices.domain.entity.Favor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FavorRepository extends JpaRepository<Favor , Long> {
}
