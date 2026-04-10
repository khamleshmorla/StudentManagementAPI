package com.khamlesh.student_api.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.khamlesh.student_api.dto.StudentRequestDTO;
import com.khamlesh.student_api.dto.StudentResponseDTO;
import com.khamlesh.student_api.entity.Student;
import com.khamlesh.student_api.service.StudentService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/students")
public class StudentController {

	private final StudentService service;

	public StudentController(StudentService service) {
		this.service = service;
	}

	@PostMapping
	public StudentResponseDTO createStudent(@Valid @RequestBody StudentRequestDTO s) {
		return service.saveStudent(s);
	}

	@PutMapping("{id}")
	public StudentResponseDTO updateStudent(@Valid @PathVariable Integer id, @RequestBody StudentRequestDTO s) {
		return service.updateStudent(id, s);
	}

	@GetMapping
	public List<StudentResponseDTO> getAllStudents() {
		return service.getAllStudents();
	}

	@GetMapping("/{id}")
	public StudentResponseDTO getStudent(@PathVariable Integer id) {

		return service.getStudent(id);

	}

	@DeleteMapping("/{id}")
	public void deleteStudent(@PathVariable Integer id) {
		service.deleteStudent(id);
	}
}
