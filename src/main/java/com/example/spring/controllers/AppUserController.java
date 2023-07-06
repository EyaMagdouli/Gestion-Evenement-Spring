package com.example.spring.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.spring.web.dto.DatabaseDto;
import com.example.spring.web.dto.UserDto;
import com.example.spring.persistance.entities.*;
import com.example.spring.persistance.repositories.*;

@CrossOrigin
@RestController
@RequestMapping("/app-user")
public class AppUserController {
	
	@Autowired
	private AppUserRepository appUserRepository;
	
//	public AppUserController(AppUserRepository appUserRepository) {
//		this.appUserRepository = appUserRepository;
//	}
	
	@PostMapping
	public ResponseEntity<Void> createUser(@RequestBody AppUser appUser) {
		
		System.out.println("saving user :" + appUser);
		
		appUserRepository.save(appUser);
		
		return ResponseEntity.ok().build();
	}
	
	@GetMapping
	public ResponseEntity<Iterable<AppUser>> getAllAppUsers() {
		
		System.out.println("getting all users ");
		
		return ResponseEntity.ok(
				appUserRepository.findAll()
				);
	}
	

	@GetMapping("/{id}")
	public ResponseEntity<Optional<AppUser>> getUserById(@PathVariable long id) {
		
		return ResponseEntity.ok(
				appUserRepository.findById(id)
				);
	}
	
	}

