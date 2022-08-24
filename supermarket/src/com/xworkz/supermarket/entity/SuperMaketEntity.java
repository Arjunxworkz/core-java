package com.xworkz.supermarket.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;



@AllArgsConstructor
@NoArgsConstructor
@Table(name="market_info")
@ToString(callSuper=true)
@Getter
@Setter
@Entity

@NamedQueries({
	@NamedQuery (name = "deleteName", query = "delete from market SuperMaketEntity market where market.name = :nam")
})

public class SuperMaketEntity extends ParentEntity {
	
	@Id
	@Min(value=1, message="id is not valid")
	private Integer id;
	@Size(min = 3,max = 20,message = "name is valid")
	private String name;
	@Size(min = 3,max = 20,message = "location is valid")
	private String location;
	
	private Integer numberOfStall;		
	@Min(1)
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
