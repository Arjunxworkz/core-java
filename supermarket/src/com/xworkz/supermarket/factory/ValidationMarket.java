package com.xworkz.supermarket.factory;

import javax.validation.ValidatorFactory;

public class ValidationMarket {
private static ValidatorFactory factory;

public static ValidatorFactory getfactory(){
   return factory;	
}
static{
	factory = javax.validation.Validation.buildDefaultValidatorFactory();
	
}
}
