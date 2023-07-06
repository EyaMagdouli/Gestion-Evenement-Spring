package com.example.spring.service.classes;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.example.spring.web.dto.AdminDto;
import com.example.spring.persistance.entities.*;
import com.example.spring.persistance.repositories.*;


@Service
public class AdminService {

	private final AdminRepository repository;

	public AdminService(AdminRepository repository) {
		this.repository = repository;
	}

	public List<AdminDto> getAllAdmin() {
		
	
		List<Admin> allAdmin = (repository.findAll());
				List<AdminDto> results = allAdmin.stream()
						.map (admin -> {
					AdminDto adminDto = new AdminDto();
					adminDto.setUsername(admin.getUsername());
					adminDto.setAccountStatus(admin.getAccountStatus());
					adminDto.setLastLogin(admin.getLastLogin());
					adminDto.setExpiryDate(admin.getExpiryDate());
					adminDto.setTablespace(admin.getTablespace());
			return adminDto;

		}).collect(Collectors.toList());
		return results;
	}

	 

}
