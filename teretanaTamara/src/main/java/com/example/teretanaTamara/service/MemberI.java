package com.example.teretanaTamara.service;

import java.util.List;

import com.example.teretanaTamara.domain.Member;
import com.example.teretanaTamara.domain.dto.MemberDto;
import com.example.teretanaTamara.domain.dto.MemberWorkoutDto;

public interface MemberI {

	public List<Member> findAll();
	public Member findById(Long id);
	public Member save(MemberDto memberDto);
	public Member update(Member member);
	public String delete(Long id);
	public MemberWorkoutDto workoutList(Long member_id);
	public boolean validationEmail(String email);
	
}
