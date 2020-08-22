package org.tree.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Controller
@Log4j
@RequestMapping("/member")
@AllArgsConstructor
public class MemberController {
	
	@GetMapping("/sign-in")
	public String sign() {
		log.info("> sign");
		return "member/sign_in";
	}
	
	
}
