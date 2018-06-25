package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class SpringBootExample  {

	public static void main(String[] args) {
		
		SpringApplication.run(SpringBootExample.class, args);  

	}
	
	/*@Bean
	
	CommandLineRunner runner(EmployeeRepository repository){
		
		return args ->{
			
			repository.save(new Employee("nagendra", "IT"));
		};
	}*/
}
