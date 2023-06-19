package com.example.spring.controllers;


import com.example.spring.persistance.entities.Evenement;
import com.example.spring.persistance.entities.Formation;
import com.example.spring.service.interfaces.IFormationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Formation")
public class FormationController {

    private final IFormationService formationService;

    @Autowired
    public FormationController(IFormationService formationService){ this.formationService = formationService; }

    @GetMapping
    public List<Formation> getAllFormations(){ return formationService.getAllFormations(); }



    @GetMapping("/{id}")
    public Formation getFormationById(@PathVariable Long id){ return formationService.getFormationById(id);  }

    @PostMapping
    public Formation createFormation(@RequestBody Formation formation) {
        return formationService.saveFormation(formation);
    }

    @PutMapping("/{id}")
    public Formation updateFormation(@PathVariable Long id, @RequestBody Formation formation) {
        Optional<Formation> existingFormation = Optional.ofNullable(formationService.getFormationById(id));
        if (existingFormation.isPresent()) {
            Formation updatedFormation = existingFormation.get();
            updatedFormation.setNom(formation.getNom());
            updatedFormation.setTypeForm(formation.getTypeForm());
            return formationService.saveFormation(updatedFormation);
        } else {
            throw new RuntimeException("Formation not found with ID: " + id);
        }
    }

    @DeleteMapping("/{id}")
    public void deleteFormationById(@PathVariable Long id) {
        formationService.deleteFormationById(id);
    }
}
