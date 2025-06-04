package com.dev.chat.service;

import java.util.Optional;
import java.util.UUID;

import com.dev.chat.model.User;

public interface UserService {
    Optional<User> getUserById(UUID id);
    Optional<User> getUserByEmail(UUID id);
    boolean userExistsByEmail(String email);
    User updateUserPassword(UUID id, String password);
    void deleteUser(UUID id);
}
