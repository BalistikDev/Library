package com.springLibraryApplication.Library.service;

import com.springLibraryApplication.Library.model.Administrateur;

import java.util.Set;

public interface AdministrateurService {

    Administrateur findById(Long Id);

    Administrateur findByUsername(String username);

    Set<Administrateur> findAll();

    void save(Administrateur administrateur);

    void deleteById(Long Id);
}
