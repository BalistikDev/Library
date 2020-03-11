package com.springLibraryApplication.Library.repository;

import com.springLibraryApplication.Library.model.Auteur;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface AuteurRepository extends CrudRepository<Auteur, Long> {

    Optional<Auteur> findById(Long id);
    Optional<Auteur> findById(Auteur auteur);

    Auteur findByUsername (String username);

    void deleteById(Long id);

    Boolean existsByUsername(String username);

    Boolean existsByEmail(String email);

}
