package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.UserDetailsDAO;

@Repository
public interface UserDetailsRepository extends JpaRepository<UserDetailsDAO, Integer> {

}
