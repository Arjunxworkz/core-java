package com.xworkz.supermarket.entity;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
@ToString

public class ParentEntity {
	
	private String createdBy;
	private LocalDate createdDate;
	private String updateBy;
	private LocalDate updateDate;
}
