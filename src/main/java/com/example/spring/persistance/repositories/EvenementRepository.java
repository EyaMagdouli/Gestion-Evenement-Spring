package com.example.spring.persistance.repositories;

import com.example.spring.persistance.entities.Evenement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EvenementRepository extends JpaRepository<Evenement,Long> {
}
