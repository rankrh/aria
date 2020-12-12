package com.soli.Soli.models;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

public class Point {

    @Id
    @Column(name = "pt_num")
    Long num;

    @ManyToOne
    Shape shape;

    @Column(name = "pt_order")
    Long order;

    @Column(name = "pt_set")
    Long set;

    @Column(name = "pt_lat")
    Long latitude;

    @Column(name = "pt_long")
    Long longitude;


    public Long getNum() {

        return num;
    }

    public Point setNum(Long num) {

        this.num = num;
        return this;
    }

    public Shape getShape() {

        return shape;
    }

    public Point setShape(Shape shape) {

        this.shape = shape;
        return this;
    }

    public Long getOrder() {

        return order;
    }

    public Point setOrder(Long order) {

        this.order = order;
        return this;
    }

    public Long getSet() {

        return set;
    }

    public Point setSet(Long set) {

        this.set = set;
        return this;
    }

    public Long getLatitude() {

        return latitude;
    }

    public Point setLatitude(Long latitude) {

        this.latitude = latitude;
        return this;
    }

    public Long getLongitude() {

        return longitude;
    }

    public Point setLongitude(Long longitude) {

        this.longitude = longitude;
        return this;
    }
}
