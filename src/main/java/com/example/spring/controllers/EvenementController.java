package com.example.spring.controllers;


import com.example.spring.persistance.entities.Evenement;
import com.example.spring.service.interfaces.IEvenementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/evenement")
public class EvenementController {

    private final IEvenementService evenementService;

    @Autowired
    public EvenementController(@Qualifier ("evenementServiceIMPL") IEvenementService evenementService) {
        this.evenementService = evenementService;
    }
    @GetMapping("/getevents")
    public List<Evenement> getAllEvents() {
        return evenementService.getAllEvents();
    }

    @GetMapping("/getevents/{id}")
    public Evenement getEventById(@PathVariable Long id) {
        return evenementService.getEventById(id);
    }

    @PostMapping("/addevent")
    public Evenement createEvent(@RequestBody Evenement evenement) {
        return evenementService.saveEvenement(evenement);
    }

    @PutMapping("/editevent/{id}")
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

    @DeleteMapping("/delevent/{id}")
    public void deleteEventById(@PathVariable Long id) {
        evenementService.deleteEventById(id);
    }
}
