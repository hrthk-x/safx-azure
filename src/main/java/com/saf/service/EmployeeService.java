package com.saf.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.saf.entity.Employee;
import com.saf.repository.EmployeeRepository;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@AllArgsConstructor
public class EmployeeService {
	EmployeeRepository er;
	public String saveEmployee(Employee e) {
		if(!er.existsByFirstNameAndLastName(e.getFirstName(),e.getLastName())) {er.save(e);return "Employee Added Successfully";}
		else return "Employee exist Already";
	}
	public List<Employee> getAllEmployee(){
		return er.findAll();
	}
	public String deleteEmployee(Employee e) {
		if(er.existsById(e.getId())) {
			er.deleteById(e.getId());
			return "Deleted Successfully";
		}
		return "Employee Doesn't Exists!";
	}
	public String updateEmployee(Employee e) {
		if(er.existsById(e.getId())) {
			er.save(e);
			return "Employee Updated Successfully";
		}
		return "Employee Doesn't Exists!";
	}
	public String deleteEmployeeById(int id) {
		if(er.existsById(id)) {
			er.deleteById(id);
			return "Deleted Successfully";
		}
		return "Employee Doesn't Exists!";
	}
}
