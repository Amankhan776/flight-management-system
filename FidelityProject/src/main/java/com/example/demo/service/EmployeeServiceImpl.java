package com.example.demo.service;
 
import com.example.demo.model.Employee;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
 
import org.springframework.stereotype.Service;
 
@Service
public class EmployeeServiceImpl implements EmployeeService{
	private List<Employee>  employeeList = new ArrayList<>();
	//private AtomicLong idGenerator = new AtomicLong();
	@Override
	public Employee addEmployee(Employee employee) {
		//employee.setId(employee.getId());
		employeeList.add(employee);
		return employee;
	}
 
	@Override
	public List<Employee> getAllEmployees() {
		return employeeList;
	}
 
	@Override
	public Employee getEmployeeById(Long id) {
		for(Employee e: employeeList) {
			if(e.getId().equals(id)) {
				return e;
			}
		}
		throw new RuntimeException("Employee not found with the id :" + id);
	}
	@Override
	public Employee updateEmployee(Long id, Employee employee) {
		for(Employee e: employeeList) {
		   if(e.getId().equals(id))
		   {
			   e.setName(employee.getName()); 
			   e.setDepartment(employee.getDepartment());
			   e.setSalary(employee.getSalary()); 
			   return e;
		   }
		}
		throw new RuntimeException("Employee not found with the id :" + id);
	}
 
	@Override
	public boolean deleteEmployee(Long id) {
		/*Iterator<Employee> iterator = employeeList.iterator();
		while(iterator.hasNext()) {
			Employee e = iterator.next();
			if(e.getId().equals(id))
			{
				iterator.remove();
				return true;
			}
		}
		return false;*/
		for(Employee e: employeeList) {
			if(e.getId().equals(id)) 
			{
				employeeList.remove(e);
			}
		}
		return false;
	}
 
}