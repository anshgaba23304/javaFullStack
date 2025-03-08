import { Component } from '@angular/core';
import { TaskService } from '../../services/task.service';
import { Task } from '../../task.model';
import { Router } from '@angular/router';
import { FormsModule } from '@angular/forms';
@Component({
  selector: 'app-task-create',
  imports: [FormsModule],
  templateUrl: './task-create.component.html',
  styleUrl: './task-create.component.css'
})
export class TaskCreateComponent {
  task: Task = {
    taskId: 0,
    taskName: '',
    taskDesc: '',
    taskDue: '',
    taskStatus: ''
  };

  constructor(private taskService: TaskService, private router: Router) { }

  createTask(): void {
    this.taskService.createTask(this.task).subscribe(() => {
      this.router.navigate(['/tasks']);
    });
  }
}
