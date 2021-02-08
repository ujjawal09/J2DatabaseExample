package com.example.springH2demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springH2demo.dao.EmlployeeRepository;
import com.example.springH2demo.model.Employee;



@RestController
public class EmployeeController {
@Autowired	
private EmlployeeRepository employeeRepository;
@PostMapping("/saveEmployee")
public String saveEmployee(@RequestBody Employee employee)
{
	employeeRepository.save(employee);
	return "Employee Saved..";
}
@GetMapping("/getAllEmployees")
public List<Employee> getAll()
{
	return employeeRepository.findAll();
}
@GetMapping("/getAllEmployee/{dept}")
public List<Employee> getEmployeeByDept(@PathVariable String dept)
{
 return employeeRepository.findByDept(dept);		 	 		 	 	 	  
}
}
