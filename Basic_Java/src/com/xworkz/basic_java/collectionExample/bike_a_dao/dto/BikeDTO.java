package com.xworkz.basic_java.collectionExample.bike_a_dao.dto;

public class BikeDTO {

	private int modelNo;
	private String companyName;
	private String cubicCapacity;
	private String color;
	private double price;
	private int topSpeed;

	public BikeDTO(){

	}

	public int getModelNo() {
		return modelNo;
	}

	public void setModelNo(int modelNo) {
		this.modelNo = modelNo;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCubicCapacity() {
		return cubicCapacity;
	}

	public void setCubicCapacity(String cubicCapacity) {
		this.cubicCapacity = cubicCapacity;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getTopSpeed() {
		return topSpeed;
	}

	public void setTopSpeed(int topSpeed) {
		this.topSpeed = topSpeed;
	}

	@Override
	public String toString() {
		return "BikeDTO [modelNo=" + modelNo + ", companyName=" + companyName + ", cubicCapacity=" + cubicCapacity
				+ ", color=" + color + ", price=" + price + ", topSpeed=" + topSpeed + "]";
	}

}
