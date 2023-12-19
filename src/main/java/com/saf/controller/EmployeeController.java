package com.saf.controller;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.saf.entity.Employee;
import com.saf.service.EmployeeService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class EmployeeController {

	EmployeeService es;
	
	@RequestMapping(value="getAllEmployee",method=RequestMethod.GET)
	List<Employee> getAllEmployee(){
		return es.getAllEmployee();
	}
	@RequestMapping(method=RequestMethod.POST)
	String welcomeEmployee() {
		return "Welcome Employee";
	}
	@RequestMapping(value="saveEmployee",method=RequestMethod.POST)
	String saveEmployee(@RequestBody Employee e) {
		return es.saveEmployee(e);
	}
	@RequestMapping(value="updateEmployee",method=RequestMethod.PUT)
	String updateEmployee(@RequestBody Employee e) {
		return es.updateEmployee(e);
	}
	@RequestMapping(value="deleteEmployee",method=RequestMethod.DELETE)
	String deleteEmployee(@RequestBody Employee e) {
		return es.deleteEmployee(e);
	}
	@RequestMapping(value="deleteEmployeeById/{id}",method=RequestMethod.DELETE)
	String deleteEmployeeById(@PathVariable int id) {
		return es.deleteEmployeeById(id);
	}
}
