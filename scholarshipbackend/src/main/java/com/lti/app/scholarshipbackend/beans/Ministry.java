package com.lti.app.scholarshipbackend.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="MINISTRY")
public class Ministry {
	@Id
	@Column(name="MINISTRY_FID")
     private int ministryid;
	@Column(name="STUDENT_FID")
     private int studId;
	@Column(name="INSTITUTE_FID")
     private int instid;
	@Column(name="APPLICATION_FID")
     private int aid;
	public int getMinistryid() {
		return ministryid;
	}
	public void setMinistryid(int ministryid) {
		this.ministryid = ministryid;
	}
	public int getStudId() {
		return studId;
	}
	public void setStudId(int studId) {
		this.studId = studId;
	}
	public int getInstid() {
		return instid;
	}
	public void setInstid(int instid) {
		this.instid = instid;
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public Ministry(int ministryid, int studId, int instid, int aid) {
		super();
		this.ministryid = ministryid;
		this.studId = studId;
		this.instid = instid;
		this.aid = aid;
	}
	public Ministry() {
		super();
	}
	@Override
	public String toString() {
		return "Ministry [ministryid=" + ministryid + ", studId=" + studId + ", instid=" + instid + ", aid=" + aid
				+ "]";
	}



	
}
