package com.example.spring.persistance.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.spring.persistance.entities.Admin;

@Repository

public interface AdminRepository extends JpaRepository<Admin, Long> {

}





