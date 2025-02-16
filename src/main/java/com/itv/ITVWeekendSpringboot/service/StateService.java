package com.itv.ITVWeekendSpringboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itv.ITVWeekendSpringboot.entity.State;
import com.itv.ITVWeekendSpringboot.repository.StateRepository;

@Service
public class StateService {

	@Autowired
	StateRepository stateRepository;
	
	public State saveState(State state) {
		return stateRepository.save(state);
	}

}
