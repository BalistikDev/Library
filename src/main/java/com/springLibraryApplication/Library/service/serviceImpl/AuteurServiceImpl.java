package com.springLibraryApplication.Library.service.serviceImpl;

import com.springLibraryApplication.Library.model.Auteur;
import com.springLibraryApplication.Library.service.AuteurService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class AuteurServiceImpl implements AuteurService {

    @Override
    public Auteur findByName(String name) {
        return null;
    }

    @Override
    public Auteur findByHistoireId(Long Id) {
        return null;
    }

    @Override
    public Set<Auteur> findAll() {
        return null;
    }

    @Override
    public void save(Auteur auteur) {

    }

    @Override
    public void deleteById(Long Id) {

    }
}
