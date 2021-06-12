package com.example.demo;

import java.util.Date;

public class Customers {
	
	private String customerId;
	private String productName;
	private	String domain;
	private	Date startDate;
	private	String durationMonths;
	private	String emailDate;
	
	
	public Customers() {
		super();
	}
	
	public Customers(String customerId, String productName, String domain, Date startDate, String durationMonths,
			String emailDate) {
		super();
		this.customerId = customerId;
		this.productName = productName;
		this.domain = domain;
		this.startDate = startDate;
		this.durationMonths = durationMonths;
		this.emailDate = emailDate;
	}
	
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getDomain() {
		return domain;
	}
	public void setDomain(String domain) {
		this.domain = domain;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public String getDurationMonths() {
		return durationMonths;
	}
	public void setDurationMonths(String durationMonths) {
		this.durationMonths = durationMonths;
	}
	public String getEmailDate() {
		return emailDate;
	}
	public void setEmailDate(String emailDate) {
		this.emailDate = emailDate;
	}
}
