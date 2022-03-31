package com.lti.app.scholarshipbackend.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name="StudentRegistration")
public class StudentRegistration {

	@Id
	@Column(name="STUDENT_ID")
	private int id;
	@Column(name ="STATE")
	private String state;
	@Column(name ="NAME")
	private String name;
	@Column(name ="GENDER")
	private String gender;
	@Column(name ="MOBILE_NO")
	private int mno;
	@Column(name ="Email_Id")
	private String emailid;
	@Column(name ="INSTITUDE_CODE")
	private int icode;
	@Column(name="COURSE")
	private String crse;
	@Column(name ="AADHAR_NO")
	private int adharno;
	@Column(name ="PASSWORD")
	private String pass;
	@Column(name ="CONFIRM_PASSWORD")
	private String cpass;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getMno() {
		return mno;
	}
	public void setMno(int mno) {
		this.mno = mno;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public int getIcode() {
		return icode;
	}
	public void setIcode(int icode) {
		this.icode = icode;
	}
	public String getCrse() {
		return crse;
	}
	public void setCrse(String crse) {
		this.crse = crse;
	}
	public int getAdharno() {
		return adharno;
	}
	public void setAdharno(int adharno) {
		this.adharno = adharno;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getCpass() {
		return cpass;
	}
	public void setCpass(String cpass) {
		this.cpass = cpass;
	}
	public StudentRegistration(int id, String state, String name, String gender, int mno, String emailid, int icode,
			String crse, int adharno, String pass, String cpass) {
		super();
		this.id = id;
		this.state = state;
		this.name = name;
		this.gender = gender;
		this.mno = mno;
		this.emailid = emailid;
		this.icode = icode;
		this.crse = crse;
		this.adharno = adharno;
		this.pass = pass;
		this.cpass = cpass;
	}
	public StudentRegistration() {
		super();
	}
	@Override
	public String toString() {
		return "StudentRegistration [id=" + id + ", state=" + state + ", name=" + name + ", gender=" + gender + ", mno="
				+ mno + ", emailid=" + emailid + ", icode=" + icode + ", crse=" + crse + ", adharno=" + adharno
				+ ", pass=" + pass + ", cpass=" + cpass + "]";
	}
	
	
	
	}