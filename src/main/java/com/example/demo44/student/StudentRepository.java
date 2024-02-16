package com.example.demo44.student;

import com.example.demo44.student.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


// önce entity ismi sonra da id tipi (integer) belirtildi.
public interface StudentRepository extends JpaRepository<Student, Integer> {
    List<Student> findAllByFirstnameContaining(String firstname);

}
