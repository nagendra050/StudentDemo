package com.demo.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee{

	/**
	 * 
	 */

	@GeneratedValue(strategy=GenerationType.AUTO)
	@Id
	private long id;
	
	private String name;
	
	private String dept;

	public Employee(String name,String dept){
		
		
		this.name=name;
		
		this.dept=dept;
	}
	
	public Employee(){
		
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dept=" + dept + "]";
	}
	
	
	
	
}
