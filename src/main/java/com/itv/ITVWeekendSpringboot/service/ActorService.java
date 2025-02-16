package com.itv.ITVWeekendSpringboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itv.ITVWeekendSpringboot.entity.Actor;
import com.itv.ITVWeekendSpringboot.entity.Movie;
import com.itv.ITVWeekendSpringboot.repository.ActorRepository;
import com.itv.ITVWeekendSpringboot.repository.MovieRepository;

@Service
public class ActorService {

	@Autowired
	ActorRepository actorRepository;
	
	@Autowired
	MovieRepository movieRepository;
	public Actor saveActor(Actor actor) {
		
		Actor actordb=actorRepository.findByAname(actor.getAname());
		
		
		for(Movie movie:actor.getPortfolio())
		{
			Movie moviedb=movieRepository.findById(movie.getMno()).get();
			if (!actordb.getPortfolio().contains(movie)) {
				actordb.getPortfolio().add(movie);
                movie.getStarcast().add(actordb);
            }
		}
		
		return actorRepository.save(actordb);
	}

}
