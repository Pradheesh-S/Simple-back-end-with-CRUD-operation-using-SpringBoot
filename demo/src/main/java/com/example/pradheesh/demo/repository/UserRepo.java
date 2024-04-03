package com.example.pradheesh.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.pradheesh.demo.model.User;

public interface UserRepo extends JpaRepository<User,Integer>{
    
}

