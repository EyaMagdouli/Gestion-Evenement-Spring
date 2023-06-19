package com.example.spring.controllers;


import com.example.spring.persistance.entities.Evenement;
import com.example.spring.service.interfaces.IEvenementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Evenement")
public class EvenementController {

    private final IEvenementService evenementService;

    @Autowired
    public EvenementController(IEvenementService evenementService) {
        this.evenementService = evenementService;
    }

    @GetMapping
    public List<Evenement> getAllEvents() {
        return evenementService.getAllEvents();
    }

    @GetMapping("/{id}")
    public Evenement getEventById(@PathVariable Long id) {
        return evenementService.getEventById(id);
    }

    @PostMapping
    public Evenement createEvent(@RequestBody Evenement evenement) {
        return evenementService.saveEvenement(evenement);
    }

    @PutMapping("/{id}")
    public Evenement updateEvent(@PathVariable Long id, @RequestBody Evenement evenement) {
        Optional<Evenement> existingEvenement = Optional.ofNullable(evenementService.getEventById(id));
        if (existingEvenement.isPresent()) {
            Evenement updatedEvenement = existingEvenement.get();
            updatedEvenement.setNom(evenement.getNom());
            updatedEvenement.setTypeEvent(evenement.getTypeEvent());
            return evenementService.saveEvenement(updatedEvenement);
        } else {
            throw new RuntimeException("Event not found with ID: " + id);
        }
    }

    @DeleteMapping("/{id}")
    public void deleteEventById(@PathVariable Long id) {
        evenementService.deleteEventById(id);
    }
}
