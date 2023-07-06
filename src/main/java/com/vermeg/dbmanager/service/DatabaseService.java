package com.vermeg.dbmanager.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.vermeg.dbmanager.model.entity.Tablespace;
import com.vermeg.dbmanager.repository.TableSpaceRepository;
import com.vermeg.dbmanager.web.dto.DatabaseDto;

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
