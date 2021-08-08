package com.SL.LNAcad;

public class Classes {
	private int classId;
	private String className;
	private int standard;
	
	public Classes(int classId, int standard, String className) {
		this.classId = classId;
		this.standard = standard;
		this.className = className;				
	}

	public String getClassName() {
		return className;
	}

	public int getStandard() {
		return standard;
	}		
}
