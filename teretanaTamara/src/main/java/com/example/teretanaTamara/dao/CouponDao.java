package com.example.teretanaTamara.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.teretanaTamara.domain.Coupon;

@Repository
public interface CouponDao extends CrudRepository<Coupon, Long> {

}
