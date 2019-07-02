package com.example.teretanaTamara.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.example.teretanaTamara.domain.Subscription;

@Repository
public interface SubscriptionDao extends CrudRepository<Subscription, Long>{

}