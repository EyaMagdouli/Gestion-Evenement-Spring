package com.vermeg.dbmanager.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.vermeg.dbmanager.model.entity.User;
import com.vermeg.dbmanager.repository.UserRepository;
import com.vermeg.dbmanager.web.dto.UserDto;

@Component
public class UserService {

	private final UserRepository repository;

	public UserService(UserRepository repository) {
		this.repository = repository;
	}

	public List<UserDto> getAllUser() {
		
	
		List<User> allUser = (repository.findAll());
				List<UserDto> results = allUser.stream()
				.map(user -> {
			UserDto userDto = new UserDto();
			userDto.setUsername(user.getUsername());
			userDto.setAccountStatus(user.getAccountStatus());
			userDto.setLastLogin(user.getLastLogin());
			userDto.setExpiryDate(user.getExpiryDate());
			userDto.setTablespace(user.getTablespace());
			return userDto;

		}).collect(Collectors.toList());
		return results;
	}
	
	public UserDto getUser(String username) {
		UserDto userDto = new UserDto();
		
		Optional<User> optionlUser = repository.findByUsername(username);
			
		if(optionlUser.isPresent()){
			User user = optionlUser.get();
			userDto.setUsername(user.getUsername());
			userDto.setAccountStatus(user.getAccountStatus());
			userDto.setLastLogin(user.getLastLogin());
			userDto.setExpiryDate(user.getExpiryDate());
			userDto.setTablespace(user.getTablespace());
	}
			return userDto;
	}

	 

}
