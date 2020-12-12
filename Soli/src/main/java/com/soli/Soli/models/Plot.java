package com.soli.Soli.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

@Entity
public class Plot {

	@Id
	@NotNull
	@Column(name="pl_num")
	private Long num;

	@Column(name="pl_name")
	private String name;

	@OneToOne
	private Polygon polygon;

	@Column(name="pl_desc")
	private String description;

	@Column(name="pl_parent_num")
	private Long parent;

	public Long getNum() {
		
		return this.num;
	}

	public Plot setNum(Long num) {
		
		this.num = num;
		return this;
	}
	
	public String getName() {
		
		return this.name;
	}
	
	public Plot setName(String name) {
		
		this.name = name;
		return this;
	}

	public Polygon getPolygon() {

		return this.polygon;
	}

	public Plot setPolygon(Polygon polygon) {

		this.polygon = polygon;
		return this;
	}
	
	public String getDescription() {
	
		return description;
	}
	
	public Plot setDescription(String description) {
	
		this.description = description;
		return this;
	}
	
	public Long getParent() {
	
		return parent;
	}
	
	public Plot setParent(Long parent) {
	
		this.parent = parent;
		return this;
	}	
}
