package com.ananta.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="student_table")

public class StudentDTO {
	
	@Id
	@Column(name="sid")
	private int sid;

	@Column(name="sname")
	private String sname;
	
	@Column(name="saddr")
	private String saddr;
	
	@Column(name="sbranch")
	private String sbranch;

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getSaddr() {
		return saddr;
	}

	public void setSaddr(String saddr) {
		this.saddr = saddr;
	}

	public String getSbranch() {
		return sbranch;
	}

	public void setSbranch(String sbranch) {
		this.sbranch = sbranch;
	}
    
	
	public boolean getState(){
		System.out.println("student name is: "+getSname()+"Student address is :"+getSaddr()) ;
		return true;
	}

}
