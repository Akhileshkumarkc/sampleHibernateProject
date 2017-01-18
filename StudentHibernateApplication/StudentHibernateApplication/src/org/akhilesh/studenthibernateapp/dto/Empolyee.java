package org.akhilesh.studenthibernateapp.dto;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.Table;

import oracle.sql.CHAR;
@Entity
@Table(name="Empolyee")
public class Empolyee {
	/**
	 * CREATE TABLE EMPLOYEE (
			 Fname VARCHAR2(20)
			,minit VARCHAR2(20)
			,Lname VARCHAR2(20)
			,SSN NUMBER(10)
			,BDATE DATE 
			,ADDRESS VARCHAR2(200)
			,SEX CHAR(1)
			,SALARY FLOAT(10) 
			,SUPER_SSN NUMBER(10)
			,Dno NUMBER(10)
			,PRIMARY KEY (SSN)
			) ;
	
	 */
	
	// Members
	
	String Fname;
	String Minit;
	String Lname;
	int SSN;
	Date BDate;
	@Lob
	String Address;
	//blob,clob
	char Sex;
	float Salary;
	int superSSN;
	int Dno;
	
	

	//getters and setters
	public String getFname() {
		return Fname;
	}
	public void setFname(String fname) {
		Fname = fname;
	}
	public String getMinit() {
		return Minit;
	}
	public void setMinit(String minit) {
		Minit = minit;
	}
	public String getLname() {
		return Lname;
	}
	public void setLname(String lname) {
		Lname = lname;
	}
	public int getSSN() {
		return SSN;
	}
	public void setSSN(int sSN) {
		SSN = sSN;
	}
	public Date getBDate() {
		return BDate;
	}
	public void setBDate(Date bDate) {
		BDate = bDate;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public char getSex() {
		return Sex;
	}
	public void setSex(char sex) {
		Sex = sex;
	}
	public float getSalary() {
		return Salary;
	}
	public void setSalary(float salary) {
		Salary = salary;
	}
	public int getSuperSSN() {
		return superSSN;
	}
	public void setSuperSSN(int superSSN) {
		this.superSSN = superSSN;
	}
	public int getDno() {
		return Dno;
	}
	public void setDno(int dno) {
		Dno = dno;
	}
	
}
