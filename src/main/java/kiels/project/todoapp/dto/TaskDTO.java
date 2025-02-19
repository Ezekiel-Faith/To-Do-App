package kiels.project.todoapp.dto;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class TaskDTO {
	private String title;
	private String description;
	private LocalDateTime dateAdded;
	private String status;
	private List<String> comments;

	public TaskDTO(String title, String description, LocalDateTime dateAdded, String status) {
		this.title = title;
		this.description = description;
		this.dateAdded = dateAdded;
		this.status = status;
		this.comments = new ArrayList<>();
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDateTime getDateAdded() {
		return dateAdded;
	}

	public void setDateAdded(LocalDateTime dateAdded) {
		this.dateAdded = dateAdded;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public List<String> getComments() {
		return comments;
	}

	public void addComment(String comments) {
		this.comments.add(comments);
	}
}
