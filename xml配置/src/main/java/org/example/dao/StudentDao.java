package org.example.dao;

import org.example.model.Student;

import java.util.List;

//查询全部学生接口类
public interface StudentDao {
    List<Student> queryAll();
}
