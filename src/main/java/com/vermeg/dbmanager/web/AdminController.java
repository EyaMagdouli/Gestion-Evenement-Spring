package com.vermeg.dbmanager.web;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vermeg.dbmanager.service.AdminService;

import com.vermeg.dbmanager.web.dto.AdminDto;

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

