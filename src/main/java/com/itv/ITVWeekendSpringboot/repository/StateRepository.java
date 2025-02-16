package com.itv.ITVWeekendSpringboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.itv.ITVWeekendSpringboot.entity.State;

@Repository
public interface StateRepository extends JpaRepository<State, Integer>
{
	
}
