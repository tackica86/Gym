package com.example.teretanaTamara.service.serviceImpl;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.teretanaTamara.dao.TrainerDao;
import com.example.teretanaTamara.dao.WorkoutDao;
import com.example.teretanaTamara.domain.Trainer;
import com.example.teretanaTamara.domain.Workout;
import com.example.teretanaTamara.domain.dto.TrainerDto;
import com.example.teretanaTamara.domain.dto.TrainerWorkoutDto;
import com.example.teretanaTamara.service.TrainerI;

@Service
public class TrainerService implements TrainerI{

	TrainerDao trainerDao;
	WorkoutDao workoutDao;
	
	@Autowired
	public TrainerService(TrainerDao trainerDao, WorkoutDao workoutDao) {
		super();
		this.trainerDao = trainerDao;
		this.workoutDao = workoutDao;
	}

	//Showing all Trainers
	@Override
	public List<Trainer> findAll() {
		return (List<Trainer>) trainerDao.findAll();
	}

	//Finding specific Trainer by Id
	@Override
	public Trainer findById(Long id) {
		Optional<Trainer> optionalTrainer = trainerDao.findById(id);
		if(optionalTrainer.isPresent()) {
			return optionalTrainer.get();
		}
		return null;
	}

	//Adding new Trainer
	@Override
	public Trainer save(TrainerDto trainerDto) {
		Trainer trainer=new Trainer();
		trainer.setName(trainerDto.getName());
		trainer.setSurname(trainerDto.getSurname());
		trainer.setPrice(trainerDto.getPrice());
		trainerDao.save(trainer);
		return trainer;
	}

	//Updating existing Trainer
	@Override
	public Trainer update(Trainer trainer) {
		return trainerDao.save(trainer);
	}

	//Deleting existing Trainer
	@Override
	public String delete(Long id) {
		trainerDao.deleteById(id);
		return "Object deleted!!!";
	}

	//Showing all workouts for specific Trainer by Id
	@Override
	@Transactional
	public TrainerWorkoutDto workoutList(Long trainer_id) {
		Optional<Trainer> optionalTrainer = trainerDao.findById(trainer_id);
		if(optionalTrainer.isPresent()) {
			Trainer trainer = optionalTrainer.get();
			List<Workout> workouts = workoutDao.findByTrainer(trainer);
			TrainerWorkoutDto trainerWorkout= new TrainerWorkoutDto();
			trainerWorkout.setTrainer(trainer);
			trainerWorkout.setWorkouts(workouts);
			return trainerWorkout;
		}
		return null;
	}

}
