package com.xworkz.automobile.honda;

import com.xworkz.automobile.AutoMobile;

public class Honda extends AutoMobile {
	public String engine;
	public String model;

	public Honda(String engine, String model) {
		this.engine = engine;
		this.model = model;

	}

	public Honda() {
		System.out.println("default constructor of honda");

	}

//	@Override
//	public void torisu() {
//		//super.torisu();
//		System.out.println("this is honda engine" + this.engine);
//		System.out.println("this  model" + this.model);
//
//	}
	
}
