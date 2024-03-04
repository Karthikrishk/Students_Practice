/**
 * 
 */
package com.karthi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.karthi.model.Student;

/**
 * @author Karthik
 *
 */
public interface StudentRepository extends JpaRepository<Student, Long> {

	List<Student> findAllById(Long id);
	//<Student -  Class name, Long - primary id datatype>
	
	//List<Student> findAllStudents();

}
