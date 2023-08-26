package org.example.dao;

import org.example.model.Student;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

//查询全部学生实现类
public class StudentDaoImpl implements StudentDao{
    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Student> queryAll() {
        String sql = "select id,name,age,gender,class as classes from students;";
        //query可以返回集合
        List<Student> studentList = jdbcTemplate.query(sql,new BeanPropertyRowMapper<>(Student.class));
        return studentList;
    }
}
