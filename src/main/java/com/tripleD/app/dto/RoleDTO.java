package com.tripleD.app.dto;

import javax.validation.constraints.NotBlank;

/**
 *
 * @author CHICHI Hamza
 *
 */
public class RoleDTO {

	private Long id;
	@NotBlank
	private String role;

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("{ id: ").append(this.id).append(",\n  role: ").append(this.role)
				.append(" }");
		return sb.toString();
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRole() {
		return this.role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public RoleDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

}
