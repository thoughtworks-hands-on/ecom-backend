package com.thoughtworks.ecombackend.repositories;

import com.thoughtworks.ecombackend.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
    User findByEmail(String email);
    Boolean existsByEmail(String email);
}