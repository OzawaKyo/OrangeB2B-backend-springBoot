package com.tripleD.app.entity;

import javax.persistence.*;

/**
 *
 * @author CHICHI Hamza
 *
 */
@Entity
@Table(name = "role")
public class Role {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String role;

	@Override
	public String toString() {
		StringBuilder student = new StringBuilder("{role : ");
		return student.append(this.role).append(" }").toString();
	}

	public Role() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Role(String role) {
		this.role = role;
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
}
