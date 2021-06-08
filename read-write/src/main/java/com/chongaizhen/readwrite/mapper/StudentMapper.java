package com.chongaizhen.readwrite.mapper;

import com.chongaizhen.readwrite.configuration.DS;
import com.chongaizhen.readwrite.model.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StudentMapper {

//    @DS("datasource1")
    List<Student> getdb1();

//    @DS("datasource2")
    List<Student> getdb2();
}
