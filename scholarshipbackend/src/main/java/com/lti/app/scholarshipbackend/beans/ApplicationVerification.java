package com.lti.app.scholarshipbackend.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Application_Verification")
public class ApplicationVerification {

	@Id
	@Column(name="COURSE")
	private String crse;
	@Column(name="Institude_FName")
	private String iname;
	@Column(name="Student_FId")
	private int sid;
	public String getCrse() {
		return crse;
	}
	public void setCrse(String crse) {
		this.crse = crse;
	}
	public String getIname() {
		return iname;
	}
	public void setIname(String iname) {
		this.iname = iname;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public ApplicationVerification(String crse, String iname, int sid) {
		super();
		this.crse = crse;
		this.iname = iname;
		this.sid = sid;
	}
	public ApplicationVerification() {
		super();
	}
	@Override
	public String toString() {
		return "ApplicationVerification [crse=" + crse + ", iname=" + iname + ", sid=" + sid + "]";
	}
	




}
