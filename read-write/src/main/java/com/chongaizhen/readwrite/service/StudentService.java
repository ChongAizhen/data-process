package com.chongaizhen.readwrite.service;

import com.chongaizhen.readwrite.configuration.DS;
import com.chongaizhen.readwrite.mapper.StudentMapper;
import com.chongaizhen.readwrite.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @DS("datasource1")
    public void getStudent1() {
        List<Student> students = studentMapper.getdb1();

        System.out.println("end");
    }

    @DS("datasource2")
    public void getStudent2() {
        List<Student> students = studentMapper.getdb2();

        System.out.println("end");
    }
}
