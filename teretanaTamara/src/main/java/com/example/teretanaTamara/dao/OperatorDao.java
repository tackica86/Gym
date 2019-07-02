package com.example.teretanaTamara.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.teretanaTamara.domain.Operator;

@Repository
public interface OperatorDao extends CrudRepository<Operator, Long>{

public Operator findByEmailAndOperatorPassword(String email, String operatorPassword);

}
