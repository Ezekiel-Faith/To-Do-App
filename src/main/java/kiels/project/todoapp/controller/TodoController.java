package kiels.project.todoapp.controller;

import io.github.palexdev.materialfx.controls.MFXComboBox;
import io.github.palexdev.materialfx.controls.MFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

import java.time.LocalDateTime;

public class TodoController {
	public MFXTextField taskTitle;
	public MFXComboBox statusComboBox;
	public VBox taskList;

	public void initialize() {
		statusComboBox.getItems().addAll("All", "ToDo", "InProgress", "Done");
		statusComboBox.setValue("All");

		addTask("Create a JavaFX Project", LocalDateTime.now().minusMinutes(3), "ToDo");
		addTask("Learn Springboot", LocalDateTime.now().minusMinutes(4), "InProgress");
		addTask("Create a ToDo App", LocalDateTime.now().minusMinutes(5), "Done");



	}

	public void handleAddTask(ActionEvent actionEvent) {
		addTask("New Task", LocalDateTime.now(), "ToDo");
	}

	private void addTask(String taskName, LocalDateTime timeStamp, String status) {
		try {
			FXMLLoader loader = new FXMLLoader(
					getClass().getResource("/kiels/project/todoapp/task-card.fxml"));
			HBox taskCard = loader.load();
			TaskCardController controller = loader.getController();
			controller.setTaskDetails(taskName, timeStamp, status);

			taskList.getChildren().add(taskCard);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
