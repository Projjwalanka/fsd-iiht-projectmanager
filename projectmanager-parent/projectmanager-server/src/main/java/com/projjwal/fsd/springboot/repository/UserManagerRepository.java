package com.projjwal.fsd.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projjwal.fsd.springboot.entity.User;

@Repository
public interface UserManagerRepository extends JpaRepository<User,Long>{

}

