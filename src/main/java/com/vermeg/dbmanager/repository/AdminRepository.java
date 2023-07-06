package com.vermeg.dbmanager.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vermeg.dbmanager.model.entity.Admin;

@Repository

public interface AdminRepository extends JpaRepository<Admin, Long> {

}





