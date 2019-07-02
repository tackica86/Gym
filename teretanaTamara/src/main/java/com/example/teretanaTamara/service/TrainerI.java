package com.example.teretanaTamara.service;

import java.util.List;

import com.example.teretanaTamara.domain.Trainer;
import com.example.teretanaTamara.domain.dto.TrainerDto;
import com.example.teretanaTamara.domain.dto.TrainerWorkoutDto;

public interface TrainerI {

	public List<Trainer> findAll();
	public Trainer findById(Long id);
	public Trainer save(TrainerDto trainerDto);
	public Trainer update(Trainer trainer);
	public String delete(Long id);
	public TrainerWorkoutDto workoutList (Long trainer_id);

}
