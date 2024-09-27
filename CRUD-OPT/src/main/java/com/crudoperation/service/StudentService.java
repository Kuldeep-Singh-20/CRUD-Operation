package com.crudoperation.service;

import com.crudoperation.entity.Student;
import com.crudoperation.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    //Get AllStudent..
    public List<Student> getAllStudent(){
       List<Student> students = studentRepository.findAll();
       return students;
    }

    //Get Student By ID
    public Student getStudentById(int id) {
        Student GetStudent =studentRepository.findById(id).get();
        return GetStudent;
    }

    //Create Student
    public Student createStudent(Student student) {
        Student createStudent = studentRepository.save( student);
        return createStudent;
    }

    //Delete StudentById
     public void deleteStudentBtId(int id) {

      if(studentRepository.existsById(id)){
         studentRepository.deleteById(id);
      }else {
          throw new RuntimeException("Student id is not exist:"+id);
      }

    }

    //Update details
     public Student updateStudent(int id ,Student student) {
     Student UpdateStudent =  studentRepository.findById(id).get();
     // aman,mca,complete
     UpdateStudent.setName(student.getName());
     UpdateStudent.setCourse(student.getCourse());
     UpdateStudent.setStd(student.getStd());

     studentRepository.save(UpdateStudent);
     return UpdateStudent;
    }



}
