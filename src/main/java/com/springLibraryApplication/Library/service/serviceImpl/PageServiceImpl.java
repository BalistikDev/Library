package com.springLibraryApplication.Library.service.serviceImpl;

import com.springLibraryApplication.Library.model.Page;
import com.springLibraryApplication.Library.service.PageService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class PageServiceImpl implements PageService {

    @Override
    public Page findById(Long Id) {
        return null;
    }

    @Override
    public Set<Page> findAll() {
        return null;
    }

    @Override
    public Set<Page> findByHistoireId(Long Id) {
        return null;
    }

    @Override
    public void save(Page page) {

    }

    @Override
    public void deleteById(Long Id) {

    }
}
