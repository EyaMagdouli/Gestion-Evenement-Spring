package com.example.spring.service.interfaces;


import com.example.spring.persistance.entities.Evenement;
import com.example.spring.persistance.entities.Formation;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IFormationService {

    List<Formation> getAllFormations();

    Formation getFormationById(Long id);

    Formation saveFormation(Formation formation);

    void deleteFormationById(Long id);
}
