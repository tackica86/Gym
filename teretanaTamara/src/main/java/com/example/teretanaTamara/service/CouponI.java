package com.example.teretanaTamara.service;

import java.util.List;

import com.example.teretanaTamara.domain.Coupon;
import com.example.teretanaTamara.domain.dto.CouponDto;

public interface CouponI {

	public List<Coupon> findAll();
	public Coupon findById(Long id);
	public Coupon save(CouponDto couponDto);
	public Coupon update(Coupon coupon);
	public String delete(Long id);
}
