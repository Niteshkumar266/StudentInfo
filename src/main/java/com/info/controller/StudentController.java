package com.info.controller;
import javax.persistence.*;

import com.info.payload.StudentDTO;
import com.info.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
//http://localhost:8080/api/students
@RequestMapping("/api/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

   @PostMapping
    public ResponseEntity<StudentDTO> createStudent(@RequestBody StudentDTO studentDTO) {
        StudentDTO resultDto = studentService.saveStudent(studentDTO);
        return new ResponseEntity<>(resultDto, HttpStatus.CREATED);

    }
    }

