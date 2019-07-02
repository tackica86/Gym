package com.example.teretanaTamara.service;

import java.util.List;


import com.example.teretanaTamara.domain.Operator;
import com.example.teretanaTamara.domain.dto.OperatorDto;
import com.example.teretanaTamara.domain.dto.OperatorWorkoutDto;

public interface OperatorI {

	public List<Operator> findAll();
	public Operator save(OperatorDto operatorDto);
	public String delete(Long id);
	public OperatorWorkoutDto workoutList(Long operator_id);
	public boolean validationEmail(String email);
	public boolean validationPassword(String password);
}
