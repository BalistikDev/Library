package com.springLibraryApplication.Library.service.serviceImpl;

import com.springLibraryApplication.Library.model.Histoire;
import com.springLibraryApplication.Library.service.HistoireService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class HistoireServiceImpl implements HistoireService {

    @Override
    public Histoire findById(Long Id) {
        return null;
    }

    @Override
    public Set<Histoire> findAll() {
        return null;
    }

    @Override
    public Set<Histoire> findByAuteurId(Long Id) {
        return null;
    }

    @Override
    public Set<Histoire> findByCategorieId(Long Id) {
        return null;
    }

    @Override
    public void save(Histoire histoire) {

    }

    @Override
    public void deleteById(Long Id) {

    }
}
