import { Component } from '@angular/core';
import { UserService } from '../../services/user.service';
import { Router, RouterModule } from '@angular/router';
import { User } from '../../user.model';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-user-login',
  imports: [FormsModule,RouterModule],
  templateUrl: './user-login.component.html',
  styleUrl: './user-login.component.css'
})
export class UserLoginComponent {
  user: User = {
    userName: '',
    password: ''
  };

  constructor(private userService: UserService, private router: Router) { }

  login(): void {
    this.userService.login(this.user).subscribe(response => {
      alert(response.message);
      if (response.token) {
        this.userService.setToken(response.token); 
        this.router.navigate(['/tasks']); 
      }
    }, error => {
      alert("Invalid credentials! Please try again.");
    });
  }
}
