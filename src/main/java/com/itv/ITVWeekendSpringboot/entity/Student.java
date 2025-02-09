package com.itv.ITVWeekendSpringboot.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Student {
	@Id
	private int rno;
	
	@Column(name="firstname")
	private String firstName; //first_name
	
	@Column(name="lastname")
	private String lastName;
	private int age;
	private String gender;
	private String email;
	private double percentage;
	
}
