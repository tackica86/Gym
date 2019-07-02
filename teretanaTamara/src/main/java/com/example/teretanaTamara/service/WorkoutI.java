package com.example.teretanaTamara.service;

import java.util.List;

import com.example.teretanaTamara.domain.Workout;
import com.example.teretanaTamara.domain.dto.IntervalDto;
import com.example.teretanaTamara.domain.dto.WorkoutDto;

public interface WorkoutI {

	public List<Workout> findAll();
	public Workout findById(Long id);
	public String save(WorkoutDto workoutDto);
	public String delete(Long id);
	public List<Workout> search(IntervalDto intervalDto);
}
