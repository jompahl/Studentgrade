package application;

import model.*;
import controllers.*;
import view.*;
import java.util.ArrayList;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;


public class Main extends Application {

	static AnchorPane root;
	
	static ArrayList<AnchorPane> grid = new ArrayList<AnchorPane>();
	
	private static int idxCur = 0;
	
	@Override
	public void start(Stage primaryStage) {
		try {
			root = FXMLLoader.load(this.getClass().getResource("/view/Main.fxml"));
			
			grid.add((AnchorPane)FXMLLoader.load(getClass().getResource("/view/FirstMenu.fxml")));
			grid.add((AnchorPane)FXMLLoader.load(getClass().getResource("/view/Students.fxml")));
			grid.add((AnchorPane)FXMLLoader.load(getClass().getResource("/view/Courses.fxml")));
			grid.add((AnchorPane)FXMLLoader.load(getClass().getResource("/view/RemoveStudents.fxml")));
			
			root.getChildren().add(grid.get(0));
			Scene scene = new Scene(root,550,500);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.setTitle("IS-project");
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	private void init_app() {
		for (int i = 0; i < grid.size(); i++) {
			
		}
	}
	public static AnchorPane getPane(int idx) {
		return grid.get(idx);
	}
	public static void setPane(int idx) {
		root.getChildren().remove(grid.get(idxCur));
		root.getChildren().add(grid.get(idx));
		idxCur = idx;
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
