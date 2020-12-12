package com.soli.Soli.models;

import javax.persistence.Column;
import javax.persistence.Id;

public class Genus {

    @Id
    @Column(name="ge_num")
    Long num;

    @Column(name="ge_name")
    String name;

    public Long getNum() {
        return num;
    }

    public Genus setNum(Long num) {
        this.num = num;
        return this;
    }

    public String getName() {
        return name;
    }

    public Genus setName(String name) {
        this.name = name;
        return this;
    }
}
