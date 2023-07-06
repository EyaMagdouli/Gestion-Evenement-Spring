package com.example.spring.service.interfaces;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.spring.persistance.entities.Feedback;

@Repository
public interface IFeedbackService {
    List<Feedback> getAll();

    Feedback getById(Long id);

    Feedback save(Feedback feedback);

    void deleteById(Long id);
}
