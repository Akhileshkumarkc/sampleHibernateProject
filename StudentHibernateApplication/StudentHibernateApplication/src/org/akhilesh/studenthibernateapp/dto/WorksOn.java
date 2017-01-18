package org.akhilesh.studenthibernateapp.dto;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="WorksOn")
public class WorksOn {
	/**
	CREATE TABLE WORKS_ON (
			ESSN NUMBER(10)
			,Pno NUMBER(10)
			,Hours NUMBER(10)
			,PRIMARY KEY (ESSN,Pno)
			);
**/
	
	//getters and setters
	
	String ESSN;
	int number;
	int pno;
	int hours;
	public String getESSN() {
		return ESSN;
	}
	public void setESSN(String eSSN) {
		ESSN = eSSN;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public int getPno() {
		return pno;
	}
	public void setPno(int pno) {
		this.pno = pno;
	}
	public int getHours() {
		return hours;
	}
	public void setHours(int hours) {
		this.hours = hours;
	}
	
}
