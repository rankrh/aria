package com.soli.Soli.models;

import javax.persistence.Column;
import javax.persistence.Id;

public class Company {

    @Id
    @Column(name="co_num")
    Long num;

    @Column(name="co_name")
    String name;
}
