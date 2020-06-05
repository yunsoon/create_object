package org.zhangcaiyun.vo;

import java.io.Serializable;
import java.util.List;

public class School implements Serializable {

    private static final long serialVersionUID = 5020535838380492623L;
    private Long id;

    private String name;

    private List<Claass> claassList;

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

    public List<Claass> getClaassList() {
        return claassList;
    }

    public void setClaassList(List<Claass> claassList) {
        this.claassList = claassList;
    }
}
