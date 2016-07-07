package com.ananta.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="mobile_table")

public class MobileDTO {
	
	@Id
	@Column(name="m_id")
	private int m_id;
	
	@Column(name="model_name")
	private String model_name;
	
	@Column(name="ram")
	private int ram;
	
	@Column(name="price")
	private int price;
	
	@Column(name="camera")
	private int camera;

	public int getM_id() {
		return m_id;
	}

	public void setM_id(int m_id) {
		this.m_id = m_id;
	}

	public String getModel_name() {
		return model_name;
	}

	public void setModel_name(String model_name) {
		this.model_name = model_name;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getCamera() {
		return camera;
	}

	public void setCamera(int camera) {
		this.camera = camera;
	}
	
	

}
