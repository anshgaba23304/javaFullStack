import { Component } from '@angular/core';
import { Task } from '../../task.model';
import { TaskService } from '../../services/task.service';
import { ActivatedRoute, Router, RouterModule } from '@angular/router';
import { FormsModule } from '@angular/forms';
import { CommonModule } from '@angular/common';
@Component({
  selector: 'app-task-detail',
  imports: [FormsModule,CommonModule,RouterModule],
  templateUrl: './task-detail.component.html',
  styleUrl: './task-detail.component.css'
})
export class TaskDetailComponent {
  task: Task | undefined;

  constructor(
    private taskService: TaskService,
    private route: ActivatedRoute,
    private router: Router
  ) { }

  ngOnInit(): void {
    const id = Number(this.route.snapshot.paramMap.get('id'));
    this.taskService.getTaskById(id).subscribe(data => {
      this.task = data;
    });
  }

  updateTask(): void {
    if (this.task) {
      this.taskService.updateTask(this.task.taskId, this.task).subscribe(() => {
        this.router.navigate(['/tasks']);
      });
    }
  }
}
