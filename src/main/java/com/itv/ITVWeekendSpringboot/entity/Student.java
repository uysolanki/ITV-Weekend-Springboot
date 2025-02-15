package com.itv.ITVWeekendSpringboot.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonFormat;

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
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int rno;
	
	@NotNull(message = "First name cannot be null") 
	@Size(min = 3,max = 10, message = "First name must contain at least 3 characters and Max 10 characters") 
	@Column(name="firstname")
	private String firstName; //first_name
	
	@NotNull(message = "Last name cannot be null") 
	@Size(min = 3, max = 10,message = "Last name must contain at least 3 characters") 
	@Column(name="lastname")
	private String lastName;
	
	@NotNull(message = "Age cannot be null") 
	@Min(value = 18, message = "Age must be at least 18") 
	@Max(value = 65, message = "Age must be less than or equal to 65") 
	private int age;
	
	@Pattern(regexp = "^(male|female)$", message = "Gender must be either 'male' or 'female'")
	private String gender;
	
	@NotNull(message = "Email cannot be null") 
	@Email(message = "Email should be valid")
	@Column(unique = true)
	private String email;
	
	@DecimalMin(value = "40.00", message = "Percentage must be greater than or equal to 40.00")
	@DecimalMax(value = "99.99", message = "Percentage must be less than or equal to 99.99")
	private double percentage;
	
	@Past
	@JsonFormat(pattern = "yyyy-MM-dd")
	@NotNull(message = "Date Of Birth cannot be null") 
	LocalDate dob;
	
}
