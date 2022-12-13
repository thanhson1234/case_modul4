package com.example.case_module4.controller.ministry;


import com.example.case_module4.model.Classes;
import com.example.case_module4.model.Point;
import com.example.case_module4.model.Student;
import com.example.case_module4.service.interfaceimpl.IAppUserService;
import com.example.case_module4.service.interfaceimpl.IClassesService;
import com.example.case_module4.service.interfaceimpl.IPointService;
import com.example.case_module4.service.interfaceimpl.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@CrossOrigin("*")
public class MinistryController {

    @Autowired
    IStudentService iStudentService;

    @Autowired
    IAppUserService iAppUserService;

    @Autowired
    IClassesService iClassesService;

    @Autowired
    IPointService iPointService;

    @GetMapping("/showClass")
    public ResponseEntity<Iterable<Classes>> showClasses(){
        Iterable<Classes> classes = iClassesService.findAll();
        if (!classes.iterator().hasNext()) {
            new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(classes, HttpStatus.OK);
    }

    @GetMapping("/showStudent/{idClass}")
    public ResponseEntity<Iterable<Student>> showStudentByClass(@PathVariable long idClass){
        Classes classes = iClassesService.findById(idClass).get();
        Iterable<Student> students = iStudentService.findStudentByClassName(classes.getName());
        return new ResponseEntity<>(students, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Point> addPoint(@RequestPart("json") Point point){
        Point pointCreate = iPointService.save(point);
        return new ResponseEntity<>(pointCreate, HttpStatus.CREATED);
    }

    @GetMapping("/getPoint/{id}")
    public ResponseEntity<Iterable<Point>> displayPoint(@PathVariable("id") Long id){
        Iterable<Point> points = iPointService.findPointByStudentID(id);
        return new ResponseEntity<>(points, HttpStatus.OK);
    }

    @PutMapping("editPoint/{id}")
    public ResponseEntity<Point> editPoint(@PathVariable("id") Long id, @RequestPart("json") Point point ){
        Optional<Point> pointEdit = iPointService.findById(id);
        if (!pointEdit.isPresent()) {
            new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        point.setId(pointEdit.get().getId());
        point = iPointService.save(point);
        return new ResponseEntity<>(point, HttpStatus.OK);

    }
}
