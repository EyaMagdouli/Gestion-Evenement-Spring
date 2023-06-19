package com.example.spring.service.classes;


import com.example.spring.persistance.entities.Formation;
import com.example.spring.persistance.repositories.FormationRepository;
import com.example.spring.service.interfaces.IFormationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FormationServiceIMPL implements IFormationService {

    private final FormationRepository formationRepository;

    @Autowired
    public FormationServiceIMPL(FormationRepository formationRepository){
        this.formationRepository = formationRepository;
    }

    @Override
    public List<Formation> getAllFormations(){ return formationRepository.findAll(); }

    @Override
    public Formation getFormationById(Long id){
        Optional<Formation> formation = formationRepository.findById(id);
        if (formation.isPresent()){
            return formation.get();
        }
        else {
            throw new RuntimeException("Formation not found with id"+id);
        }
    }

    @Override
    public Formation saveFormation(Formation formation) { return formationRepository.save(formation);}

    @Override
    public void deleteFormationById(Long id) { formationRepository.deleteById(id);}
}
