import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-employee-management',
  templateUrl: './employee-management.component.html',
  styleUrls: ['./employee-management.component.css']
})
export class EmployeeManagementComponent implements OnInit {
  employees: any[] = [];
  newEmployee: any = {};

  constructor(private http: HttpClient) { }

  ngOnInit() {
    this.fetchEmployees();
  }

  fetchEmployees() {
    this.http.get<any[]>('http://localhost:3000/employees').subscribe(
      employees => {
        this.employees = employees;
      },
      error => {
        console.log('Error fetching employees:', error);
      }
    );
  }

  addEmployee() {
    this.http.post('http://localhost:3000/employees', this.newEmployee).subscribe(
      () => {
        this.newEmployee = {}; // Clear the form
        this.fetchEmployees(); // Refresh employee list
      },
      error => {
        console.log('Error adding employee:', error);
      }
    );
  }
  viewDetails(employee: any) {
    // Implement logic to view the details of the selected employee
    console.log('View details for employee:', employee);
    // You can show the employee details in a modal or navigate to a separate page for viewing the details
  }
}
