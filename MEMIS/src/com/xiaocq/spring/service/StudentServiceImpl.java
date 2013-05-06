package com.xiaocq.spring.service;

import java.util.List;

import com.xiaocq.domain.Student;
import com.xiaocq.mybatis.mapper.StudentMapper;

public class StudentServiceImpl implements StudentService{
	private StudentMapper studentDao;
	
	public StudentMapper getStudentDao() {
		return studentDao;
	}

	public void setStudentDao(StudentMapper studentDao) {
		this.studentDao = studentDao;
	}

	@Override
	public Student getStudentById(int id) {
		return studentDao.getStudentById(id);
	}

	@Override
	public List<Student> getStudentsByDetail(Student student) {
		return studentDao.getStudentsByDetail(student);
	}

	@Override
	public void updateStudent(Student student) {
		studentDao.updateStudent(student);
	}

	@Override
	public void deleteStudent(int id) {
		studentDao.deleteStudent(id);
	}

	@Override
	public void addStudent(Student student) {
		studentDao.addStudent(student);
	}

	@Override
	public void addStudents(List<Student> students) {
		studentDao.addStudents(students);
	}

	@Override
	public void updatePersonalResumePath(Student student) {
		studentDao.updatePersonalResumePath(student);
	}

}
