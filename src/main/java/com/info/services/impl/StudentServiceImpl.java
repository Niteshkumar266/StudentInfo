package com.info.services.impl;

import com.info.entities.IdProof;
import com.info.entities.Student;
import com.info.payload.IdProofDTO;
import com.info.payload.StudentDTO;
import com.info.repositories.IdProofRepository;
import com.info.repositories.StudentRepository;
import com.info.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private  StudentRepository studentRepository;

    @Autowired
    private IdProofRepository idProofRepository;

    @Override
    public StudentDTO saveStudent(StudentDTO studentDTO) {
            // Create the IdProof entity
            IdProof idProof = new IdProof();
            idProof.setPanCardNumber(studentDTO.getIdProof().getPancardnumber());
            idProof = idProofRepository.save(idProof);

            //create the Student entity
        Student student =new Student();
        student.setName(studentDTO.getName());
        student.setCourse(studentDTO.getCourse());
        student.setFee(studentDTO.getFee());
        student.setIdProof(idProof);
        student = studentRepository.save(student);

        //Map the entities to DTO's and return the result
            StudentDTO resultDto = new StudentDTO();
            resultDto.setId(student.getId());
            resultDto.setName(student.getName());
            resultDto.setCourse(student.getCourse());
            resultDto.setFee(student.getFee());

            IdProofDTO idProofDTO = new IdProofDTO();
            idProofDTO.setId(idProofDTO.getId());
            idProofDTO.setPanCardNumber(idProof.getPanCardNumber());

            resultDto.setIdProof(idProofDTO);

              return resultDto;
      }
      }
