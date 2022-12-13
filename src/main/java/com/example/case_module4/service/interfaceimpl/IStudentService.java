package com.example.case_module4.service.interfaceimpl;

import com.example.case_module4.model.Student;
import com.example.case_module4.service.InterfaceGeneral;



import java.util.Optional;
public interface IStudentService extends InterfaceGeneral<Student> {
    Optional<Student> findStudentByAppUserId(Long id);
    Iterable<Student> findStudentByClassName(String className);
}
