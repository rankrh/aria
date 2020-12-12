package com.soli.Soli.models;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

public class Harvest {

    enum CropType {
        ROOT,
        LEAFY_GREEN,
        NUT,
        SEED,
        FRUIT,
        BERRY
    }

    @Id
    @Column(name="har_num")
    Long num;

    @ManyToMany
    Crop crop;

    @ManyToMany
    Planting planting;

    @ManyToMany
    Growth growth;

    @Column(name="gr_begin")
    Long begin;

    @Column(name="gr_end")
    Long end;

    @Column(name="har_type")
    CropType cropType;
}
