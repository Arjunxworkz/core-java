package com.xworkz.markets.entity;


import java.time.LocalDate;
//import java.time.LocalDate

import javax.persistence.Entity;
import javax.persistence.MappedSuperclass;

import lombok.AllArgsConstructor;

//import javax.persistence.Entity


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@MappedSuperclass
@ToString
@Getter
@Setter

public class ParentEntity {
private String createdBy;
private LocalDate createdDate;
private String updateBy;
private LocalDate updateDate;
}

