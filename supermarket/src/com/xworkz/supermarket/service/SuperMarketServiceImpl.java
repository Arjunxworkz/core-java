package com.xworkz.supermarket.service;

//import javax.validation.ValidatorFactory;
import static com.xworkz.supermarket.factory.ValidationMarket.*;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.xworkz.supermarket.dao.SuperMarketDao;
import com.xworkz.supermarket.dao.SuperMarketDaoImpl;
import com.xworkz.supermarket.entity.SuperMaketEntity;

import lombok.AllArgsConstructor;

import java.util.Set;

@AllArgsConstructor
public class SuperMarketServiceImpl implements SuperMarketServic {
	private SuperMarketDao dao;

	@Override
	public boolean validateAndSave(SuperMaketEntity superMaketEntity) {
		ValidatorFactory factory = getfactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<SuperMaketEntity>> violation = validator.validate(superMaketEntity);
		if (violation.size() > 0) {
			System.out.println("Invalid Detais");

		} else {
			System.out.println("Valid Object");
			dao.save(superMaketEntity);
		}

		return false;
	}

}
