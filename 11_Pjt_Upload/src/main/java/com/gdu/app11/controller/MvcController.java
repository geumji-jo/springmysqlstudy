package com.gdu.app11.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Controller
public class MvcController {

	@GetMapping("/")
	public String welcome() {
		return "index";
	}
	
}
