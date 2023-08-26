package org.example.service;

import org.example.model.Student;

import java.util.List;

//查询全部学生的业务接口
public interface StudentService {
    List<Student> findAll();
}
