package com.SL.LNAcad;

public class TimeTable implements Comparable<TimeTable>{
	private final int standard;
	private final String className;
	private final int timeSlot;
	private final String teacherAssigned;
	private final String dayOfTheWeek;
	private final String subjectName;
	
	public TimeTable(int standard, String className, int timeSlot, String teacherAssigned, String dayOfTheWeek, String subjectName) {
		this.standard = standard;
		this.className = className;
		this.timeSlot = timeSlot;
		this.teacherAssigned = teacherAssigned;
		this.dayOfTheWeek = dayOfTheWeek;
		this.subjectName = subjectName;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public int getStandard() {
		return standard;
	}

	public String getClassName() {
		return className;
	}
	
	public int getTimeSlot() {
		return timeSlot;
	}

	public Integer getTimeSlotInt() {
		Integer integ = timeSlot;
		return integ;
	}

	public String getTeacherAssigned() {
		return teacherAssigned;
	}

	public String getDayOfTheWeek() {
		return dayOfTheWeek;
	}	
	@Override
    public int compareTo(TimeTable timeTab) {
        return this.getTimeSlotInt().compareTo(timeTab.getTimeSlotInt());
    }

	@Override
	public String toString() {
		return "TimeTable [standard=" + standard + ", className=" + className + ", timeSlot=" + timeSlot
				+ ", teacherAssigned=" + teacherAssigned + ", dayOfTheWeek=" + dayOfTheWeek + ", subjectName="
				+ subjectName + "]";
	}
}
