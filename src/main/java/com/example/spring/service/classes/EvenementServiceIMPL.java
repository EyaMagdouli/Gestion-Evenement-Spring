package com.example.spring.service.classes;

import com.example.spring.persistance.entities.Evenement;
import com.example.spring.persistance.repositories.EvenementRepository;
import com.example.spring.service.interfaces.IEvenementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EvenementServiceIMPL implements IEvenementService {
    private final EvenementRepository evenementRepository;

    @Autowired
    public EvenementServiceIMPL(EvenementRepository evenementRepository) {
        this.evenementRepository = evenementRepository;
    }

    @Override
    public List<Evenement> getAllEvents() {
        return evenementRepository.findAll();
    }

    @Override
    public Evenement getEventById(Long id) {
        Optional<Evenement> evenement = evenementRepository.findById(id);
        if (evenement.isPresent()) {
            return evenement.get();
        } else {
            throw new RuntimeException("Event not found with ID: " + id);
        }
    }
    @Override
    public Evenement saveEvenement(Evenement evenement) {
        return evenementRepository.save(evenement);
    }

    @Override
    public void deleteEventById(Long id) {
        evenementRepository.deleteById(id);
    }
}
