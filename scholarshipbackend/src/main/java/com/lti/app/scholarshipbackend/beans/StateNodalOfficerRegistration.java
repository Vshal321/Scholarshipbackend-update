package com.lti.app.scholarshipbackend.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "StateOfficerRegisteration")
public class StateNodalOfficerRegistration {

	@Id
	@Column(name = "Officer_Id")
	private int offid;
	@Column(name = "Name")
	private String name;
	@Column(name = "Password")
	private int pass;
	public int getOffid() {
		return offid;
	}
	public void setOffid(int offid) {
		this.offid = offid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPass() {
		return pass;
	}
	public void setPass(int pass) {
		this.pass = pass;
	}
	public StateNodalOfficerRegistration(int offid, String name, int pass) {
		super();
		this.offid = offid;
		this.name = name;
		this.pass = pass;
	}
	public StateNodalOfficerRegistration() {
		super();
	}
	@Override
	public String toString() {
		return "StateNodalOfficerRegistration [offid=" + offid + ", name=" + name + ", pass=" + pass + "]";
	}
	

	
}
