package com.karthi.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.karthi.model.Student;
import com.karthi.service.StudentService;

@RestController
@RequestMapping("/api/students")
public class StudentController {

@Autowired
StudentService studentService;

@GetMapping("/all")
public List<Student> getAllStudents()
{
	return studentService.getAllStudents();
	
}
	
@PostMapping("/{id}")
public Optional<Student> getStudentById(@PathVariable Long id)
{
	return studentService.getStudentById(id);
}

@PutMapping("/save")
public Student saveOrUpdateStudent(@RequestBody Student student)
{
	return studentService.saveOrUpdateStudent(student);
}

@DeleteMapping("/{id}")
public void deleteStudent(@PathVariable Long id)
{
	studentService.deleteStudent(id);
}
}
