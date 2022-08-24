package com.xworkz.automobile1;

public class NewAutomobile {
public double price;
public String type ;
public String ownerName;
 
 protected void addAll(double price,String type,String ownerName) {
	this.price=price;
    this.type=type;
    this.ownerName=ownerName;
    System.out.println("price :"+price +" type: "+type+" ownerNamem :"+ownerName);
	
}
 
 public NewAutomobile(){
	price=12;
	type="bike";
	ownerName="abhi";
	System.out.println("default price :"+price +" type: "+type+" ownerNamem :"+ownerName);
 }
}