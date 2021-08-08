package com.SL.LNAcad;

public class Student {
	private int stuId;
	private String name;
	private int standard;
	private String className;
	
	public Student(int stuId, String name, int standard, String className) {
		this.stuId= stuId;
		this.name = name;
		this.standard = standard;
		this.className = className;		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStuId() {
		return stuId;
	}

	public int getStandard() {
		return standard;
	}

	public String getClassName() {
		return className;
	}
}
