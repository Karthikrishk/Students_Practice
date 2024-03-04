/**
 * 
 */
package com.karthi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.karthi.model.Student;
import com.karthi.repository.StudentRepository;

/**
 * @author Karthik
 *
 */
@Service
public class StudentService {

@Autowired
private StudentRepository studentRepo; 

public List<Student> getAllStudents()
{
	return studentRepo.findAll();
}

public Optional<Student> getStudentById(Long id)
{
	return studentRepo.findById(id);
}

//
public Student saveOrUpdateStudent(Student student)
{
	return studentRepo.save(student);
}

public void deleteStudent(Long id)
{
	studentRepo.deleteById(id);
}
}
