package com.ananta.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="google_table")
public class GoogleDTO {

	@Id
	@Column(name="p_id")
	private int pid;
	
	@Column(name="p_name")
	private String pname;
	
	@Column(name="users")
	private int users;

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public int getUsers() {
		return users;
	}

	public void setUsers(int users) {
		this.users = users;
	}
	
	public void getState(){
		System.out.println("The product id is :"+getPid()+" product name is : "+getPname()+" number of users :"+getUsers());
	}
	
	

}
