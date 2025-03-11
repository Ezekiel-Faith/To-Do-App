package kiels.project.todoapp.managers;

import kiels.project.todoapp.dto.TaskDTO;

import java.util.ArrayList;
import java.util.List;

public class TaskList {
	private List<TaskDTO> tasks;

	public TaskList() {
		tasks = new ArrayList<>();
	}

	public List<TaskDTO> getTasks() {
		return tasks;
	}

	public void addTasks(TaskDTO task) {
		tasks.add(task);
	}

	public void removeTasks(TaskDTO task) {
		tasks.remove(task);
	}
}
