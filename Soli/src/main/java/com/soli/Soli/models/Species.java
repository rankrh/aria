package com.soli.Soli.models;

import com.google.common.base.Strings;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.OneToMany;

public class Species {

    @Id
    @Column(name="sp_num")
    Long num;

    @Column(name="sp_name")
    String name;

    @Column(name="sp_common_name")
    String commonName;

    @OneToMany
    Genus genus;

    public String getLatinName() {

        String latinName = "";
        if (!Strings.isNullOrEmpty(getName())) {
            latinName = getName() + (getGenus() == null ? "" : getGenus().getName());
        }

        return latinName;
    }

    public String getFullName() {

        return getCommonName() + " " + getLatinName();
    }

    public Long getNum() {
        return num;
    }

    public Species setNum(Long num) {
        this.num = num;
        return this;
    }

    public String getName() {
        return name;
    }

    public Species setName(String name) {
        this.name = name;
        return this;
    }

    public String getCommonName() {
        return commonName;
    }

    public Species setCommonName(String commonName) {
        this.commonName = commonName;
        return this;
    }

    public Genus getGenus() {
        return genus;
    }

    public Species setGenus(Genus genus) {
        this.genus = genus;
        return this;
    }
}
