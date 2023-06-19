package com.example.spring.persistance.repositories;

import com.example.spring.persistance.entities.Formation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FormationRepository extends JpaRepository<Formation,Long> {
}
