package com.keduit.member.repository;

import java.util.stream.IntStream;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.keduit.member.entity.Member;

@SpringBootTest
public class MemberRepositoryTest {
	
	@Autowired
	private MemberRepository memberRepository;
	
	@Test
	public void insertMember() {
		
		IntStream.rangeClosed(1, 10).forEach(i -> {
			Member member = Member.builder().id("userID" + i)
											.pass("1111")
											.nickname("userNick" + i)
											.age(20)
											.image("imageSample" + i)
											.name("userName" + i)
											.gender(false)
											.address("서울시" + i)
											.phone("010-1111-" + i)
											.grade(true)
											.introduce("안녕하슈" + i)
											.build();
			
			memberRepository.save(member);
		});
		
	}
}
