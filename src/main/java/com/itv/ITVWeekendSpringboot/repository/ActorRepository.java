package com.itv.ITVWeekendSpringboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.itv.ITVWeekendSpringboot.entity.Actor;

@Repository
public interface ActorRepository extends JpaRepository<Actor, Integer>
{
		public Actor findByAname(String s);
}
