package com.xworkz.supermarket.factory;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class PersistenceFactory {
private static EntityManagerFactory factory;

public   static EntityManagerFactory getFactory() {
	
	
	return factory;
	
}	
static {
	factory=Persistence.createEntityManagerFactory("com.xworkz");
}
	


}
