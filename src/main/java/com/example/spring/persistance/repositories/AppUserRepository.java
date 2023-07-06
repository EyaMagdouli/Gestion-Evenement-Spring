package com.example.spring.persistance.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.spring.persistance.entities.*;

@Repository
public interface AppUserRepository extends CrudRepository<AppUser, Long>{
	
}
