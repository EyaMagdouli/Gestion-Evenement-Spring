package com.example.spring.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.spring.web.dto.AdminDto;
import com.example.spring.service.classes.*;

@CrossOrigin
@RestController
@RequestMapping("/Admin")

public class AdminController {

	private final AdminService service;

	/**
	 * Constructeur
	 * 
	 * @return
	 */

	AdminController(AdminService service) {
		this.service = service;
	}

	/**
	 * méthode pour récupérer toute les bases
	 * 
	 * @return
	 */
	@GetMapping
	List<AdminDto> getAll() {
		return service.getAllAdmin();

	}

}

