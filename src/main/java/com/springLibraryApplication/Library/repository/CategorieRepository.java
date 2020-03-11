package com.springLibraryApplication.Library.repository;

import com.springLibraryApplication.Library.model.Categorie;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface CategorieRepository extends CrudRepository<Categorie, Long> {

    Optional<Categorie> findById(Long Id);

    Categorie findByLabel(String label);

    void deleteById(Long id);
}
