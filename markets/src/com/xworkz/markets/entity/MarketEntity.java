package com.xworkz.markets.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Table;


import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data
@Entity
@NoArgsConstructor
@Getter
@Setter
@ToString(callSuper=true)
@Table(name="market_info")


public class MarketEntity extends ParentEntity{
private Integer id;
private String name;
private String location;
private Integer numberOfStall;
private String maximumCapacity;

public MarketEntity(Integer id, String name, String location, Integer numberOfStall, String maximumCapacity,
		String createdBy, LocalDate createdDate,String updateBy,LocalDate updateDate) {
	super(createdBy,createdDate,updateBy,updateDate);
	this.id = id;
	this.name = name;
	this.location = location;
	this.numberOfStall = numberOfStall;
	this.maximumCapacity = maximumCapacity;
}


}
