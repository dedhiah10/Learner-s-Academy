package com.SL.LNAcad;

public class Subject {
	//data members
	private int subjId;
	private final String name;
	
	//Constructors
	public Subject(int subjId, String name) {
		this.subjId = subjId;
		this.name = name;
	}

	//getters and setters

	public int getSubjId() {
		return subjId;
	}

	public String getName() {
		return name;
	}	
}
