package com.xworkz.supermarket.runner;

import java.time.LocalDate;

import com.xworkz.supermarket.dao.SuperMarketDao;
import com.xworkz.supermarket.dao.SuperMarketDaoImpl;
import com.xworkz.supermarket.entity.SuperMaketEntity;
import com.xworkz.supermarket.service.SuperMarketServic;
import com.xworkz.supermarket.service.SuperMarketServiceImpl;

public class SuperMarketRunner {
	public static void main(String[] args) {

		SuperMaketEntity market = new SuperMaketEntity();
		market.setId(8);
		market.setName("shadow");
		market.setLocation("btm2");
		market.setNumberOfStall(20);
		market.setMaximumCapacity("120");
		market.setCreatedBy("Abhinav");
		market.setCreatedDate(LocalDate.now());
		market.setUpdateBy("raghudas");
		market.setUpdateDate(LocalDate.now());

		SuperMarketDao dao = new SuperMarketDaoImpl();
		SuperMarketServic servic = new SuperMarketServiceImpl(dao);
		boolean save = servic.validateAndSave(market);
		System.out.println(save);
		// SuperMarketDao dao1=new SuperMarketDaoImpl();
		// dao1.deleteById(5);
	}

}
