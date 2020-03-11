package com.springLibraryApplication.Library.service;

import com.springLibraryApplication.Library.model.Categorie;

import java.util.Set;

public interface CategorieService {

    Categorie findById(Long Id);

    Categorie findByLabel(String label);

    Set<Categorie> findAll();

    void save(Categorie categorie);

    void deleteById(Long Id);
}
