import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { LoginComponent } from './login/login.component';
import { EmployeeManagementComponent } from './employee-management/employee-management.component';
import { EmployeeDetailsComponent } from './employee-details/employee-details.component';
import { AddEmployeeComponent } from './add-employee/add-employee.component';
import { UpdateEmployeeComponent } from './update-employee/update-employee.component';

const routes: Routes = [
  { path: '', redirectTo: '/login', pathMatch: 'full' },
  { path: 'login', component: LoginComponent },
  { path: 'addEmployee', component:AddEmployeeComponent },
  { path: 'employees', component: EmployeeManagementComponent },
  { path: 'update/:id', component: UpdateEmployeeComponent },
  { path: 'employees/:id', component: EmployeeDetailsComponent },
  { path: '**', redirectTo: '/login' } // Redirect to login for any other unknown routes
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
