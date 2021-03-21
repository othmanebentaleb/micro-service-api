package com.formation.microservice.restfulwebservice.services;

import com.formation.microservice.restfulwebservice.entities.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

   User createUser(User user);
   Optional<User> findUserById(Long id);
   List<User> getAllUsers();
}
