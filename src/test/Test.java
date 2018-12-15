package test;

import model.Course;
import model.Result;
import model.Student;
import model.StudentRegister;
import model.WrittenExam;

public class Test {

	public static void main(String[] args) {
		
		Student student1 = new Student("S12345", "John");
		Student student2 = new Student("S54321", "Alva");
		
		WrittenExam writtenExam1 = new WrittenExam("E12345", 20181212, "Lund", 1843);
		WrittenExam writtenExam2 = new WrittenExam("E56743", 20181217, "Malmö", 1735);
		
		Course course1 = new Course("C12345", "SYS21", 30);
		Course course2 = new Course("C67859", "SYS18", 45);
		
		Result result1 = new Result(54, student1, writtenExam1);
		
		writtenExam1.addStudent(student1);
		student1.addWrittenExam(writtenExam1);
		
		writtenExam2.addStudent(student2);
		student2.addWrittenExam(writtenExam2);
		
		StudentRegister SR = new StudentRegister();
		
		System.out.println(SR.getUniqueStudentNbr());
		System.out.println("hej");
			
	}

}
