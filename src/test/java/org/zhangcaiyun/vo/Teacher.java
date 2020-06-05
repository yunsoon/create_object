package org.zhangcaiyun.vo;

import java.io.Serializable;
import java.util.List;

public class Teacher implements Serializable {

    private static final long serialVersionUID = -4986685726492180156L;

    /** id **/
    private Long id;

    /** 名称 **/
    private String name;

    /** 所教课程 **/
    private String course;

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

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}
