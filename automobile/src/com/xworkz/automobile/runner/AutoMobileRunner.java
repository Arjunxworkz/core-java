package com.xworkz.automobile.runner;

import com.xworkz.automobile.AutoMobile;
import com.xworkz.automobile.honda.Honda;
import com.xworkz.automobile.tata.Tata;

public class AutoMobileRunner {

	public static void main(String[] args) {
		AutoMobile automobile =new AutoMobile();
		automobile.setTypeAndBrand("Bike", "auto");
		automobile.torisu();
		
		
		
		
		
		
		
		System.out.println("=========================");
		
		
		Honda honda = new Honda();
		honda.setTypeAndBrand("tampo", "3 whleelar");
		honda.torisu();
		
		
		
		
		System.out.println("=========================");
		Tata tata = new Tata();
		
	}

}
