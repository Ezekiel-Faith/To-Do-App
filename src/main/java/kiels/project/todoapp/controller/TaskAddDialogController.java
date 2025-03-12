package kiels.project.todoapp.controller;

import io.github.palexdev.materialfx.controls.MFXTextField;
import javafx.event.ActionEvent;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

public class TaskAddDialogController {
	public MFXTextField taskTitleField;
	public TextArea taskDescription;
	private TodoController mainController;

	public void setMainController(TodoController mainController) {
		this.mainController = mainController;
	}

	public void handleCancel(ActionEvent actionEvent) {
		closeDialog();
	}

	public void handleSubmit(ActionEvent actionEvent) {
	}

	private void closeDialog() {
		Stage stage = (Stage) taskTitleField.getScene().getWindow();
		stage.close();
	}
}
