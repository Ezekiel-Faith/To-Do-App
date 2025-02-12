package kiels.project.todoapp.controller;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TaskCardController {
	public Label taskName;
	public Label taskTimeStamp;
	public Label taskStatus;

	public void handleViewTask(ActionEvent actionEvent) {
		System.out.println("Viewing task: " + taskName.getText());
		// TODO: add viewing task logic
	}

	public void setTaskDetails(String name, LocalDate timeStamp, String status) {
		taskName.setText(name);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm a, dd.MM.yyyy");
		taskTimeStamp.setText(timeStamp.format(formatter));
		taskStatus.setText(status);
	}
}
