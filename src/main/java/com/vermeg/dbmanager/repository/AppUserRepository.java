package com.vermeg.dbmanager.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.vermeg.dbmanager.model.entity.AppUser;

@Repository
public interface AppUserRepository extends CrudRepository<AppUser, Long>{
	
}
