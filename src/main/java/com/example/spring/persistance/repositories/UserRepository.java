package com.example.spring.persistance.repositories;

import com.example.spring.persistance.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
