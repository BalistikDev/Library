package com.springLibraryApplication.Library.service.serviceImpl;

import com.springLibraryApplication.Library.exception.ElementNotFound;
import com.springLibraryApplication.Library.model.Administrateur;
import com.springLibraryApplication.Library.repository.AdministrateurRepository;
import com.springLibraryApplication.Library.service.AdministrateurService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Set;

@Slf4j
@Service
public class AdministrateurServiceImpl implements AdministrateurService {

    private final AdministrateurRepository administrateurRepository;

    public AdministrateurServiceImpl(AdministrateurRepository administrateurRepository) {
        this.administrateurRepository = administrateurRepository;
    }

    @Override
    public Administrateur findById(Long Id) {
        Administrateur adminReturn = administrateurRepository.findById(Id).orElse(null);
        if (adminReturn == null){
            log.error("Admin not found for ID : "+Id);
            throw new ElementNotFound();
        }

        log.debug("Admin trouvé pour Id : "+Id);
        return adminReturn;
    }

    @Override
    public Administrateur findByUsername(String username) {
        return null;
    }

    @Override
    public Set<Administrateur> findAll() {
        return null;
    }

    @Override
    public void save(Administrateur administrateur) {

    }

    @Override
    public void deleteById(Long Id) {
    }
}
