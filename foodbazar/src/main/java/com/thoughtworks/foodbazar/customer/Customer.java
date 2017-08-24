package com.thoughtworks.foodbazar.customer;

import java.util.List;

public class Customer {
	private int customerId;
	private String customerName;
	private List<CustomerOrder> customerOrderList;
	
	public Customer(int customerId,String customerName,List customerOrderList)
	{
		this.customerId=customerId;
		this.customerName=customerName;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public List<CustomerOrder> getCustomerOrderList() {
		return customerOrderList;
	}
	public void setCustomerOrderList(List<CustomerOrder> customerOrderList) {
		this.customerOrderList = customerOrderList;
	}
	

}
