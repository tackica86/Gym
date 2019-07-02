package com.example.teretanaTamara.service.serviceImpl;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.teretanaTamara.dao.CouponDao;
import com.example.teretanaTamara.domain.Coupon;
import com.example.teretanaTamara.domain.dto.CouponDto;
import com.example.teretanaTamara.service.CouponI;

@Service
public class CouponService implements CouponI{

	@Autowired
	CouponDao couponDao;
	
	//Showing all types of Coupon
	@Override
	public List<Coupon> findAll() {
		return (List<Coupon>) couponDao.findAll();
	}

	//Finding specific Coupon by Id
	@Override
	public Coupon findById(Long id) {
		Optional<Coupon> optionalCoupon = couponDao.findById(id);
		if(optionalCoupon.isPresent()) {
			return optionalCoupon.get();
		}
		return null;
	}

	//Adding new type of Coupon
	@Override
	public Coupon save(CouponDto couponDto) {
		Coupon coupon = new Coupon();
		coupon.setCouponType(couponDto.getCouponType());
		coupon.setCouponDiscount(couponDto.getCouponDiscount());
		couponDao.save(coupon);
		return coupon;
	}

	//Updating existing Coupon
	@Override
	public Coupon update(Coupon coupon) {	
		return couponDao.save(coupon);
	}

	//Deleting existing Coupon
	@Override
	public String delete(Long id) {
		couponDao.deleteById(id);
		return "Object deleted!!!";
	}

}
