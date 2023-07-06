package com.example.spring.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.spring.persistance.entities.Feedback;
import com.example.spring.service.interfaces.IFeedbackService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/feedback")
public class FeedbackController {
	@Autowired
	private IFeedbackService feedbackService;

	@GetMapping("/getfeedbacks")
	public List<Feedback> getAll() {
		return feedbackService.getAll();
	}

	@GetMapping("/getfeedbacks/{id}")
	public Feedback getById(@PathVariable Long id) {
		return feedbackService.getById(id);
	}

	@PostMapping("/addfeedback")
	public Feedback create(@RequestBody Feedback feedback) {
		return feedbackService.save(feedback);
	}

	@PutMapping("/editfeedback")
	public Feedback update(@RequestBody Feedback feedback) {
		Feedback feedbackDB = getById(feedback.getIdFeed());
		feedbackDB.setDateFeed(feedback.getDateFeed());
		feedbackDB.setDescription(feedback.getDescription());
		feedbackDB.setUser(feedback.getUser());
		return feedbackService.save(feedbackDB);
	}

	@DeleteMapping("/delfeedback/{id}")
	public void deleteById(@PathVariable Long id) {
		feedbackService.deleteById(id);
	}
}
