package com.example.spring.service.interfaces;

import com.example.spring.persistance.entities.Evenement;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IEvenementService {

    List<Evenement> getAllEvents();

    Evenement getEventById(Long id);

    Evenement saveEvenement(Evenement evenement);

    void deleteEventById(Long id);
}
