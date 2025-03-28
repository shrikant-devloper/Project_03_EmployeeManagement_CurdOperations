package com.nit.services;

import com.nit.model.Employee;

public interface IEmployeeMgmtServices {
	public Iterable<Employee> getAllEmployees();
	public String regiterEmployee(Employee emp);
	public Employee getEmployeeByNO(int eno);
	public String updateEmployee(Employee emp);
	public String deleteEmployeeById(int eno);
	
}
