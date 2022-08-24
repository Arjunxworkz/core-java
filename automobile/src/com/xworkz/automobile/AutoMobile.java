package com.xworkz.automobile;

public class AutoMobile {
	public String type;
	public String brand;

	public void setTypeAndBrand(String type, String brand) {
		this.type = type;
		this.brand = brand;
		System.out.println("type of Automobile is " + this.type + " " + this.brand);
	}

	
	public AutoMobile() {
		System.out.println("this is constructor of Automobile");

	}

	protected double allAccessories() {
		System.out.println("break price is ");
		
		return 200;

	}

	public void torisu() {
	System.out.println("type of Automobile is " + this.type);
		System.out.println("type of brand is " + this.brand);

	}

}
