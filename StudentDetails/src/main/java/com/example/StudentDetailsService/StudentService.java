package com.example.StudentDetailsService;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.StudentDetailsModel.Students;
import com.example.StudentDetailsRepository.StudentRepository;

@Service
public class StudentService {
	@Autowired
	StudentRepository stRepo;
	public Students addStudents(Students students) {
		
		return stRepo.save(students);
	}
	public List<Students> getStudents() {

		return (List<Students>) stRepo.findAll();
	}
	 public Optional<Students> getStudentByid(int id) {
	        return stRepo.findById(id);
	 }
	 public void deleteStudent(int id) {
	        stRepo.deleteById(id);
	    }
}
