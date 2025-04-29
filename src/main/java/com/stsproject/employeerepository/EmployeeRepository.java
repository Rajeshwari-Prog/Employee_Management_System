package com.stsproject.employeerepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.stsproject.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}
