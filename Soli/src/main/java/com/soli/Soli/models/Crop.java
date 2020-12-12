package com.soli.Soli.models;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.OneToOne;

public class Crop {

    @Id
    @Column(name="cr_num")
    Long num;

    @Column(name="cr_variety")
    String variety;

    @OneToOne
    Species species;

    @Column(name="cr_desc")
    String description;

    @OneToOne
    Company company;

    @Column(name="cr_organic")
    boolean organic = false;

    @Column(name="cr_treated")
    boolean treated = true;

    @Column(name="cr_hybrid")
    boolean hybrid = true;

    public Long getNum() {
        return num;
    }

    public Crop setNum(Long num) {
        this.num = num;
        return this;
    }

    public String getVariety() {
        return variety;
    }

    public Crop setVariety(String variety) {
        this.variety = variety;
        return this;
    }

    public Species getSpecies() {
        return species;
    }

    public Crop setSpecies(Species species) {
        this.species = species;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Crop setDescription(String description) {
        this.description = description;
        return this;
    }

    public Company getCompany() {
        return company;
    }

    public Crop setCompany(Company company) {
        this.company = company;
        return this;
    }

    public boolean isOrganic() {
        return organic;
    }

    public Crop setOrganic(boolean organic) {
        this.organic = organic;
        return this;
    }

    public boolean isTreated() {
        return treated;
    }

    public Crop setTreated(boolean treated) {
        this.treated = treated;
        return this;
    }

    public boolean isHybrid() {
        return hybrid;
    }

    public Crop setHybrid(boolean hybrid) {
        this.hybrid = hybrid;
        return this;
    }
}
