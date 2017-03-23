package com.controller;

import com.pojo.Student;
import com.service.StudentService;
import com.utils.JSONResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by Administrator on 2017/3/21.
 */
@Controller
@RequestMapping("/student")
public class StudentController {
    @Resource
    private StudentService studentService;
    @RequestMapping(value = "/studentAdd")
    public ModelAndView toAddStudent() {
        ModelAndView modelAndView = new ModelAndView("studentAdd");
        return modelAndView;
    }
    @RequestMapping(value = "/studentEditor")
    public ModelAndView toEditorStudent(String id){
        ModelAndView modelAndView = new ModelAndView("studentEditor");
        return modelAndView;
    }
    @RequestMapping(value="/student")
    public ModelAndView toStudent(){
        ModelAndView modelAndView = new ModelAndView("student");
        return modelAndView;
    }


    /**
     * ���ѧ��
     *
     * @param request ������ӵ�������Ϣ
     * @return ��ӳɹ������Ϣ
     */
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public JSONResult addStudent(HttpServletRequest request) {
        JSONResult result;
//        Integer StudentId = Integer.parseInt(request.getParameter("StudentId"));����ɾ������Ϊǰ��û�����id������
        String StudentName = request.getParameter("StudentName");
        String StudentAddress = request.getParameter("StudentAddress");
        String StudentSex = request.getParameter("StudentSex");
        Student student = new Student();
//        student.setId(StudentId);����ɾ������Ϊǰ��û�����id������
        student.setName(StudentName);
        student.setAddress(StudentAddress);
        student.setSex(StudentSex);
        if (studentService.addStudent(student)) {
            result = new JSONResult(student);
            result.setMessage("success");
        } else {
            result = new JSONResult();
        }
        return result;
    }


    /**
     * ����ѧ��IDɾ��ѧ��
     *
     * @param request Ŀ��ѧ��ID
     * @return �ɹ������Ϣ
     */
    @RequestMapping(value = "/del", method = RequestMethod.POST)
    @ResponseBody
    public JSONResult delStudentById(HttpServletRequest request) {
        JSONResult result = new JSONResult();
        Integer StudentId = Integer.parseInt(request.getParameter("StudentId"));
        if (!studentService.delStudentById(StudentId))
            result.setMessage("error");
        return result;
    }


    /**
     * ����ѧ��ID����ѧ��
     *
     * @param request Ŀ��ѧ��ID
     * @return �ɹ������Ϣ
     */
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public JSONResult updateStudent(HttpServletRequest request) {
        JSONResult result;
//        Integer StudentId = Integer.parseInt(request.getParameter("StudentId"));
        String StudentName = request.getParameter("StudentName");
        String StudentAddress = request.getParameter("StudentAddress");
        String StudentSex = request.getParameter("StudentSex");
        Student student = new Student();
//        student.setId(StudentId);��Ϊû�����id�������ķ���ҳɾ��
        student.setName(StudentName);
        student.setAddress(StudentAddress);
        student.setSex(StudentSex);
        if (studentService.addStudent(student)) {
            result = new JSONResult(student);
            result.setMessage("success");
        } else {
            result = new JSONResult();
            result.setMessage("error");
        }
        return result;
    }


    /**
     * ����ѧ��ID��ѯѧ��
     *
     * @param request Ŀ��ѧ��ID
     * @return Ŀ��ѧ����Ϣ
     */
    @RequestMapping(value = "/find", method = RequestMethod.GET)
    @ResponseBody
    public JSONResult findStudentById(HttpServletRequest request) {
        JSONResult result;
        Integer StudentId = Integer.parseInt(request.getParameter("StudentId"));
        Student student = studentService.findStudentById(StudentId);
        result = new JSONResult(student);
        return result;
    }
    @RequestMapping(value = "/list",method = RequestMethod.GET)
    @ResponseBody
    public JSONResult findAllStudent(){
        List<Student> list = studentService.findAllStudent();
        return new JSONResult(list);
    }
}