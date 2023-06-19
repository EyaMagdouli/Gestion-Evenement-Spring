package com.example.spring.persistance.repositories;

import com.example.spring.persistance.entities.Logistique;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LogistiqueRepository extends JpaRepository<Logistique,Long> {
}
