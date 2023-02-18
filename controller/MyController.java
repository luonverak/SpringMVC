package com.example.demo.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;
@Controller
public class MyController {
	
	private StudentService studentService;

	public MyController(StudentService studentService) {
		super();
		this.studentService = studentService;
	}
	
	@GetMapping("/students")
	public String listStudent(Model model) {
		model.addAttribute("students", studentService.getAllStudent());
		return "students";
	}
	@GetMapping("/students/new")
	public String createStudentForm(Model model) {
		
		Student student=new Student();
		model.addAttribute("student", student);
		return "create_student";
	}
	@PostMapping("/students")
	public String saveStudent(@ModelAttribute ("students") Student student) {
		studentService.saveStudent(student);
		return "redirect:/students";	
	}
	@GetMapping("/students/edit/{id}")
	public String editStudentForm(@PathVariable Long id,Model model) {
		model.addAttribute("student", studentService.getStudentById(id));
		return "edit_student";
	}
	@PostMapping("/students/{id}")
	public String updateStudentForm(@PathVariable Long id,@ModelAttribute ("students") Student student,Model model)
	{
		Student stu=studentService.getStudentById(id);
		stu.setId(id);
		stu.setFirstname(student.getFirstname());
		stu.setLastname(student.getLastname());
		stu.setEmail(student.getEmail());
		stu.setScore(student.getScore());
		studentService.updateStudent(stu);
		return "redirect:/students";
	}
	@GetMapping("students/{id}")
	public String deleteStudent(@PathVariable Long id) {
		studentService.deteletById(id);
		return "redirect:/students";
	}
}
