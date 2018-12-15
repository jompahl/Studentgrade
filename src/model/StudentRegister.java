package model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class StudentRegister {
	
	private static int studentNumber = 10000;

	private ArrayList<Student> studentRegister = new ArrayList<Student>();

	public ArrayList<Student> getStudentRegister() {
		return studentRegister;
	}

	public void setStudentRegister(ArrayList<Student> studentRegister) {
		this.studentRegister = studentRegister;
	}
	
	public void addStudent(Student student) {
		studentRegister.add(student);
	}
	
	public Student removeStudent(String studentNbr) {
		Student tmpStudent = findStudent(studentNbr);
		
		if(tmpStudent != null) {
		studentRegister.remove(tmpStudent);
		return tmpStudent;
		}
		return null;
	}
	
	public Student findStudent(String studentNbr) {
		for(Student tmp : studentRegister) {
			if(tmp.getStudentID().equals(studentNbr)) {
				return tmp;
			}
		}
		return null;
	}
	
	public static boolean correctStudentNbr(String string) {
		boolean numberCorrect = true;
		
		for(int i = 0; i < string.length(); i++) {
			if(!isInteger(String.valueOf(string.charAt(i)))) {
				numberCorrect = false;
				return numberCorrect;
			}
		}
		return numberCorrect;
	}
	public static boolean isInteger(String string) {
		boolean isValidInteger = false;
		try {
			Integer.parseInt(string);
			isValidInteger = true;
		}
		catch (NumberFormatException ex) {
			
		}
		return isValidInteger;
	}
	public static int getUniqueStudentNbr() {
		int random = 0;
		Random r = new Random();
		HashSet<Integer> set = new HashSet<Integer>();
		
		while(set.size()<1) {
			random = r.nextInt(9999)+10;
		}
		return random;
	}
	public static int setStudentNumber() {
		return studentNumber++;
	}
	
	
}
