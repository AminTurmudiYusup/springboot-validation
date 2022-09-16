package com.example.validation.repository;

import com.example.validation.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    boolean existsUserByEmail(String email);
    boolean existsUserByPhone(String phone);
}
