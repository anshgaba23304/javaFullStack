package com.example.TaskManagementProject.controller;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.TaskManagementProject.model.Task;
import com.example.TaskManagementProject.model.User;
import com.example.TaskManagementProject.repositories.TaskRepository;
import com.example.TaskManagementProject.repositories.UserRepository;

@CrossOrigin("http://localhost:4200")
@RestController

public class TaskController {
	@Autowired
	TaskRepository taskRepo;
	UserRepository userRepo;
	@Autowired
	private EmailService emailService;
	
	@PostMapping("/create")
	public Task createTask(@RequestBody Task tsk) {
		return taskRepo.save(tsk);
	}
	@GetMapping("/view")
	public List<Task> displayTask(){
		return taskRepo.findAll();
	}
	@GetMapping("/view/{taskId}")
	public ResponseEntity<Object> displayTaskById(@PathVariable("taskId") int id) {
		Optional<Task> taskObj=taskRepo.findById(id);
		Task taskData=null;
		if(taskObj.isPresent()) {
			taskData=taskObj.get();
		}
		return new ResponseEntity<>(taskData,HttpStatus.OK);
	}
	@DeleteMapping("/delete/{taskId}")
	public void delete(@PathVariable("taskId") int id) {
		taskRepo.deleteById(id);
	}
	
	@PutMapping("/update/{taskId}")
	public ResponseEntity<Task> updateTaskById(@PathVariable("taskId") int id,@RequestBody Task tsk){
		Task updateTask=null;
		Optional<Task> tskObj=taskRepo.findById(id);
		if(tskObj.isPresent()) {
			updateTask=tskObj.get();
			updateTask.setTaskId(tsk.getTaskId());
			updateTask.setTaskName(tsk.getTaskName());
			updateTask.setTaskDesc(tsk.getTaskDesc());
			updateTask.setTaskDue(tsk.getTaskDue());
			updateTask.setTaskStatus(tsk.getTaskStatus());
//			 if ("Completed".equalsIgnoreCase(tsk.getTaskStatus())) {
//		            Optional<User> userOptional = userRepo.findByUserName(u.getUserName());
//		            if (userOptional.isPresent()) {
//		                String userEmail = userOptional.get().getUserName(); 
//		                emailService.sendTaskCompletionEmail(userEmail, tsk.getTaskName());
//		            } else {
//		                System.out.println("User  not found: " + u.getUserName());
//		            }
//		        }
			taskRepo.save(updateTask);
		}
		return new ResponseEntity<>(updateTask,HttpStatus.OK);
	}
}
