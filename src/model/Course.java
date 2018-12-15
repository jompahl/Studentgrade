package model;

import java.util.ArrayList;

public class Course {
	
	private String courseCode;
	private String name;
	private int credits;
	private ArrayList<WrittenExam> writtenExams = new ArrayList<WrittenExam>();
	
	//Constructor
	public Course (String courseCode, String name, int credits) {
		this.courseCode = courseCode;
		this.name = name;
		this.credits = credits;
	}
	public Course () {
		
	}
	
	//Getters and setters
	public String getCourseCode() {
		return courseCode;
	}
	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCredits() {
		return credits;
	}
	public void setCredits(int credits) {
		this.credits = credits;
	}
	public ArrayList<WrittenExam> getWrittenExams() {
		return writtenExams;
	}
	public void setWrittenExams(ArrayList<WrittenExam> writtenExams) {
		this.writtenExams = writtenExams;
	}

	//Methods
	public void addWrittenExam(WrittenExam exam) {
		writtenExams.add(exam);
	}
	public WrittenExam removeWrittenExam(WrittenExam exam) {
		writtenExams.remove(exam);
		return exam;
	}
}
