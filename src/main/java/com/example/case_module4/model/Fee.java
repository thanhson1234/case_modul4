package com.example.case_module4.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Fee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private double feeStudent;
    @OneToOne
    private Student student;

}
