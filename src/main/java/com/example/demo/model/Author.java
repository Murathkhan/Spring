package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Author {
	@Id
	private String authId;
	private String authName;
	private String authGenre;
	public String getAuthId() {
		return authId;
	}
	public void setAuthId(String authId) {
		this.authId = authId;
	}
	public String getAuthName() {
		return authName;
	}
	public void setAuthName(String authName) {
		this.authName = authName;
	}
	public String getAuthGenre() {
		return authGenre;
	}
	public void setAuthGenre(String authGenre) {
		this.authGenre = authGenre;
	}
	@Override
	public String toString() {
		return "Author [authId=" + authId + ", authName=" + authName + ", authGenre=" + authGenre + "]";
	}
	
	

}
