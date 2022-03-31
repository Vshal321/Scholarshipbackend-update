package com.lti.app.scholarshipbackend.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Scholarship")
public class ScholarshipForm {

	@Id
	@Column(name = "Application_Id")
	private int aid;
	@Column(name = "Scheme")
	private String schm;
	@Column(name = "Annual_Income")
	private int aincm;
	@Column(name = "Institude_FName")
	private String iname;
	@Column(name = "StudentFId")
	private int sid;
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getSchm() {
		return schm;
	}
	public void setSchm(String schm) {
		this.schm = schm;
	}
	public int getAincm() {
		return aincm;
	}
	public void setAincm(int aincm) {
		this.aincm = aincm;
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
	public ScholarshipForm(int aid, String schm, int aincm, String iname, int sid) {
		super();
		this.aid = aid;
		this.schm = schm;
		this.aincm = aincm;
		this.iname = iname;
		this.sid = sid;
	}
	public ScholarshipForm() {
		super();
	}
	@Override
	public String toString() {
		return "ScholarshipForm [aid=" + aid + ", schm=" + schm + ", aincm=" + aincm + ", iname=" + iname + ", sid="
				+ sid + "]";
	}
	
	
	
}

	
