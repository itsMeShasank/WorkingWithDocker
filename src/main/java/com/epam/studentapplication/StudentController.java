package com.epam.studentapplication;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/studentApi")
public class StudentController {

    private final StudentService studentServiceImpl;

    @PostMapping("/add")
    public ResponseEntity<Student> createStudent(@RequestBody Student student) {
        return new ResponseEntity<>(studentServiceImpl.createStudent(student), HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Student> findStudentById(@PathVariable Long id) {
        return new ResponseEntity<>(studentServiceImpl.findStudentById(id).get(),HttpStatus.OK);
    }

    @GetMapping
    public  ResponseEntity<List<Student>> findAllStudents() {
        return new ResponseEntity<>(studentServiceImpl.findAllStudents(),HttpStatus.OK);
    }
}
