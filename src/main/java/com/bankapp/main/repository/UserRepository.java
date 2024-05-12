package com.bankapp.main.repository;

import com.bankapp.main.enums.Role;
import com.bankapp.main.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    // Method to find a user by username and role
    User findByUsernameAndRole(String username, Role role);

    // Method to find a user by email and role
    User findByEmailAndRole(String email, Role role);

    // Method to check if a user exists by username
    boolean existsByUsername(String username);

    // Method to check if a user exists by email
    boolean existsByEmail(String email);

    // You can add more methods here as per your requirements
}
