package org.akhilesh.studenthibernateapp.dto;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
@Entity
@Table(name="DEPARTMENT")
public class Department {

	/**	 CREATE TABLE DEPARTMENT (
			 Dname VarChar2(20)
			 ,Dnumber NUMBER(10)
			 ,Mgr_ssn NUMBER(10)
			 ,Mgr_start_date DATE
			 ,PRIMARY KEY(Dnumber)
			 );
	 **/

	// Members
	@Id
	private String DeptName;
	private String DeptNumber;
	@Transient
	private String DeptNameNum;
	
	private int MgrSSN;
	private Date MgrStartDate;

	//getters and setters

	public String getDeptName() {
		return DeptName;
	}

	public void setDeptName(String deptName) {
		DeptName = deptName;
	}
	public String getDeptNumber() {
		return DeptNumber;
	}
	public void setDeptNumber(String deptNumber) {
		DeptNumber = deptNumber;
	}
	public int getMgrSSN() {
		return MgrSSN;
	}
	public void setMgrSSN(int mgrSSN) {
		MgrSSN = mgrSSN;
	}
	public Date getMgrStartDate() {
		return MgrStartDate;
	}
	public void setMgrStartDate(Date mgrStartDate) {
		MgrStartDate = mgrStartDate;
	}
	
	public String getDeptNameNum() {
		return DeptName+DeptNumber;
	}

}
