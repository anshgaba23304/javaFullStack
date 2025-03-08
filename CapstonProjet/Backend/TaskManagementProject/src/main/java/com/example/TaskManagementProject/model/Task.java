package com.example.TaskManagementProject.model;

import jakarta.persistence.*;

@Entity
@Table(name="TaskManagement")
public class Task {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="taskId")
	private int taskId;
	
	@Column(name="taskName",nullable = false)
	private String taskName;
	
	@Column(name="taskDesc")
	private String taskDesc;
	
	@Column(name="taskDue")
	private String taskDue;
	
	@Column(name="taskStatus")
	private String taskStatus;
	
	public Task() {}
	public int getTaskId() {
		return taskId;
	}

	public void setTaskId(int taskId) {
		this.taskId = taskId;
	}

	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	public String getTaskDesc() {
		return taskDesc;
	}

	public void setTaskDesc(String taskDesc) {
		this.taskDesc = taskDesc;
	}

	public String getTaskDue() {
		return taskDue;
	}

	public void setTaskDue(String taskDue) {
		this.taskDue = taskDue;
	}

	public String getTaskStatus() {
		return taskStatus;
	}

	public void setTaskStatus(String taskStatus) {
		this.taskStatus = taskStatus;
	}
	
	
}
