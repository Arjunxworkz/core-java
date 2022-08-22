package com.xworkz.supermarket.service;

//import javax.validation.ValidatorFactory;
import static com.xworkz.supermarket.factory.ValidationMarket.*;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.xworkz.supermarket.dao.SuperMarketDao;
import com.xworkz.supermarket.dao.SuperMarketDaoImpl;
import com.xworkz.supermarket.entity.SuperMaketEntity;
import java.util.Set;

public class SuperMarketServiceDaoImpl implements SuperMarketServiceDao {
	SuperMarketDao dao = new SuperMarketDaoImpl();

	ValidatorFactory factory = getfactory();

	@Override
	public boolean save(SuperMaketEntity superMaketEntity) {
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<SuperMaketEntity>> violation = validator.validate(superMaketEntity);
		if(violation.size()>0) {
			System.out.println("Invalid Detais");
			
		}else {
            System.out.println("Valid Object");
            dao.save(superMaketEntity);
        }

		return false;
	}

}
