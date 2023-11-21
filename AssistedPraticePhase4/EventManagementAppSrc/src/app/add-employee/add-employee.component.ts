import { Component } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-add-employee',
  templateUrl: './add-employee.component.html',
  styleUrls: ['./add-employee.component.css']
})
export class AddEmployeeComponent {
  newEmployee: any = {
    first_name: '',
    last_name: '',
    email: ''
  };
  router: any;

  constructor(private http: HttpClient) {}

  onSubmit() {
    this.addEmployee();
  }

  goHome() {
    window.location.href = "/employees";
  }

  private addEmployee() {
    this.http.post('http://localhost:3000/employees', this.newEmployee)
      .subscribe(
        () => {
          this.newEmployee = {}; // Clear the form
          console.log('Employee added successfully');

          alert('New Employee Added successfully');
  
          // Redirect to home page
          this.router.navigate(['/employees']);
          // You can perform additional actions such as showing a success message or navigating to another page
        },
        error => {
          console.error('Error adding employee:', error);
          // You can handle the error here, such as displaying an error message to the user
        }
      );
  }
}

