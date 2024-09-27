package com.crudoperation.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "student")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer rollNumber;
    @Column(name = "s_name")
    private String name;
    @Column(name = "s_Std")
    private String std;
    @Column(name = "s_course")
    private String course;


}
