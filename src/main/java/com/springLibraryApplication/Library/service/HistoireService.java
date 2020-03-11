package com.springLibraryApplication.Library.service;

import com.springLibraryApplication.Library.model.Histoire;

import java.util.Set;

public interface HistoireService {

    Histoire findById(Long Id);

    Set<Histoire> findAll();

    Set<Histoire> findByAuteurId(Long Id);

    Set<Histoire> findByCategorieId(Long Id);

    void save(Histoire histoire);

    void deleteById(Long Id);
}
