package com.formation.microservice.restfulwebservice.services;

import com.formation.microservice.restfulwebservice.dao.UserRepository;
import com.formation.microservice.restfulwebservice.entities.User;
import lombok.*;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public User createUser(User user) {
        User userSaved = this.userRepository.save(user);
        return userSaved;
    }

    @Override
    public Optional<User> findUserById(Long id) {
        return this.userRepository.findById(id);
    }

    @Override
    public List<User> getAllUsers() {
        return this.userRepository.findAll();
    }
}
