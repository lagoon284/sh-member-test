package com.keduit.member.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.keduit.member.entity.Member;

public interface MemberRepository extends JpaRepository<Member, String>{
	
	@Query(value = "select *" +
		   " from member" +
		   " where id = :id",
		   nativeQuery = true)
	Object getMemberById(@Param("id") String id);
	
	
	
}
