import { Component } from '@angular/core';
import { Task } from '../../task.model';
import { TaskService } from '../../services/task.service';
import { RouterLink } from '@angular/router';
import { FormsModule } from '@angular/forms';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-task-list',
  imports: [RouterLink,FormsModule,CommonModule],
  templateUrl: './task-list.component.html',
  styleUrl: './task-list.component.css'
})
export class TaskListComponent {
  tasks: Task[] = [];

  constructor(private taskService: TaskService) { }

  ngOnInit(): void {
    this.loadTasks();
  }

  loadTasks(): void {
    this.taskService.getTasks().subscribe(data => {
      this.tasks = data;
    });
  }

  deleteTask(taskId: number): void {
    this.taskService.deleteTask(taskId).subscribe(() => {
      this.loadTasks(); 
    });
  }
}
