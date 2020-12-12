package com.soli.Soli.models;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Polygon extends Shape {

	@Column(name="sh_area")
	private Double area;

	public Double getArea() {
		return area;
	}

	public void setArea(Double area) {
		this.area = area;
	}
}
