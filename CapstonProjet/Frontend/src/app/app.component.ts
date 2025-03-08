import { CommonModule, formatNumber } from '@angular/common';
import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';
import { Router, RouterModule, RouterOutlet } from '@angular/router';
import { UserService } from './services/user.service';


@Component({
  selector: 'app-root',
  imports: [RouterOutlet, CommonModule,RouterModule],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'TaskManagement';
  constructor(private userService: UserService, private router: Router) {}
  logout(): void {
    this.userService.clearToken(); 
    this.router.navigate(['/login']); 
  }
}
