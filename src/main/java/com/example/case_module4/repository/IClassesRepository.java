package com.example.case_module4.repository;

import com.example.case_module4.model.Classes;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IClassesRepository extends PagingAndSortingRepository<Classes, Long> {
    Classes findByName(String name);
    Iterable<Classes> findAllByNameContaining(String name);
}
