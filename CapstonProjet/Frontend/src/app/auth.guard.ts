import { CanActivateFn, Router } from '@angular/router';
import { UserService } from './services/user.service';
import { inject } from '@angular/core';

export const authGuard: CanActivateFn = (route, state) => {
  const authService = inject(UserService); 
  const router = inject(Router);

  if (authService.isAuthenticated()) {
    return true; 
  } else {
    router.navigate(['/signup']); 
    return false;
  }
};

