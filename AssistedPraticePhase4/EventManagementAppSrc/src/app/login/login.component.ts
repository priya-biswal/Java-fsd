import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent {
  username: string | undefined;
  password: string | undefined;
  errorMessage: string | undefined;

  constructor(private router: Router, private http: HttpClient) {}

  login() {
    // Perform login logic here
    // Example: Check username and password against a stored value
    if (this.username === 'admin' && this.password === '123456') {
      // Navigate to the main employee management page
      this.router.navigate(['/employees']);
    } else {
      // Set error message
      this.errorMessage = 'Invalid username or password';
    }
  }
}
