package org.example.dao;

import org.example.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

//查询全部学生实现类
@Repository
public class StudentDaoImpl implements StudentDao{

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<Student> queryAll() {
        String sql = "select id,name,age,gender,class as classes from students;";
        //query可以返回集合
        List<Student> studentList = jdbcTemplate.query(sql,new BeanPropertyRowMapper<>(Student.class));
        return studentList;
    }
}
