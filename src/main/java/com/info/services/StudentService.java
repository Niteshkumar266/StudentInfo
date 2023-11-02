package com.info.services;
import com.info.payload.StudentDTO;

import javax.persistence.*;
public interface StudentService {
    public StudentDTO saveStudent(StudentDTO studentDTO);

}
