package com.example.case_module4.service.impl;


import com.example.case_module4.model.Point;
import com.example.case_module4.repository.IPointRepository;
import com.example.case_module4.service.interfaceimpl.IPointService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PointService implements IPointService {
@Autowired
private IPointRepository repository;

    @Override
    public Iterable<Point> findAll() {
        return repository.findAll();
    }

    @Override
    public Point save(Point point) {
        return repository.save(point);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }

    @Override
    public Page<Point> findPage(Pageable pageable) {
        return repository.findAll(pageable);
    }

    @Override
    public Optional<Point> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public Iterable<Point> findByName(String name) {
        return null;
    }

    @Override
    public Iterable<Point> findPointByStudentID(Long id) {
        return repository.findByStudent_Id(id);
    }
}
