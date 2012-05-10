package com.hasitchanged.model;

import java.io.Serializable;

public class User implements Serializable{

	private static final long serialVersionUID = -5847658629067407298L;
	
	private String email;

	public User(String email) {
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
