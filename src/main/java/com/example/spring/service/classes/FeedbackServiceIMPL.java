package com.example.spring.service.classes;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.spring.persistance.entities.Feedback;
import com.example.spring.persistance.repositories.FeedbackRepository;
import com.example.spring.service.interfaces.IFeedbackService;

@Service
public class FeedbackServiceIMPL implements IFeedbackService{
	
	@Autowired
	private FeedbackRepository feedbackRepository;

	@Override
	public List<Feedback> getAll() {
		return feedbackRepository.findAll();
	}

	@Override
	public Feedback getById(Long id) {
        Optional<Feedback> feedback = feedbackRepository.findById(id);
        if (feedback.isPresent()) {
            return feedback.get();
        } else {
            throw new RuntimeException("Feedback not found with ID: " + id);
        }
	}

	@Override
	public Feedback save(Feedback feedback) {
		feedback.setDateFeed(new Date());
		return feedbackRepository.save(feedback);
	}

	@Override
	public void deleteById(Long id) {
		feedbackRepository.deleteById(id);
	}

    
}
