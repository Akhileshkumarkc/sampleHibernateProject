package org.akhilesh.studenthibernateapp.dto;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="DEPPROJ")
public class DepProject {
	/**
	 * 	
			CREATE TABLE DEPPROJECT (
			pname VARCHAR2(20)
			,pnumber NUMBER(10)
			,plocation VARCHAR2(20)
			,Dnum NUMBER(10)
			,PRIMARY KEY (pnumber)
			);
			
	 */
	//getters and setters.
	
     String pName;
     public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public int getpNumber() {
		return pNumber;
	}
	public void setpNumber(int pNumber) {
		this.pNumber = pNumber;
	}
	public String getpLocation() {
		return pLocation;
	}
	public void setpLocation(String pLocation) {
		this.pLocation = pLocation;
	}
	public int getDnum() {
		return Dnum;
	}
	public void setDnum(int dnum) {
		Dnum = dnum;
	}
	int  pNumber;
     String pLocation;
     int Dnum;
     

}
