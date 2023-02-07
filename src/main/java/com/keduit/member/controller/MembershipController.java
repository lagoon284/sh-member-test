package com.keduit.member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.keduit.member.dto.MemberDTO;
import com.keduit.member.service.MemberService;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Controller
@RequestMapping("/sample")
@Log4j2
@RequiredArgsConstructor
public class MembershipController {
	
	private final MemberService memberService; // Service 생성 필요
	
	// membership -> 짧은거로 바꾸길 희망하심!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
//	@GetMapping("/")
//	public String index() {
//		return "redirect:/sample/membership";
//	}
	// main 화면으로 넘어가려면 GetMapping도 만들어줘야 함
	@GetMapping("/main")
	public void main() {
		
	}
	
	@GetMapping("/membership")
	public void index1() {
		
	}
	
	// 회원가입 후 main 화면으로 넘어갈거야
	@PostMapping("/main")
	public String register(MemberDTO memberDTO) {
		
		log.info("memberDTO : " + memberDTO);
		
//		String id = memberService.register(memberDTO);
		
		return "redirect:/sample/main";
		
	}
	
	
}