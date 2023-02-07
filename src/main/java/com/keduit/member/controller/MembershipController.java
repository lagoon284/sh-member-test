package com.keduit.member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Controller
@RequestMapping("/sample/")
@Log4j2
@RequiredArgsConstructor
public class MembershipController {
	
	// membership -> 짧은거로 바꾸길 희망하심!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
	@GetMapping("/")
	public String index() {
		return "redirect:/sample/membership";
	}
	
	@GetMapping("/membership")
	public void index1() {
		
	}
}
