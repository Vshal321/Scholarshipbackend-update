package com.lti.app.scholarshipbackend.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="STATE_OFFICER")
public class StateNodalOfficer {
	
	@Id
	@Column(name="Officer_Id")
	private int offid;
	@Column(name="Student_Id")
	private int stdid;
	@Column(name="Institute_Id")
	private int instid;
	@Column(name="Application_Id")
	private int aid;
	public int getOffid() {
		return offid;
	}
	public void setOffid(int offid) {
		this.offid = offid;
	}
	public int getStdid() {
		return stdid;
	}
	public void setStdid(int stdid) {
		this.stdid = stdid;
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
	public StateNodalOfficer(int offid, int stdid, int instid, int aid) {
		super();
		this.offid = offid;
		this.stdid = stdid;
		this.instid = instid;
		this.aid = aid;
	}
	public StateNodalOfficer() {
		super();
	}
	@Override
	public String toString() {
		return "StateNodalOfficer [offid=" + offid + ", stdid=" + stdid + ", instid=" + instid + ", aid=" + aid + "]";
	}
	
	
	
	
	
}
