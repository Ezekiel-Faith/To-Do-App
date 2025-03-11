package kiels.project.todoapp.controller;

import io.github.palexdev.materialfx.controls.MFXComboBox;
import io.github.palexdev.materialfx.controls.MFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import kiels.project.todoapp.dto.TaskDTO;
import kiels.project.todoapp.managers.TaskList;

import java.time.LocalDateTime;

public class TodoController {
	public MFXTextField taskTitle;
	public MFXComboBox statusComboBox;
	public VBox taskListVBox;

	private TaskList taskList;

	public void initialize() {
		taskList = new TaskList();
		statusComboBox.getItems().addAll("All", "ToDo", "InProgress", "Done");
		statusComboBox.setValue("All");

		addTask("Create a JavaFX Project", "Build a really cool JavaFX App", LocalDateTime.now().minusMinutes(3), "ToDo");
		addTask("Learn Springboot", "Springboot is crucial for your career!", LocalDateTime.now().minusMinutes(4), "InProgress");
		addTask("Create a ToDo App", "Just follow the instructions and build it!", LocalDateTime.now().minusMinutes(5), "Done");



	}

	public void handleAddTask(ActionEvent actionEvent) {
		addTask("New Task", "A new task description",  LocalDateTime.now(), "ToDo");
	}

	private void addTask(String title, String description,
						 LocalDateTime dateAdded, String status) {
		TaskDTO newTask = new TaskDTO(title, description, dateAdded, status);
		taskList.addTasks(newTask);
		displayTask(newTask);
	}

	private void displayTask(TaskDTO task) {
		try {
			FXMLLoader loader = new FXMLLoader(
					getClass().getResource("/kiels/project/todoapp/task-card.fxml"));
			HBox taskCard = loader.load();
			TaskCardController controller = loader.getController();
			controller.setTaskDetails(task.getTitle(), task.getDateAdded(), task.getStatus());

			taskListVBox.getChildren().add(taskCard);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
