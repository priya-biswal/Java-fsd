import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-update-employee',
  templateUrl: './update-employee.component.html',
  styleUrls: ['./update-employee.component.css']
})
export class UpdateEmployeeComponent implements OnInit {
  employeeId: number | undefined;
  employee: any;

  constructor(
    private route: ActivatedRoute,
    private router: Router,
    private http: HttpClient
  ) {}

  ngOnInit() {
    this.route.params.subscribe(params => {
      this.employeeId = +params['id'];
      this.fetchEmployeeDetails();
    });
  }

  fetchEmployeeDetails() {
    this.http.get<any>(`http://localhost:3000/employees/${this.employeeId}`).subscribe(
      employee => {
        this.employee = employee;
      },
      error => {
        console.log('Error fetching employee details:', error);
      }
    );
  }

  updateEmployee() {
    if (!this.employee) {
      console.error('Employee data is not available.');
      return;
    }
  
    const updatedEmployee = {
      first_name: this.employee.first_name,
      last_name: this.employee.last_name,
      email: this.employee.email
    };
  
    this.http.put(`http://localhost:3000/employees/${this.employeeId}`, updatedEmployee)
      .subscribe(
        () => {
          console.log('Employee updated successfully');
          alert('Employee updated successfully');
          this.router.navigate(['/employees']);
        },
        error => {
          console.error('Error updating employee:', error);
        }
      );
  }
}
