package com.ty.oneToMany.dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Mobile {
	
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Id
	private int id;
	private String name;
	private double cost;
	@OneToMany              //-> this will create a extraTable with primary key and foreign key id's
	List<Sim> sim;
	
	
	
	
	@Override
	public String toString() {
		return "Mobile [id=" + id + "\n name=" + name + "\n cost=" + cost + "\n sim=" + sim + "\n]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public List<Sim> getSim() {
		return sim;
	}
	public void setSim(List<Sim> sim) {
		this.sim = sim;
	}
	
	
	
	

}
