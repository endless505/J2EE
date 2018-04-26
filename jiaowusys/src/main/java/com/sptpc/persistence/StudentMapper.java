package com.sptpc.persistence;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.sptpc.domain.Course;
import com.sptpc.domain.Student;

@Repository
public interface StudentMapper {
	public List<Student> getAllStudent();
	
	//插入学生信息
	public int insertStudent(Student student);
	//根据id找学生
	public Student findStudentByID(int id);
	//更新学生信息
	public int updateStudent(Student student);

	public int deleteStudent(String userID);
	//根据学生id删除学生选课信息
	public int deleteStudentCourseByID(int userID);
	//根据学生id删除学生信息
	public int deleteStudent(int userID);
	
}
