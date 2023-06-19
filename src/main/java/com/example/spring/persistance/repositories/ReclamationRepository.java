package com.example.spring.persistance.repositories;

import com.example.spring.persistance.entities.Reclamation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReclamationRepository extends JpaRepository<Reclamation,Long> {
}
