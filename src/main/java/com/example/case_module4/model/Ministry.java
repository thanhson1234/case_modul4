package com.example.case_module4.model;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

import javax.persistence.*;

@Entity
@Data
public class Ministry {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String gender;
    @OneToOne
    private AppUser appUser;
    private String image;

    @Transient
    MultipartFile multipartFile;
}
