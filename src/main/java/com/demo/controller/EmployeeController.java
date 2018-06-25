package com.demo.controller;


import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.Employee;
import com.demo.repository.EmployeeRepository;
import com.demo.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@GetMapping("/getAllEmps")
	public List<Employee> getAllStudents(){
		return employeeService.getEmpList();
	}
	
	
	@RequestMapping(value="/saveuser" ,method = RequestMethod.POST)
	@Consumes(MediaType.APPLICATION_JSON)
	public Employee saveUser(@RequestBody Employee employee){
		
		return employeeRepository.save(employee);
	}
	
	
	@RequestMapping(value="/updateEmployee/{id}",method=RequestMethod.POST)
	@Consumes(MediaType.APPLICATION_JSON)
public Employee updateEmployee(@PathVariable(value="id") Long id,@RequestBody Employee employee){
		
	     Employee employee2 =employeeRepository.findById(id);
	     System.out.println(employee2);
	     
	     
	     if(employee2==null){
	    	 throw new NullPointerException();
	     }
	     
	     employee2.setName(employee.getName());
	     employee2.setDept(employee.getDept());
	     
	     Employee updateEmployee=employeeRepository.save(employee2);
	     
	     return updateEmployee;
	     
	     
	}
	@RequestMapping(value="/deleteEmployee/{id}",method=RequestMethod.POST)
	@Consumes(MediaType.APPLICATION_JSON)
	public Employee deleteEmployee(@PathVariable(value="id")Long id){
		Employee employee2 =employeeRepository.findById(id);
		  if(employee2==null){
		    	 throw new NullPointerException();
		     }
		  employeeRepository.delete(employee2);
		return employee2;
	}
	
}
