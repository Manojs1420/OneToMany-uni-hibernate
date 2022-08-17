package com.ty.oneToMany.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Sim {
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Id
	private int id;
	private String provider;
	private int imrc;
	
	
	@Override
	public String toString() {
		return "Sim [id=" + id + "\n provider=" + provider + "\n imrc=" + imrc + "\n]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProvider() {
		return provider;
	}
	public void setProvider(String provider) {
		this.provider = provider;
	}
	public int getImrc() {
		return imrc;
	}
	public void setImrc(int imrc) {
		this.imrc = imrc;
	}
	
	

}