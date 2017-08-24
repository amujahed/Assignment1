package com.thoughtworks.foodbazar.item;

public class LineItem {
	private Item item;
	private float quantity;
	private double totalPrice;
	
	public LineItem(Item item,float quantity)
	{
		this.item=item;
		this.quantity=quantity;
		
		//calculate the lime item total price
		calculateTotalPrice();
		
	}
	public void calculateTotalPrice()
	{
		double totalPrice=item.getUnitRate()*getQuantity();
		setTotalPrice(totalPrice);
		System.out.println("line item price is "+totalPrice);
	}
	
	public Item getItem() {
		return item;
	}
	public void setItem(Item item) {
		this.item = item;
	}
	public float getQuantity() {
		return quantity;
	}
	public void setQuantity(float quantity) {
		this.quantity = quantity;
	}
	public double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

}
