package com.xworkz.supermarket.dao;

import com.xworkz.supermarket.entity.SuperMaketEntity;

public interface SuperMarketDao {
boolean save(SuperMaketEntity superMaketEntity) ;
SuperMaketEntity deleteByName(String name);
	

}
