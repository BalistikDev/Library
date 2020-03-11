package com.springLibraryApplication.Library.repository;

import com.springLibraryApplication.Library.model.Administrateur;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface AdministrateurRepository extends CrudRepository<Administrateur, Long> {

    Optional<Administrateur> findById(Long id);
    Optional<Administrateur> findById(Administrateur auteur);

    Administrateur findByUsername (String username);

    void deleteById(Long id);

    Boolean existsByUsername(String username);

    Boolean existsByEmail(String email);
}
