package com.example.case_module4.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class Subject {
    @Id
    @GeneratedValue
    private Long id;
    private String name;

}
