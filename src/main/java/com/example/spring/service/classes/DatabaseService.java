package com.example.spring.service.classes;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.example.spring.web.dto.DatabaseDto;
import com.example.spring.persistance.entities.*;
import com.example.spring.persistance.repositories.*;

@Service
public class DatabaseService {
	
	private final TableSpaceRepository repository;
	
	public DatabaseService(TableSpaceRepository repository) {
		this.repository = repository;
	}

	public List<DatabaseDto> getAllDatabases() {
		List<Tablespace> allTableSpaces = repository.findAll();
		
		List<DatabaseDto> results = allTableSpaces.stream()
				.map(tablespace -> {
					DatabaseDto db = new DatabaseDto();
					db.setFileName(tablespace.getFileName());
					db.setName(tablespace.getTablespaceName());
					db.setSize(tablespace.getBytes()/1024/1024);
					return db;
				})
				.collect(Collectors.toList());
		
		return results;
	}

}
