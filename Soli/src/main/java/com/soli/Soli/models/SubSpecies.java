package com.soli.Soli.models;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

public class SubSpecies {

    @Id
    @Column(name="sub_num")
    Long num;

    @Column(name="sub_name")
    String name;

    @ManyToOne
    Species species;
}
