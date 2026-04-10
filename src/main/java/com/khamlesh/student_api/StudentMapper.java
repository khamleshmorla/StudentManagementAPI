package com.khamlesh.student_api;

import com.khamlesh.student_api.dto.StudentRequestDTO;
import com.khamlesh.student_api.dto.StudentResponseDTO;
import com.khamlesh.student_api.entity.Student;

public class StudentMapper {

	public static Student toEntity(StudentRequestDTO dto) {
		Student s = new Student();
		s.setName(dto.getName());
		s.setBranch(dto.getBranch());
		s.setEmail(dto.getEmail());
		s.setPassword(dto.getPassword());
		return s;
	}

	public static StudentResponseDTO toDTO(Student s) {
		return new StudentResponseDTO(s.getId(), s.getName(), s.getBranch(), s.getEmail());
	}

	public static void updateEntity(Student existing, StudentRequestDTO dto) {
		existing.setName(dto.getName());
		existing.setBranch(dto.getBranch());
		existing.setEmail(dto.getEmail());
		existing.setPassword(dto.getPassword());
	}
}
