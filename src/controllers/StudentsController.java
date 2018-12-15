package controllers;

import javafx.fxml.FXML;
import javafx.scene.control.TableView;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import view.*;
import model.*;

import application.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import model.Course;
import model.Result;
import model.Student;
import model.StudentRegister;
import model.WrittenExam;
import javafx.scene.control.Button;

public class StudentsController {
	
	@FXML
	private Label lblResponse;
	@FXML
	private TextField textFieldForeName;
	@FXML
	private TextField textFieldLastName;
	@FXML
	private TextArea textAreaReturn;
	@FXML
	private ArrayList<String> listStudentID = new ArrayList<String>();
	@FXML
    private TableView<Student> studentTableView;
	@FXML
    private TableColumn<Student, String> studentIDColumn;
	@FXML
    private TableColumn<Student, String> StudentNameColumn;
	
	StudentRegister studentRegister = new StudentRegister();
	
	
	@FXML
	public void btnGoBack(ActionEvent event) {
		textAreaReturn.setText("");
		Main.setPane(0);
		}
	
	//Add students interface
	@FXML
	public void btnAddStudent(ActionEvent event) {
		String studentForeName = textFieldForeName.getText();
		String studentLastName = textFieldLastName.getText();
		
		if (studentForeName.isEmpty() && studentLastName.isEmpty()) {
			lblResponse.setText("Please add a fore name and a last name");
		} else if (studentForeName.isEmpty() && !studentLastName.isEmpty()) {
			lblResponse.setText("Please add a fore name");
		} else if (studentLastName.isEmpty() && !studentForeName.isEmpty()) {
			lblResponse.setText("Please add a last name");
		} else if (!studentLastName.isEmpty() && !studentForeName.isEmpty()) {
				String studentNbrFull = "S" + studentRegister.setStudentNumber();
				String fullName = studentForeName + " " + studentLastName;
				Student newStudent = new Student(studentNbrFull, fullName);
				studentRegister.addStudent(newStudent);
		
				textAreaReturn.setText("Added \nName: " + fullName + "\nStudent number: " + studentNbrFull);
				textFieldForeName.setText("");
				textFieldLastName.setText("");
				lblResponse.setText("");
		}
	}
	/*@FXML
	public void btnShowAllStudents(ActionEvent event) {
		for(Student tmpStudent : studentRegister) {
			
		}*/

	}
		/*@FXML
		public void btnRemoveStudent(ActionEvent event) {
			String nbr = "S" + textFieldStudentNumber.getText();
			Student tmpStudent = studentRegister.findStudent(nbr);
			
			if (tmpStudent != null) {
				textAreaReturn.setText(tmpStudent.getName() + " is deleted");
				lblResponse.setText("");
			} else {
				lblResponse.setText("Couldn't find the person with number: " + nbr);
			}
			textFieldName.setText("");
			textFieldStudentNumber.setText("");
		}*/

