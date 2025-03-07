package com.loginreg.entity;

import jakarta.persistence.*;

@Entity
public class User {
	@Id
	private String email;
	
	private String name;
	
	private String password;
		public User() {
			
		}

		
		public User(String email, String name, String password) {
			super();
			this.email = email;
			this.name = name;
			this.password = password;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

	
}
