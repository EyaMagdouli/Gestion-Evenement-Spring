package com.example.spring.service.classes;

import com.example.spring.persistance.entities.Logistique;
import com.example.spring.persistance.repositories.LogistiqueRepository;
import com.example.spring.service.interfaces.ILogistiqueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LogistiqueServiceIMPL implements ILogistiqueService {
    private final LogistiqueRepository logistiqueRepository;

    @Autowired
    public LogistiqueServiceIMPL(LogistiqueRepository logistiqueRepository) {
        this.logistiqueRepository = logistiqueRepository;
    }
    @Override
    public List<Logistique> getAllLogistiques() {
        return logistiqueRepository.findAll();
    }

    @Override
    public Logistique getLogistiqueById(Long id) {
        Optional<Logistique> logistique = logistiqueRepository.findById(id);
        if (logistique.isPresent()) {
            return logistique.get();
        } else {
            throw new RuntimeException("Logistique not found with ID: " + id);
        }
    }
    @Override
    public Logistique saveLogistique(Logistique logistique) {
        return logistiqueRepository.save(logistique);
    }

    @Override
    public void deleteLogistiqueById(Long id) {
        logistiqueRepository.deleteById(id);
    }
}