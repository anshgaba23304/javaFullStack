package com.example.TaskManagementProject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

	@Autowired
	private JavaMailSender emailSender;
	
	public void sendEmail(String to,String subject,String text) {
		SimpleMailMessage message =new SimpleMailMessage();
		message.setTo(to);
		message.setSubject(subject);
		message.setText(text);
		emailSender.send(message);
	}
	public void sendTaskCompletionEmail(String to,String taskName) {
		String subject="Task Completes:"+ taskName;
		String text="Congratulations on completing your task: " + taskName + "! Keep up the great work and look for new tasks to tackle.";
		sendEmail(to,subject,text);
	}
	public void sendSignupEmail(String to) {
        String subject = "Welcome to Task Management!";
        String text = "Thank you for signing up! You can now start managing your tasks.";
        sendEmail(to, subject, text);
    }
}
