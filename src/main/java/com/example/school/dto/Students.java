package com.example.school.dto;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Students {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    private String name;
    private String email;
    private String classId;
}
