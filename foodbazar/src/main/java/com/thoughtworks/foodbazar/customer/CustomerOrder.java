package com.thoughtworks.foodbazar.customer;

import java.util.List;
import com.thoughtworks.foodbazar.fruit.Fruit;

import com.thoughtworks.foodbazar.item.LineItem;

public class CustomerOrder {
	private int orderId;
	private List<LineItem> lineItemList;
	private double orderPrice=0;
	
	public CustomerOrder(int orderId, List<LineItem> lineItemList) {
		this.orderId=orderId;
		this.lineItemList=lineItemList;
		
		//calculate the total customer order price
		calculateOrderPrice();
		//printCustomerOrderReceipt();


	}

	public void calculateOrderPrice()
	{
		for(LineItem lineItem:lineItemList)
		{
			orderPrice+=lineItem.getTotalPrice();
		}
		//System.out.println("total order amt is "+orderPrice);
		
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public List<LineItem> getLineItemList() {
		return lineItemList;
	}
	public void setLineItemList(List<LineItem> lineItemList) {
		this.lineItemList = lineItemList;
	}
	public double getOrderPrice() {
		return orderPrice;
	}
	public void setOrderPrice(double orderPrice) {
		this.orderPrice = orderPrice;
	}

}
