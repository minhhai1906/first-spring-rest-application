package com.minhhai.springrest.rest;

import com.minhhai.springrest.entity.Student;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {
    private List<Student> studentList;

    @PostConstruct
    public void loadData(){
        studentList = new ArrayList<>();
        studentList.add(new Student("An", "Nguyen"));
        studentList.add(new Student("Bao", "Tran"));
        studentList.add(new Student("Chanh", "Le"));
        studentList.add(new Student("Danh", "Pham"));
    }

    @GetMapping("/students")
    public List<Student> getStudentList(){
        return studentList;
    }

    @GetMapping("/students/{id}")
    public Student singleStudent(@PathVariable int id){
        if(id >= studentList.size() || id < 0)
            throw new StudentNotFoundException("Student id not found - " + id);
        return studentList.get(id);
    }
}
