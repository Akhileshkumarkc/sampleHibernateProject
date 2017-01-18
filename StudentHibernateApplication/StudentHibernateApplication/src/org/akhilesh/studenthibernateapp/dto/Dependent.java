package org.akhilesh.studenthibernateapp.dto;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;
@Entity
@Table(name="DEPENDENT")
public class Dependent {

	/**
	 * 	
			CREATE TABLE DEPENDENT (
			ESSN NUMBER(10)
			,DEPENDENT_NAME VARCHAR2(20)
			,SEX CHAR(1)
			,BDATE DATE
			,RELATIONSHIP VARCHAR(20) 
			,PRIMARY KEY(ESSN,DEPENDENT_NAME)
			);  

	 */
	
	//getters and setters
	
	private int number;
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getDependentName() {
		return dependentName;
	}
	public void setDependentName(String dependentName) {
		this.dependentName = dependentName;
	}
	public char getSex() {
		return sex;
	}
	public void setSex(char sex) {
		this.sex = sex;
	}
	public Date getbDate() {
		return bDate;
	}
	public void setbDate(Date bDate) {
		this.bDate = bDate;
	}
	public String getRelationship() {
		return Relationship;
	}
	public void setRelationship(String relationship) {
		Relationship = relationship;
	}
	private String dependentName;
	private char sex;
	private Date bDate;
	private String Relationship;
	
	
}
