package com.belky.workshopmongo.domain;

import java.io.Serializable;
import java.util.Objects;

public class User implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String id;
	private String name;
	private String smail;
	
	public User() {
	}

	public User(String id, String name, String smail) {
		super();
		this.id = id;
		this.name = name;
		this.smail = smail;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSmail() {
		return smail;
	}

	public void setSmail(String smail) {
		this.smail = smail;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(id, other.id);
	}
	
	
}
