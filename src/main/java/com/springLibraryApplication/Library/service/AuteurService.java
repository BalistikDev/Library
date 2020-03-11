package com.springLibraryApplication.Library.service;

import com.springLibraryApplication.Library.model.Auteur;

import java.util.Set;

public interface AuteurService {

    Auteur findByName(String name);

    Auteur findByHistoireId(Long Id);

    Set<Auteur> findAll();

    void save(Auteur auteur);

    void deleteById(Long Id);
}
