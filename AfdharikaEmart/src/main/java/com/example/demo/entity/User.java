package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="elmart_user")
public class User 
{	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="eluser_id")
	private int eluser_id;
	@Column(name="first_name")
	private String first_name;
	@Column(name="last_name")
	private String last_name;
	@Column(name="eluser_name")
	private String eluser_name;
	@Column(name="eluser_password")
	private String eluser_password;
	@Column(name="eluser_address1")
	private String eluser_address1;
	@Column(name="eluser_address2")
	private String eluser_address2;
	
	public User()
	{
		
	}

	public User(int eluser_id, String first_name, String last_name, String eluser_name, String eluser_password,
			String eluser_address1, String eluser_address2) {
		super();
		this.eluser_id = eluser_id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.eluser_name = eluser_name;
		this.eluser_password = eluser_password;
		this.eluser_address1 = eluser_address1;
		this.eluser_address2 = eluser_address2;
	}

	public int getEluser_id() {
		return eluser_id;
	}

	public void setEluser_id(int eluser_id) {
		this.eluser_id = eluser_id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getEluser_name() {
		return eluser_name;
	}

	public void setEluser_name(String eluser_name) {
		this.eluser_name = eluser_name;
	}

	public String getEluser_password() {
		return eluser_password;
	}

	public void setEluser_password(String eluser_password) {
		this.eluser_password = eluser_password;
	}

	public String getEluser_address1() {
		return eluser_address1;
	}

	public void setElsuer_address1(String eluser_address1) {
		this.eluser_address1 = eluser_address1;
	}

	public String getEluser_address2() {
		return eluser_address2;
	}

	public void setEluser_address2(String eluser_address2) {
		this.eluser_address2 = eluser_address2;
	}
	
	
}
