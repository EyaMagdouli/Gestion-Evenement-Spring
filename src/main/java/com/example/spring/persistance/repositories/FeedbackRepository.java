package com.example.spring.persistance.repositories;

import com.example.spring.persistance.entities.Feedback;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FeedbackRepository extends JpaRepository<Feedback,Long> {
}
