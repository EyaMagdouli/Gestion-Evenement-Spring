package com.vermeg.dbmanager.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.vermeg.dbmanager.model.entity.Admin;
import com.vermeg.dbmanager.repository.AdminRepository;

import com.vermeg.dbmanager.web.dto.AdminDto;


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
