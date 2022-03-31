package com.lti.app.scholarshipbackend.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Payment")
public class Payment {
	

	@Id
	@Column(name="Payment_Id")
	private int payid;
	@Column(name="Student_FId")
	private int sid;
	
	
	public int getPayid() {
		return payid;
	}


	public void setPayid(int payid) {
		this.payid = payid;
	}


	public int getSid() {
		return sid;
	}


	public void setSid(int sid) {
		this.sid = sid;
	}


	public Payment(int payid, int sid) {
		super();
		this.payid = payid;
		this.sid = sid;
	}


	public Payment() {
		super();
	}


	@Override
	public String toString() {
		return "Payment [payid=" + payid + ", sid=" + sid + "]";
	}
	
	
		
	}
	