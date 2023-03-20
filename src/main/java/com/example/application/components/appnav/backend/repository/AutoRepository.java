package com.example.application.components.appnav.backend.repository;

import com.example.application.components.appnav.backend.domain.Auto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AutoRepository extends JpaRepository<Auto, Long> {

}
