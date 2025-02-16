package com.itv.ITVWeekendSpringboot.entity;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

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
public class Movie {
		
		@Id
		private int mno;
		private String mname;
		private int ryear;
		
		@ManyToMany(mappedBy = "portfolio")
	    private Set<Actor> starcast;
}