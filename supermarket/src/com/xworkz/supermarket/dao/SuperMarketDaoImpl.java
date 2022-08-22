package com.xworkz.supermarket.dao;



import javax.naming.ldap.ManageReferralControl;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.transaction.Transaction;
import javax.validation.Validation;
import javax.validation.ValidatorFactory;

import com.mysql.cj.x.protobuf.MysqlxConnection.Close;
import com.xworkz.supermarket.entity.SuperMaketEntity;

//import com.xworkz.supermarket.entity.SuperMaketEntity;

public class SuperMarketDaoImpl implements SuperMarketDao {
	EntityManagerFactory factory=Persistence.createEntityManagerFactory("com.xworkz");
	@Override
	public boolean save(SuperMaketEntity superMaketEntity) {
   // ValidatorFactory factory=Validation.buildDefaultValidatorFactory();
		
		
		try {
			EntityManager manager=factory.createEntityManager();
			EntityTransaction tx=manager.getTransaction();
			tx.begin();
			manager.persist(superMaketEntity);
			tx.commit();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public SuperMaketEntity deleteById(Integer id ) {
		EntityManager manager=factory.createEntityManager();
		try {
		EntityTransaction tx=	manager.getTransaction();
		tx.begin();
		 // Object id = null;
		SuperMaketEntity entity=manager.find(SuperMaketEntity.class, id);
		manager.remove(entity);
		tx.commit();
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		return null;
		
	}


}
