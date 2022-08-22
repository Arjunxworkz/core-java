package com.xworkz.supermarket.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;


import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;



import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="market_info")
@ToString(callSuper=true)
@Getter
@Setter

public class SuperMaketEntity extends ParentEntity {
	@Id
	@Min(value=1, message="id is not valid")
	private Integer id;
	@javax.validation.constraints.NotNull
	private String name;
	@javax.validation.constraints.NotNull
	private String location;
	@Min(10)
	@Max(100)
	private Integer numberOfStall;
	@Min(100)
	@Max(1000)
	private String maximumCapacity;
	
	public SuperMaketEntity(Integer id, String name, String location, Integer numberOfStall, String maximumCapacity,String createdBy,
			LocalDate createdDate,String updateBy,LocalDate updateDate) {
		
		super(createdBy,createdDate,updateBy,updateDate);
	
		
		this.id = id;
		this.name = name;
		this.location = location;
		this.numberOfStall = numberOfStall;
		this.maximumCapacity = maximumCapacity;
	}
}
