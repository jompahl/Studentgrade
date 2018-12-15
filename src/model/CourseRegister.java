package model;

import java.util.ArrayList;

public class CourseRegister {
	
	private int courseNumber = 10000;
	
	private ArrayList<Course> courseRegister = new ArrayList<Course>();

	public ArrayList<Course> getCourseRegister() {
		return courseRegister;
	}

	public void setCourseRegister(ArrayList<Course> courseRegister) {
		this.courseRegister = courseRegister;
	}
	
	public void addCourse(Course course) {
		courseRegister.add(course);
	}
	public Course findCourse(String courseCode) {
		for(Course tmp : courseRegister) {
			if(tmp.getCourseCode().equals(courseCode)) {
				return tmp;
			}
		}
		return null;
	}
	public Course removeCourse(String courseCode) {
		Course tmp = findCourse(courseCode);
		
		if(tmp != null) {
			courseRegister.remove(tmp);
			return tmp;
		}
		return null;
	}
	public int setCourseNumber() {
		return courseNumber++;
	}
	

}
