module kiels.project.todoapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires MaterialFX;


    opens kiels.project.todoapp.controller to javafx.fxml;
    exports kiels.project.todoapp;
}