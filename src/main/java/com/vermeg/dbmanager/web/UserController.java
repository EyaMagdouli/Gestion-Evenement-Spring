package com.vermeg.dbmanager.web;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vermeg.dbmanager.service.UserService;
import com.vermeg.dbmanager.web.dto.UserDto;

@CrossOrigin
@RestController
@RequestMapping("/users")

public class UserController {

	private final UserService service;

	/**
	 * Constructeur
	 * 
	 * @return
	 */

	UserController(UserService service) {
		this.service = service;
	}

	/**
	 * méthode pour récupérer toute les bases
	 * 
	 * @return
	 */
	@GetMapping
	List<UserDto> getAll() {
		return service.getAllUser();
	}
	
	/**
	 * méthode pour récupérer toute les bases
	 * 
	 * @return
	 */
	@GetMapping("/{username}")
	UserDto getUser(@PathVariable String username) {
		return service.getUser(username);
	}

}

