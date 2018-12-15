package model;

import java.util.ArrayList;

public class Student {

	private String studentID;
	private String name;
	private ArrayList<Result> results = new ArrayList<Result>();
	private ArrayList<WrittenExam> exams = new ArrayList<WrittenExam>();
	
	//Constructors
	public Student(String studentID, String name){
		this.studentID = studentID;
		this.name = name;
	}
	public Student() {
		
	}
	
	//Getters and setters
	public String getStudentID() {
		return studentID;
	}
	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList<Result> getResults() {
		return results;
	}
	public void setResults(ArrayList<Result> results) {
		this.results = results;
	}
	public ArrayList<WrittenExam> getExams() {
		return exams;
	}
	public void setExams(ArrayList<WrittenExam> exams) {
		this.exams = exams;
	}
	
	//Methods
	public void addWrittenExam(WrittenExam exam) {
		exams.add(exam);
	}
	public WrittenExam removeWrittenExam(WrittenExam exam) {
		exams.remove(exam);
		return exam;
	}
	public void addResult(Result result) {
		results.add(result);
	}
	public Result removeResult(Result result) {
		results.remove(result);
		return result;
	}
	
}
