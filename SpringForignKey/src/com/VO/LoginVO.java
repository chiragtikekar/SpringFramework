package com.VO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity   //to know for hibernate file 
@Table(name="loginFK")
public class LoginVO {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="RegId")
	private int id;
	
	@Column(name="Username")
	private String username;
	
	@Column(name="Password")
	private String password;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


}
