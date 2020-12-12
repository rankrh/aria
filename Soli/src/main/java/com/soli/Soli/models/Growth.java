package com.soli.Soli.models;

import javax.persistence.*;

public class Growth {

    enum Sun {
        FULL_SUN,
        PARTIAL_SUN,
        PARTIAL_SHADE,
        FULL_SHADE
    }

    @Id
    @Column(name="gr_num")
    Long num;

    @ManyToOne
    Crop crop;

    @ManyToMany
    Planting planting;

    @Column(name="gr_sun")
    Sun sun;

    @Column(name="gr_soil")
    String soil;

    public Long getNum() {

        return num;
    }

    public Growth setNum(Long num) {

        this.num = num;
        return this;
    }

    public Crop getCrop() {

        return crop;
    }

    public Growth setCrop(Crop crop) {

        this.crop = crop;
        return this;
    }

    public Planting getPlanting() {

        return planting;
    }

    public Growth setPlanting(Planting planting) {

        this.planting = planting;
        return this;
    }

    public Sun getSun() {

        return sun;
    }

    public Growth setSun(Sun sun) {

        this.sun = sun;
        return this;
    }

    public String getSoil() {

        return soil;
    }

    public Growth setSoil(String soil) {

        this.soil = soil;
        return this;
    }
}
