import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Task } from '../task.model';

@Injectable({
  providedIn: 'root'
})
export class TaskService {
  private apiUrl = 'http://localhost:8092'; 

  constructor(private http: HttpClient) { }
  getTasks(): Observable<Task[]> {
    return this.http.get<Task[]>(`${this.apiUrl}/view`);
  }

  getTaskById(id: number): Observable<Task> {
    return this.http.get<Task>(`${this.apiUrl}/view/${id}`);
  }

  createTask(task: Task): Observable<Task> {
    return this.http.post<Task>(`${this.apiUrl}/create`, task);
  }

  updateTask(id: number, task: Task,): Observable<Task> {
    return this.http.put<Task>(`${this.apiUrl}/update/${id}`, task);
  }

  deleteTask(id: number): Observable<void> {
    return this.http.delete<void>(`${this.apiUrl}/delete/${id}`);
  }

}
