package com.khamlesh.student_api.dto;

public class StudentResponseDTO {

	private Integer id;
	private String name;
	private String branch;
	private String email;

	public StudentResponseDTO(Integer id, String name, String branch, String email) {
		this.id = id;
		this.name = name;
		this.branch = branch;
		this.email = email;
	}

	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getBranch() {
		return branch;
	}

	public String getEmail() {
		return email;
	}

}
