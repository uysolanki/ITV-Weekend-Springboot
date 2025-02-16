package com.itv.ITVWeekendSpringboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.itv.ITVWeekendSpringboot.entity.State;
import com.itv.ITVWeekendSpringboot.service.StateService;

@RestController
public class StateController {

	@Autowired
	StateService stateService;

	@PostMapping("/saveState")
	public State saveState(@RequestBody State state) {
		return stateService.saveState(state);
	}

}
