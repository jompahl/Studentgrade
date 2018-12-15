package model;

import java.util.ArrayList;

public class WrittenExam {
	
	private String examID;
	private int date;
	private String location;
	private int time;
	final private int MAXPOINTS = 100;
	private Course course;
	private ArrayList<Student> students = new ArrayList<Student>();
	private ArrayList<Result> results = new ArrayList<Result>();
	
	//Constructors
	public WrittenExam(String examID, int date, String location, int time) {
		this.examID = examID;
		this.date = date;
		this.location = location; 
		this.time = time;
	}
	public WrittenExam() {
		
	}
	
	//Getters and Setters
	public String getExamID() {
		return examID;
	}
	public void setExamID(String examID) {
		this.examID = examID;
	}
	public int getDate() {
		return date;
	}
	public void setDate(int date) {
		this.date = date;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	public int getMAXPOINTS() {
		return MAXPOINTS;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	public ArrayList<Student> getStudents() {
		return students;
	}
	public void setStudents(ArrayList<Student> students) {
		this.students = students;
	}
	public ArrayList<Result> getResults() {
		return results;
	}
	public void setResults(ArrayList<Result> results) {
		this.results = results;
	}
	
	//Methods
	public void addStudent(Student student) {
		students.add(student);
	}
	public Student removeStudent(Student student) {
		students.remove(student);
		return student;
	}

}
