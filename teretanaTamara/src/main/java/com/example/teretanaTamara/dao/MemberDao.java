package com.example.teretanaTamara.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.example.teretanaTamara.domain.Member;

@Repository
public interface MemberDao extends CrudRepository<Member, Long> {

}