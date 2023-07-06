package com.vermeg.dbmanager.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.vermeg.dbmanager.model.entity.User;

@Repository

public interface UserRepository extends JpaRepository<User, Long> {
	public Optional<User> findByUsername(String username);
}





