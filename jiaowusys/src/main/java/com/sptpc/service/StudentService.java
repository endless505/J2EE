package com.sptpc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sptpc.domain.Course;
import com.sptpc.domain.Student;
import com.sptpc.persistence.StudentMapper;

@Service
public class StudentService {
	@Autowired
	private StudentMapper studentMapper;
	
	//得到所有的学生信息
	public List<Student> getAllStudent(){		
		return studentMapper.getAllStudent();
	}
	//插入学生信息
	public int saveSutdent(Student sutdent) {
		return studentMapper.insertStudent(sutdent);
	}
	//根据学生id得到学生信息
	public Student getStudentByID(String id) {
		return studentMapper.findStudentByID(Integer.parseInt(id));
	}
	//更新学生信息
	public int updateStudent(Student student) {
		// TODO Auto-generated method stub
		return studentMapper.updateStudent(student);
	}
	
	//根据学生id删除学生
	public int deleteStudentByID(String userID) {
		// TODO Auto-generated method stub
		int n = studentMapper.deleteStudentCourseByID(Integer.parseInt(userID));
		return studentMapper.deleteStudent(Integer.parseInt(userID));
		
	}
}
