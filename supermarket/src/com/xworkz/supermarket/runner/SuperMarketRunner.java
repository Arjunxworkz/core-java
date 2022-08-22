package com.xworkz.supermarket.runner;

import java.time.LocalDate;

import com.xworkz.supermarket.dao.SuperMarketDao;
import com.xworkz.supermarket.dao.SuperMarketDaoImpl;
import com.xworkz.supermarket.entity.SuperMaketEntity;
import com.xworkz.supermarket.service.SuperMarketServiceDao;
import com.xworkz.supermarket.service.SuperMarketServiceDaoImpl;

public class SuperMarketRunner {
public static void main(String [] args) {
	
	SuperMaketEntity market=new SuperMaketEntity();
	market.setId(6);
	market.setName("shadow");
	market.setLocation("btm2");
	market.setNumberOfStall(20);
	market.setMaximumCapacity("120");
	market.setCreatedBy("Abhinav");
	market.setCreatedDate(LocalDate.now());
	market.setUpdateBy("raghudas");
	market.setUpdateDate(LocalDate.now());
	
    SuperMarketServiceDao dao=new SuperMarketServiceDaoImpl();
	boolean res=dao.save(market);
    System.out.println(res);
    //dao.deleteById(1);
}

}
