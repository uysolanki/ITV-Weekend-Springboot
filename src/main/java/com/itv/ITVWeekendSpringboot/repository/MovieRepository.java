package com.itv.ITVWeekendSpringboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.itv.ITVWeekendSpringboot.entity.Movie;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Integer>
{

}
