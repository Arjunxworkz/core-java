package com.xworkz.automobile1.runner;

import com.xworkz.automobile1.NewAutomobile;

public class AutoRunner extends NewAutomobile {

	AutoRunner() {
		super();
		//System.out.println("default price :"+price +" type: "+type+" ownerNamem :"+ownerName);	  
	}
	

	public static void main(String[] args) {
	NewAutomobile newAutomobile=new NewAutomobile();
	
//		newAutomobile.addAll(1, "bike", "ravi");
	AutoRunner autoRunner=new AutoRunner();
	            autoRunner.addAll(1, "bike", "ravi");
	}
}
