package com.demo.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.model.Employee;
import com.demo.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepository employeeRepository;

	public void saveUser(Employee employee){
		
		Employee employee2 =new Employee(employee.getName(), employee.getDept());
		System.out.println(employee2);
		employeeRepository.save(employee2);
	}
	
	
	
	 public List<Employee> getEmpList(){
		
		 List<Employee> emps=employeeRepository.findAll();
		 
		return emps;
		 
	 }
	 
	
}
