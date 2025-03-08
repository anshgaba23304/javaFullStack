import { Component } from '@angular/core';
import { User } from '../../user.model';
import { UserService } from '../../services/user.service';
import { Router, RouterModule } from '@angular/router';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-user-signup',
  imports: [CommonModule,FormsModule,RouterModule],
  templateUrl: './user-signup.component.html',
  styleUrl: './user-signup.component.css'
})
export class UserSignupComponent {
  user: User = {
    userName: '',
    password: ''
  };

  constructor(private userService: UserService, private router: Router) { }

  signup(): void {
    this.userService.signup(this.user).subscribe(response => {
      alert(response.message);
      if (response.message === "Signup successful! Please login.") {
        this.router.navigate(['/login']);
      }
    }, error => {
      alert("User  already exists!");
    });
  }
}
