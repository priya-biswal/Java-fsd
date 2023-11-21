import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-employee-details',
  templateUrl: './employee-details.component.html',
  styleUrls: ['./employee-details.component.css']
})
export class EmployeeDetailsComponent implements OnInit {
  employee: any;

  constructor(
    private route: ActivatedRoute,
    private router: Router,
    private http: HttpClient
  ) {}

  ngOnInit() {
    this.route.params.subscribe(params => {
      const employeeId = params['id'];
      this.fetchEmployeeDetails(employeeId);
    });
  }

  fetchEmployeeDetails(employeeId: number) {
    this.http.get<any>(`http://localhost:3000/employees/${employeeId}`).subscribe(
      employee => {
        this.employee = employee;
      },
      error => {
        console.log('Error fetching employee details:', error);
      }
    );
  }

  goHomePage() {
    this.router.navigate(['/employees']);
  }

  updateEmployee(employeeId: number) {
    this.router.navigate(['/update', employeeId]);
  }
  

  deleteEmployee(employeeId: number) {
    // Send the HTTP DELETE request to delete the employee by their ID
    this.http.delete(`http://localhost:3000/employees/${employeeId}`)
      .subscribe(
        () => {
          // Employee deleted successfully
          console.log('Employee deleted successfully');
          
          // Show success message
         alert('Employee deleted successfully');
  
          // Redirect to home page
          this.router.navigate(['/employees']);
        },
        error => {
          // Error deleting employee
          console.error('Error deleting employee:', error);
          // Handle the error, such as displaying an error message to the user
        }
      );
  }
}

