package com.springLibraryApplication.Library.repository;

import com.springLibraryApplication.Library.model.Histoire;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface HistoireRepository extends CrudRepository<Histoire, Long> {

    Optional<Histoire> findById(Long Id);

    void deleteById(Long Id);
}
