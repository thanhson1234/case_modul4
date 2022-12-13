package com.example.case_module4.service.interfaceimpl;


import com.example.case_module4.model.Point;
import com.example.case_module4.service.InterfaceGeneral;

public interface IPointService extends InterfaceGeneral<Point> {
    Iterable<Point> findPointByStudentID(Long id);
}
