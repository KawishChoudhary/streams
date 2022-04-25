package com.learning.service;

import java.util.List;

import com.learning.beans.Employee;

public interface EmployeeService {
	
	public void loadEmployees();
	public List<Employee> listEmployees();
	public Employee getEmployee();
	public int addEmployee(Employee employee);
	public Employee deleteEmployee(int id);

}
