package com.vermeg.dbmanager.web;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vermeg.dbmanager.service.DatabaseService;
import com.vermeg.dbmanager.web.dto.DatabaseDto;

@CrossOrigin
@RestController
@RequestMapping("/databases")

public class DataBaseController {

	private final DatabaseService service;

	/**
	 * Constructeur
	 * 
	 * @return
	 */

	DataBaseController(DatabaseService service) {
		this.service = service;
	}

	/**
	 * méthode pour récupérer toute les bases
	 * 
	 * @return
	 */
	@GetMapping
	List<DatabaseDto> getAll() {
		return service.getAllDatabases();

	}


}
