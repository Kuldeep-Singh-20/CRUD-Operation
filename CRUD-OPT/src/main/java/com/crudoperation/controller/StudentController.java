package com.crudoperation.controller;

import com.crudoperation.entity.Student;
import com.crudoperation.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/")
public class StudentController {

    @Autowired
    StudentService studentService;

    //Get All Student...
    @GetMapping(path = "getAll")
    public List<Student> getAllStudent() {

        List<Student> students = studentService.getAllStudent();
        return students;
    }

    //Get Student By ID
    @GetMapping(path = "getById/{id}")
    public Student getStudentById(@PathVariable("id") int id) {

        Student getStudent = studentService.getStudentById(id);
        return getStudent;
    }

    //Create Student
    @ResponseStatus(code = HttpStatus.CREATED)
    @PostMapping(path = "create")
    public Student createStudent(@RequestBody Student student) {

        Student createStudent = studentService.createStudent(student);
        return createStudent;

    }

    //Delete StudentById
    @DeleteMapping(path = "delete/{id}")
    public String deleteStudentBtId(@PathVariable("id") int id) {

        studentService.deleteStudentBtId(id);
        return "user delete successfully";
    }

    //UpDate the Student Details
    @PutMapping(path = "update/{id}")
    public Student updateStudent(@PathVariable("id") int id ,@RequestBody Student student){

        Student upadateStudent = studentService. updateStudent(id,student);
        return upadateStudent;
    }


}
