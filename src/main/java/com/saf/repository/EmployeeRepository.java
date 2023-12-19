package com.saf.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.saf.entity.Employee;
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
	public boolean existsByFirstNameAndLastName(String firstName,String lastName);
	public boolean existsById(int id);
}
