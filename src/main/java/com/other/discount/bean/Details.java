package com.other.discount.bean;

import java.util.Date;

public class Details {
	
	//商户编号，别名buinessId bid
	private String customerNo;
	//消费金额
	private Double cost;
	//消费时间
	private String costDate;
	
	public Details(String customerNo, String posSn, Double cost, String costDate) {
		super();
		this.customerNo = customerNo;
		this.cost = cost;
		this.costDate = costDate;
	}

	public String getCustomerNo() {
		return customerNo;
	}

	public void setCustomerNo(String customerNo) {
		this.customerNo = customerNo;
	}

	public Double getCost() {
		return cost;
	}

	public void setCost(Double cost) {
		this.cost = cost;
	}

	public String getCostDate() {
		return costDate;
	}

	public void setCostDate(String costDate) {
		this.costDate = costDate;
	}
	
	
}
