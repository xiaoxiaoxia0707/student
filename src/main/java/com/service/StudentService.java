package com.service;

import com.pojo.Student;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * Created by Administrator on 2017/3/21.
 */

@Service
public interface StudentService {
    boolean addStudent(Student student);

    boolean delStudentById(Integer studentId);

    boolean updateStudent(Student student);

    Student findStudentById(Integer studentId);

    List<Student> findAllStudent();
}