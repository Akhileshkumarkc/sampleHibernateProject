package org.akhilesh.studenthibernateapp.dto;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="DepLocation")
public class DeptLocations {
	/**
	 * CREATE TABLE DEPT_LOCATIONS (
	 	Dnumber NUMBER(10)
		,Dlocation VARCHAR2(20)
		,PRIMARY KEY (Dnumber,Dlocation)
	);
	 */
	
	
	private int Dnumber;
	private int Dlocation;
	
	//getters and setters
	
	public int getDnumber() {
		return Dnumber;
	}
	public void setDnumber(int dnumber) {
		Dnumber = dnumber;
	}
	public int getDlocation() {
		return Dlocation;
	}
	public void setDlocation(int dlocation) {
		Dlocation = dlocation;
	}
	

}
