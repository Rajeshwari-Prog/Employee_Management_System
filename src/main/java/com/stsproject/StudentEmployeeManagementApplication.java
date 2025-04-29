package com.stsproject;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.stsproject.employeerepository.EmployeeRepository;
import com.stsproject.entity.Employee;

@SpringBootApplication
public class StudentEmployeeManagementApplication implements CommandLineRunner {

	
	@Autowired
		EmployeeRepository emprepo;
	public static void main(String[] args) {
		SpringApplication.run(StudentEmployeeManagementApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Employee  emp1 = new Employee();
		emp1.setName("sheetal");
		emp1.setSalary(58000);
		
		Employee emp2 = new Employee();
		emp2.setName("shiva");
		emp2.setSalary(90000);
		
		
		
		Employee emp3 = new Employee();
		emp3.setName("shruti");
		emp3.setSalary(70000);
		
		List<Employee> allemployeelist = Arrays.asList(emp1,emp2,emp3);
		
		emprepo.saveAll(allemployeelist);
		
//		Employee employee=emprepo.findById(2).get();
//		
//		employee.setName("shakti");
//		employee.setSalary(80000);
//		
//		emprepo.save(employee);
//		System.out.println("Upadted");
		
		Employee employee = emprepo.findById(3).get();
		
		emprepo.delete(employee);
		System.out.println("deleted!");
		
		
		
		
	}

}
