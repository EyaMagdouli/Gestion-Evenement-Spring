package com.example.spring.service.interfaces;

import com.example.spring.persistance.entities.Logistique;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ILogistiqueService {
    List<Logistique> getAllLogistiques();

    Logistique getLogistiqueById(Long id);

    Logistique saveLogistique(Logistique logistique);

    void deleteLogistiqueById(Long id);
}
