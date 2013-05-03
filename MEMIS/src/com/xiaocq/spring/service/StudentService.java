package com.xiaocq.spring.service;

import java.util.List;

import com.xiaocq.domain.Student;

public interface StudentService {
	public Student getStudentById(int id);
	
	public List<Student> getStudentsByDetail(Student student);
	
	public void updateStudent(Student student);
	
	public void deleteStudent(int id);
	
	public void addStudent(Student studnet);
	
	public void addStudents(List<Student> students);
	
	public void updatePersonalResumePath(Student student);
}
