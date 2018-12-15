package controllers;

import java.net.URL;
import java.util.ResourceBundle;
import model.*;

import application.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import model.Course;
import model.Result;
import model.Student;
import model.StudentRegister;
import model.WrittenExam;
import javafx.scene.control.Button;

public class CourseController {
	
	@FXML
	private Label lblResponse;
	@FXML
	private TextField textFieldCourseName;
	@FXML
	private TextField textFieldCredits;
	@FXML
	private TextArea textAreaReturn;
	
	CourseRegister courseRegister = new CourseRegister();
	
	@FXML
	public void btnGoBack(ActionEvent event) {
		textFieldCourseName.setText("");
		textFieldCredits.setText("");
		lblResponse.setText("");
		textAreaReturn.setText("");
		Main.setPane(0);
	}
	@FXML
	public void btnCreateCourse(ActionEvent event) {
		String courseName = textFieldCourseName.getText();
		String Stringcredits = textFieldCredits.getText();
		
		if (courseName.isEmpty() && Stringcredits.isEmpty()) {
			lblResponse.setText("Please add a course name and credits");
		} else if (courseName.isEmpty() && !Stringcredits.isEmpty()) {
			lblResponse.setText("Please add a course name");
		} else if (Stringcredits.isEmpty() && !courseName.isEmpty()) {
			lblResponse.setText("Please add credits");
		} else if (!Stringcredits.isEmpty() && !courseName.isEmpty()) {
			try{
				int intCredits = Integer.parseInt(textFieldCredits.getText());
				String courseCodeFull = "C" + courseRegister.setCourseNumber();
				Course newCourse = new Course(courseCodeFull, courseName, intCredits);
				courseRegister.addCourse(newCourse);
			
				textAreaReturn.setText("Added \nCourse code: " + courseCodeFull + "\nName: " + courseName +"\nCredits: " + intCredits);
				textFieldCourseName.setText("");
				textFieldCredits.setText("");
				lblResponse.setText("");
					
			}catch(NumberFormatException ex) {
				lblResponse.setText("Credits must only contain numbers\nand no decimals");
			}
		}
	}
}