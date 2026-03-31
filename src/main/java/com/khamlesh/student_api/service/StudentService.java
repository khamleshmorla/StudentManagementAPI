package com.khamlesh.student_api.service;

import org.springframework.stereotype.Service;
import com.khamlesh.student_api.entity.Student;
import com.khamlesh.student_api.repository.StudentRepository;
import com.khamlesh.student_api.StudentMapper;
import com.khamlesh.student_api.dto.StudentRequestDTO;
import com.khamlesh.student_api.dto.StudentResponseDTO;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class StudentService {

	private final StudentRepository repository;

	public StudentService(StudentRepository repository) {
		this.repository = repository;
	}

	public StudentResponseDTO saveStudent(StudentRequestDTO dto) {

		Student s = StudentMapper.toEntity(dto);

		Student saved = repository.save(s);

		return StudentMapper.toDTO(saved);

	}

	public StudentResponseDTO updateStudent(Integer id, StudentRequestDTO dto) {

		Student existing = repository.findById(id).orElseThrow(() -> new RuntimeException("Student not found !!"));

		existing.setName(dto.getName());
		existing.setBranch(dto.getBranch());
		existing.setEmail(dto.getEmail());
		existing.setPassword(dto.getPassword());

		Student saved = repository.save(existing);

		return StudentMapper.toDTO(saved);
	}

	public List<StudentResponseDTO> getAllStudents() {
		return repository.findAll().stream().map(StudentMapper::toDTO).collect(Collectors.toList());
	}

	public StudentResponseDTO getStudent(Integer id) {
		Student s = repository.findById(id).orElseThrow(() -> new RuntimeException("Student not Found !!"));

		return StudentMapper.toDTO(s);

	}

	public void deleteStudent(Integer id) {
		repository.deleteById(id);
	}
}