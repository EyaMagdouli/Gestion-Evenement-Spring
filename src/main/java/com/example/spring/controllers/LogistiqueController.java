package com.example.spring.controllers;

import com.example.spring.persistance.entities.Logistique;
import com.example.spring.service.interfaces.ILogistiqueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/logistiques")
public class LogistiqueController {
    private final ILogistiqueService logistiqueService;

    @Autowired
    public LogistiqueController(@Qualifier("logistiqueServiceIMPL") ILogistiqueService logistiqueService) {
        this.logistiqueService = logistiqueService;
    }

    @GetMapping("/getlog")
    public List<Logistique> getAllLogistiques() {
        return logistiqueService.getAllLogistiques();
    }

    @GetMapping("/getlog/{id}")
    public Logistique getLogistiqueById(@PathVariable Long id) {
        return logistiqueService.getLogistiqueById(id);
    }

    @PostMapping("/addlog")
    public Logistique createLogistique(@RequestBody Logistique logistique) {
        return logistiqueService.saveLogistique(logistique);
    }

    @PutMapping("/updatelog/{id}")
    public Logistique updateLogistique(@PathVariable Long id, @RequestBody Logistique logistique) {
        Optional<Logistique> existingLogistique = Optional.ofNullable(logistiqueService.getLogistiqueById(id));
        if (existingLogistique.isPresent()) {
            Logistique updatedLogistique = existingLogistique.get();
            updatedLogistique.setNomLog(logistique.getNomLog());
            updatedLogistique.setTypeLog(logistique.getTypeLog());
            updatedLogistique.setDisponibilite(logistique.isDisponibilite());
            updatedLogistique.setStatusPercentage(logistique.getStatusPercentage());
            return logistiqueService.saveLogistique(updatedLogistique);
        } else {
            throw new RuntimeException("Logistique not found with ID: " + id);
        }
    }

    @DeleteMapping("/deletelog/{id}")
    public void deleteLogistiqueById(@PathVariable Long id) {
        logistiqueService.deleteLogistiqueById(id);
    }
}