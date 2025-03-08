import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { User } from '../user.model';

@Injectable({
  providedIn: 'root'
})
export class UserService {
  private apiUrl = 'http://localhost:8092/user';
  private TOKEN_KEY = 'token';
  constructor(private http: HttpClient) { }

  signup(user: User): Observable<any> {
    return this.http.post(`${this.apiUrl}/signup`, user);
  }

  login(user: User): Observable<any> {
    return this.http.post(`${this.apiUrl}/login`, user);
  }
  isAuthenticated(): boolean {
    return !!localStorage.getItem(this.TOKEN_KEY);  // !!-used to convert result in boolean value.
  }

  setToken(token: string): void {
    localStorage.setItem(this.TOKEN_KEY, token);
  }

  clearToken(): void {
    localStorage.removeItem(this.TOKEN_KEY);
  }
}
