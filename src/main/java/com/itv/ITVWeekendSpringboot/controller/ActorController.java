package com.itv.ITVWeekendSpringboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.itv.ITVWeekendSpringboot.entity.Actor;
import com.itv.ITVWeekendSpringboot.service.ActorService;

@RestController
public class ActorController {

	@Autowired
	ActorService actorService;

	@PostMapping("/saveActor")
	public Actor saveActor(@RequestBody Actor actor) {
		return actorService.saveActor(actor);
	}
}
