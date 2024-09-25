package com.excelr.cms.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customer {
	    
	    @Id
		private int cno;
		private String username;
		private String password;
		private int age;
		
		public Customer() {}
		public Customer(int cno, String username, String password, int age) {
			this.cno = cno;
			this.username = username;
			this.password = password;
			this.age = age;
		}
		public int getCno() {
			return cno;
		}
		public void setCno(int cno) {
			this.cno = cno;
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
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		@Override
		public String toString() {
			return "Customer [cno=" + cno + ", username=" + username + ", password=" + password + ", age=" + age + "]";
		}
		
		
		
		
}
