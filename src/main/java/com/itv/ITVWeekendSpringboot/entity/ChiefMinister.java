package com.itv.ITVWeekendSpringboot.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
@Table(name="chiefminister")
public class ChiefMinister {
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int cmno;
		private String cmname;
		private int age;
}
