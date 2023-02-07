package com.keduit.member.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.keduit.member.entity.Member;

public interface MemberRepository extends JpaRepository<Member, String>{
	
}
