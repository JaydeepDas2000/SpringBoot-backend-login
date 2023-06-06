package com.springrest.springrest.service;

import com.springrest.springrest.entity.User;
import com.springrest.springrest.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class CreateUserService {
    private final UserRepository userRepository;

    public CreateUserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User createUser(String username, String password) {
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);

        // Additional logic, validations, or modifications if needed

        return userRepository.save(user);
    }
}
