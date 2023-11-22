package com.example.StudentDetailsController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.StudentDetailsModel.Students;
import com.example.StudentDetailsService.StudentService;

@RestController
@RequestMapping("/studentdetails")
public class StudentController {
	
	@Autowired
	private StudentService stService;
	
	@PostMapping("/addStudents")
	public Students addStudents(@RequestBody Students students)
	{	
		return stService.addStudents(students);
	}
	@GetMapping("/getStudents")
	public List<Students> getAllStudents()  
	{
		return stService.getStudents();
	}
	@PutMapping("/updateStudents")
	public Students updateStudent(@PathVariable int id, @RequestBody Students updatedStudent) {
        if (stService.getStudentByid(id).isPresent()) {
            updatedStudent.setId(id);
            return stService.addStudents(updatedStudent);
        } else {
            return null;
        }
    }
	
	@DeleteMapping("/deleteStudents")
	public void deleteStudent(@PathVariable int id) {
        stService.deleteStudent(id);
    }
	
	
	
}
