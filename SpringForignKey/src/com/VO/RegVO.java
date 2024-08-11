
package com.VO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity   //to know for hibernate file 
@Table(name="registerFK")
public class RegVO {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="RegId")
	private int id;
	
	@Column(name="firstName")
	private String firstName;
	
	@Column(name="lastName")
	private String lastName;
	
	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public LoginVO getLoginVO() {
		return loginVO;
	}


	public void setLoginVO(LoginVO loginVO) {
		this.loginVO = loginVO;
	}


	public void setId(int id) {
		this.id = id;
	}

	@ManyToOne
	@JoinColumn(name="fk_login")
	private LoginVO loginVO;
	

	public int getId() {
		return id;
	}


	
}


