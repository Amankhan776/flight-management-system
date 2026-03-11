package com.example.demo.controller;
 
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
 
import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;
 
@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;
	public EmployeeController(EmployeeService employeeService )
	{
		this.employeeService = employeeService;
	}
	@PostMapping("/add")
	public Employee addEmployee(@RequestBody Employee employee)
	{
		return employeeService.addEmployee(employee);
	}
	//@RequestMapping(value="/getEmployee/{id}", method=RequestMethod.GET)
	@GetMapping("/getEmployee/{id}")
	public Employee getEmployeeById(@PathVariable("id") Long id) {
		return employeeService.getEmployeeById(id);
	}
	@RequestMapping(value="/all", method=RequestMethod.GET)
	public List<Employee> getAllEmployees() 
	{
		return employeeService.getAllEmployees();
	}
	@RequestMapping(value="/update/{id}", method=RequestMethod.PUT)
	public Employee updateEmployee(@PathVariable("id") Long id, @RequestBody Employee employee)
	{
		return employeeService.updateEmployee(id, employee);
	}
	//@RequestMapping(value="/delete/{id}", method=RequestMethod.PUT)
	@DeleteMapping("/delete/{id}")
	public boolean deleteEmployee(@PathVariable("id") Long id)
	{
		return employeeService.deleteEmployee(id);
	}
 
}