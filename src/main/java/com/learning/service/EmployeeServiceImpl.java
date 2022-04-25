package com.learning.service;

import java.util.List;

import com.learning.beans.Employee;

public class EmployeeServiceImpl implements EmployeeService {
	
	List<Employee> employees;

	@Override
	public void loadEmployees() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Employee> listEmployees() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee getEmployee() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int addEmployee(Employee employee) {
		employees.add(employee);
		return 0;
	}

	@Override
	public Employee deleteEmployee(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
