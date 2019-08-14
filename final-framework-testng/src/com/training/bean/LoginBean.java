package com.training.bean;

public class LoginBean {
	private String userName;
	private String password;
	private String firstname;
    private String lastname;
	public LoginBean() {
	}

	public LoginBean(String userName, String password, String firstname, String lastname) {
		super();
		this.userName = userName;
		this.password = password;
		this.firstname = firstname;
		this.lastname = lastname;
	}
    
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	public String getfirstname() {
		return firstname;
	}
	public void setfirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getlastname() {
		return lastname;
	}
	public void setlastname(String lastname) {
		this.lastname = lastname;
	}
	

	@Override
	public String toString() {
		return "LoginBean [userName=" + userName + ", password=" + password + ", firstname = "+firstname+", lastname= "+lastname+"]";
	}

}
