package com.thoughtworks.foodbazar.fruit;

import com.thoughtworks.foodbazar.item.Item;

public abstract class Fruit implements Item {
	private String unitOfMeasure;
	private double unitRate;
	private String name;
	
	public Fruit(String name,String unitOfMeasure,double unitRate)
	{
		this.name=name;
		this.unitOfMeasure=unitOfMeasure;
		this.unitRate=unitRate;
	}
	public String getUnitOfMeasure() {
		return unitOfMeasure;
	}
	public void setUnitOfMeasure(String unitOfMeasure) {
		this.unitOfMeasure = unitOfMeasure;
	}
	public double getUnitRate() {
		return unitRate;
	}
	public void setUnitRate(double unitRate) {
		this.unitRate = unitRate;
	}

	public String getName() {
		return name;
	}
}
