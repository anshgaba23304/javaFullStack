import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { TaskListComponent } from './components/task-list/task-list.component';
import { TaskDetailComponent } from './components/task-detail/task-detail.component';
import { TaskCreateComponent } from './components/task-create/task-create.component';
import { UserSignupComponent } from './components/user-signup/user-signup.component';
import { UserLoginComponent } from './components/user-login/user-login.component';
import { authGuard } from './auth.guard';

export const routes: Routes = [
    { path: '', redirectTo: '/signup', pathMatch: 'full' },
    { path: 'signup', component: UserSignupComponent },
    { path: 'login', component: UserLoginComponent },
    { path: 'tasks', component: TaskListComponent, canActivate: [authGuard] },
    { path: 'tasks/create', component: TaskCreateComponent, canActivate: [authGuard] },
    { path: 'tasks/:id', component: TaskDetailComponent, canActivate: [authGuard] },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }