package com.formation.microservice.restfulwebservice.dao;

import com.formation.microservice.restfulwebservice.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
