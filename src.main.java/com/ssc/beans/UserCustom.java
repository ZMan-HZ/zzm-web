package com.ssc.beans;

import java.io.Serializable;

public class UserCustom  extends User  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String password;

	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
