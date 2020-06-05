package org.zhangcaiyun.vo;

import java.io.Serializable;
import java.util.List;

public class Claass implements Serializable {

    private static final long serialVersionUID = 7938110231273321411L;

    private Long id;

    /**
     * 班级编号
     */
    private String cno;

    private List<Student> studentList;

    private List<Teacher> teacherList;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCno() {
        return cno;
    }

    public void setCno(String cno) {
        this.cno = cno;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public List<Teacher> getTeacherList() {
        return teacherList;
    }

    public void setTeacherList(List<Teacher> teacherList) {
        this.teacherList = teacherList;
    }
}
