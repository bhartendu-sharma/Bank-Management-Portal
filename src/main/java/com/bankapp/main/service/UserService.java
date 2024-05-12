package com.bankapp.main.service;

import com.bankapp.main.enums.Role;
import com.bankapp.main.entity.User;

public interface UserService {
    User saveUser(User user);

    User findUserByUsernameAndRole(String username, Role role);

    User findUserByEmailAndRole(String email, Role role);

    boolean existsByUsername(String username);

    boolean existsByEmail(String email);
}
