package com.example.dao;

import java.util.List;

import com.example.model.Employee;

public interface EmployeeDao {

	public abstract List<Employee> getAllEmployees();
	
	public abstract Employee getEmployee(int id);
	
	public abstract boolean createEmployee(Employee employee);
	
	public abstract Employee deleteEmployee(int id);
	
	public abstract void deleteAllEmployees();
	
	public abstract boolean updateEmployee(int id,Employee employee);
}
