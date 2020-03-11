package com.springLibraryApplication.Library.repository;

import com.springLibraryApplication.Library.model.Page;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface PageRepository extends CrudRepository<Page, Long> {

    Optional<Page> findById(Long Id);

    void deleteById(Long id);
}
