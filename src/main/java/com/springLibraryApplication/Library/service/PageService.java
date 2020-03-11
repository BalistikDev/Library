package com.springLibraryApplication.Library.service;

import com.springLibraryApplication.Library.model.Page;

import java.util.Set;

public interface PageService {

    Page findById(Long Id);

    Set<Page> findAll();

    Set<Page> findByHistoireId(Long Id);

    void save(Page page);

    void deleteById(Long Id);
}
