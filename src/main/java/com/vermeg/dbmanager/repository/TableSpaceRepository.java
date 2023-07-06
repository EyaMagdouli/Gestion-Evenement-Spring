package com.vermeg.dbmanager.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vermeg.dbmanager.model.entity.Tablespace;


@Repository
public interface TableSpaceRepository extends JpaRepository<Tablespace, Long> {
	
//	@Query(value = "select * from dba_data_files", nativeQuery = true)
//	public List<TableSpace> getAllSpaces();

}
