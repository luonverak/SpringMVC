package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;

@SpringBootApplication
public class Mvc111Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Mvc111Application.class, args);
	}

	@Autowired
	private StudentRepository repository;
	
	@Override
	public void run(String... args) throws Exception {
//		Student stu1=new Student(1, "Luon", "Verak", "M", 90);
//		repository.save(stu1);
//		Student stu2=new Student(2, "Heng", "Vitu", "M", 80);
//		repository.save(stu2);
//		Student stu3=new Student(3, "Sok", "Cheata", "F", 70);
//		repository.save(stu3);
	}

}
