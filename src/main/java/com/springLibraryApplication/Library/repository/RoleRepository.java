package com.springLibraryApplication.Library.repository;

import com.springLibraryApplication.Library.model.Role;
import com.springLibraryApplication.Library.model.RoleName;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {

    Optional <Role> findByName (RoleName roleName);
}
