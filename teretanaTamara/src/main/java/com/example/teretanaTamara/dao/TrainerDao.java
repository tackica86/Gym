package com.example.teretanaTamara.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.example.teretanaTamara.domain.Trainer;

@Repository
public interface TrainerDao extends CrudRepository<Trainer, Long>{

}
