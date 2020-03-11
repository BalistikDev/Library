package com.springLibraryApplication.Library.service.serviceImpl;

import com.springLibraryApplication.Library.model.Categorie;
import com.springLibraryApplication.Library.service.CategorieService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class CategorieServiceImpl implements CategorieService {
    @Override
    public Categorie findById(Long Id) {
        return null;
    }

    @Override
    public Categorie findByLabel(String label) {
        return null;
    }

    @Override
    public Set<Categorie> findAll() {
        return null;
    }

    @Override
    public void save(Categorie categorie) {

    }

    @Override
    public void deleteById(Long Id) {

    }
}
