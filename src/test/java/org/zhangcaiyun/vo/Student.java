package org.zhangcaiyun.vo;

import java.io.Serializable;

public class Student implements Serializable {

    private static final long serialVersionUID = 7695107369317814812L;
    /**
     * id
     **/
    private Long id;

    /**
     * 姓名
     **/
    private String name;

    /**
     * 性别
     **/
    private String sex;
    /**
     * 学号
     **/
    private String StdNo;
    /**
     * 年龄
     **/
    private int age;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getStdNo() {
        return StdNo;
    }

    public void setStdNo(String stdNo) {
        StdNo = stdNo;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
