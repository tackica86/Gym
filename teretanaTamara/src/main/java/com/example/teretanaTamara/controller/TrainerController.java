package com.example.teretanaTamara.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.teretanaTamara.dao.TrainerDao;
import com.example.teretanaTamara.domain.Trainer;
import com.example.teretanaTamara.domain.dto.TrainerDto;
import com.example.teretanaTamara.domain.dto.TrainerWorkoutDto;
import com.example.teretanaTamara.service.serviceImpl.TrainerService;


@RestController
@RequestMapping("/trainer")
public class TrainerController {
	
	@Autowired
	TrainerDao trainerDao;
	
	@Autowired
	TrainerService trainerService;
	
	//Showing all Trainers
	@RequestMapping(value="/findAll", method=RequestMethod.GET)
	public List<Trainer> findAll(){
		return trainerService.findAll();
	}
	
	//Finding specific Trainer by Id
	@RequestMapping("/find/{id}")
	public Trainer getTrainer(@PathVariable Long id){
		return trainerService.findById(id);
		
	}
	
	//Adding new Trainer
	@RequestMapping(value = "/save", method=RequestMethod.POST)
	public @ResponseBody Trainer save(@RequestBody TrainerDto trainerDto) {
		return trainerService.save(trainerDto);
	}
	
	//Updating existing Trainer
	@PutMapping(value = "/update")
	public Trainer update(@RequestBody Trainer trainer) {
		trainerService.update(trainer);
		return trainer;
	}
	
	//Deleting existing Trainer
	@DeleteMapping(value = "/delete")
	public String delete(@RequestParam Long id) {
		return trainerService.delete(id);
	}
	
	//Showing all workouts for specific Trainer by Id
	@RequestMapping(value="workoutList/{trainer_id}")
	public TrainerWorkoutDto workoutList(@PathVariable Long trainer_id) {
		return trainerService.workoutList(trainer_id);	
	}
}
