package com.SL.LNAcad;

public class Teacher {
	//data members
	private final String name;
	private float salary;
	private final java.util.Date dateOfBirth;
	private int empId;
	
	//Constructors
	public Teacher(int empId, String name, java.util.Date dateOfBirth, int salary) {
		this.empId = empId;
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.salary = salary;		
	}

	
	//Setters and Getters
	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public java.util.Date getDateOfBirth() {
		return dateOfBirth;
	}

	public int getEmpId() {
		return empId;
	}	
}
