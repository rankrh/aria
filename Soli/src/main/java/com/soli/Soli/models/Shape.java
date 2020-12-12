package com.soli.Soli.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Shape {

	@Id
	@NotNull
	@Column(name="sh_num")
	private Long num;

	public Long getNum() {
		return num;
	}

	public Shape setNum(Long num) {
		this.num = num;
		return this;
	}
}
