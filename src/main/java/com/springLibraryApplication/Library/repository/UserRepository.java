package com.springLibraryApplication.Library.repository;

import com.springLibraryApplication.Library.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    User findById(User user);
    Optional<User> findById(Long id);
    Optional <User> findByUsername(String username);
    Boolean existsByUsername(String username);
    Boolean existsByEmail(String email);
}
