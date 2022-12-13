package com.example.case_module4.service.impl;


import com.example.case_module4.model.Classes;
import com.example.case_module4.repository.IClassesRepository;
import com.example.case_module4.service.interfaceimpl.IClassesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClassesServiceImp implements IClassesService
{
    @Autowired
    IClassesRepository repository;
    @Override
    public Iterable<Classes> findAll() {
        return repository.findAll();
    }

    @Override
    public Classes save(Classes classes) {
        return repository.save(classes);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }

    @Override
    public Page<Classes> findPage(Pageable pageable) {
        return repository.findAll(pageable);
    }

    @Override
    public Optional<Classes> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public Iterable<Classes> findByName(String name) {
        return repository.findAllByNameContaining(name);
    }
}