package com.service.impl;

import com.mapper.StudentMapper;
import com.pojo.Student;
import com.service.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2017/3/21.
 */
@Service
public class StudentServiceImpl implements StudentService {
    @Resource
    private StudentMapper studentMapper;

    @Override
    public boolean addStudent(Student student) {
        return studentMapper.insert(student) > 0 ? true : false;
    }

    @Override
    public boolean delStudentById(Integer StudentId) {
        return studentMapper.deleteByPrimaryKey(StudentId) > 0 ? true : false;
    }

    @Override
    public boolean updateStudent(Student student) {
        return studentMapper.updateByPrimaryKeySelective(student) > 0 ? true : false;
    }

    @Override
    public List<Student> findAllStudent() {
        return studentMapper.selectAll();
    }

    @Override
    public Student findStudentById(Integer StudentId) {
            return studentMapper.selectByPrimaryKey(StudentId);
    }
}