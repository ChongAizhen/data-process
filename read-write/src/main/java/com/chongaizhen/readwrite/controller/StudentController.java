package com.chongaizhen.readwrite.controller;

import com.chongaizhen.readwrite.mapper.StudentMapper;
import com.chongaizhen.readwrite.model.Student;
import com.chongaizhen.readwrite.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @Autowired
    private StudentMapper studentMapper;

    @GetMapping("get")
    public void getStudent() {
        studentService.getStudent1();

        studentService.getStudent2();

        System.out.println("end");
    }

    @GetMapping("getmapper")
    public void getStudentMapper() {
        studentMapper.getdb1();

        studentMapper.getdb2();

        System.out.println("end");
    }

}
