package com.example.teretanaTamara.service;

import java.util.List;

import com.example.teretanaTamara.domain.Subscription;
import com.example.teretanaTamara.domain.dto.SubscriptionDto;

public interface SubscriptionI {

	public List<Subscription> findAll();
	public Subscription findById(Long id);
	public Subscription save(SubscriptionDto subscriptionDto);
	public Subscription update(Subscription subscription);
	public String delete(Long id);


}
