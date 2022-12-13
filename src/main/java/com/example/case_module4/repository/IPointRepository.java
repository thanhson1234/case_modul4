package com.example.case_module4.repository;

import com.example.case_module4.model.Point;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPointRepository extends PagingAndSortingRepository<Point, Long> {
    Iterable<Point> findByStudent_Id(Long id);
}
