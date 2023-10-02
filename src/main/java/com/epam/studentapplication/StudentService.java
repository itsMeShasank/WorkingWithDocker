package com.epam.studentapplication;

import java.util.List;
import java.util.Optional;

public interface StudentService {
    Student createStudent(Student student);
    List<Student> findAllStudents();
    Optional<Student> findStudentById(Long id);

}
