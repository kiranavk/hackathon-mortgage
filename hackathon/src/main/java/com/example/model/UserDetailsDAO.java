package com.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
//@Table(name="userdetails",schema="solatech")
@Table(name="userdetails")
public class UserDetailsDAO {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="userid")
	int userid;
	
	@Column(name="fname")
	String fname;
	
	@Column(name="lname")
	String lname;
	
	@Column(name="emailid")
	String emailid;
	
	@Column(name="mobile")
	String mobile;
	
	@Column(name="modeofemp")
	String modeofemp;
	
	@Column(name="company")
	String company;
	
	@Column(name="salary")
	int salary;
	
	@Column(name="tproperty")
	String typeofproperty;
	
	@Column(name="plocation")
	String plocation;
	
	@Column(name="pname")
	String pname;
	
	@Column(name="pvalue")
	int pvalue;
	
	@Column(name="loanamout")
	int loanamount;
	
	@Column(name="deposit")
	int deposit;
	/**
	 * @return the userid
	 */
	public int getUserid() {
		return userid;
	}
	/**
	 * @param userid the userid to set
	 */
	public void setUserid(int userid) {
		this.userid = userid;
	}
	/**
	 * @return the fname
	 */
	public String getFname() {
		return fname;
	}
	/**
	 * @param fname the fname to set
	 */
	public void setFname(String fname) {
		this.fname = fname;
	}
	/**
	 * @return the lname
	 */
	public String getLname() {
		return lname;
	}
	/**
	 * @param lname the lname to set
	 */
	public void setLname(String lname) {
		this.lname = lname;
	}
	/**
	 * @return the emailid
	 */
	public String getEmailid() {
		return emailid;
	}
	/**
	 * @param emailid the emailid to set
	 */
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	/**
	 * @return the mobile
	 */
	public String getMobile() {
		return mobile;
	}
	/**
	 * @param mobile the mobile to set
	 */
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	/**
	 * @return the modeofemp
	 */
	public String getModeofemp() {
		return modeofemp;
	}
	/**
	 * @param modeofemp the modeofemp to set
	 */
	public void setModeofemp(String modeofemp) {
		this.modeofemp = modeofemp;
	}
	/**
	 * @return the company
	 */
	public String getCompany() {
		return company;
	}
	/**
	 * @param company the company to set
	 */
	public void setCompany(String company) {
		this.company = company;
	}
	/**
	 * @return the salary
	 */
	public int getSalary() {
		return salary;
	}
	/**
	 * @param salary the salary to set
	 */
	public void setSalary(int salary) {
		this.salary = salary;
	}
	/**
	 * @return the typeofproperty
	 */
	public String getTypeofproperty() {
		return typeofproperty;
	}
	/**
	 * @param typeofproperty the typeofproperty to set
	 */
	public void setTypeofproperty(String typeofproperty) {
		this.typeofproperty = typeofproperty;
	}
	/**
	 * @return the plocation
	 */
	public String getPlocation() {
		return plocation;
	}
	/**
	 * @param plocation the plocation to set
	 */
	public void setPlocation(String plocation) {
		this.plocation = plocation;
	}
	/**
	 * @return the pname
	 */
	public String getPname() {
		return pname;
	}
	/**
	 * @param pname the pname to set
	 */
	public void setPname(String pname) {
		this.pname = pname;
	}
	/**
	 * @return the pvalue
	 */
	public int getPvalue() {
		return pvalue;
	}
	/**
	 * @param pvalue the pvalue to set
	 */
	public void setPvalue(int pvalue) {
		this.pvalue = pvalue;
	}
	/**
	 * @return the loanamount
	 */
	public int getLoanamount() {
		return loanamount;
	}
	/**
	 * @param loanamount the loanamount to set
	 */
	public void setLoanamount(int loanamount) {
		this.loanamount = loanamount;
	}
	/**
	 * @return the deposit
	 */
	public int getDeposit() {
		return deposit;
	}
	/**
	 * @param deposit the deposit to set
	 */
	public void setDeposit(int deposit) {
		this.deposit = deposit;
	}

}
