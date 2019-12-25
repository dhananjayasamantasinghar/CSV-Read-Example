package com.comparator.domain;

public class Account {
	private String accNo;
	private String sor;
	
	
	
	
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Account(String accNo, String sor) {
		super();
		this.accNo = accNo;
		this.sor = sor;
	}
	public String getAccNo() {
		return accNo;
	}
	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}
	public String getSor() {
		return sor;
	}
	public void setSor(String sor) {
		this.sor = sor;
	}
	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", sor=" + sor + "]";
	}
	
	
	
	
}
