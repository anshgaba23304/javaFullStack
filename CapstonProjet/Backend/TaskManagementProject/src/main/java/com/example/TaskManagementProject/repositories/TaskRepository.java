package com.example.TaskManagementProject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.TaskManagementProject.model.Task;

public interface TaskRepository extends JpaRepository<Task,Integer>{
	
}
