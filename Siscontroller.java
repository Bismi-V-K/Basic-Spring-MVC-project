package com.home.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Siscontroller {

	@ResponseBody
	@RequestMapping("/sis")
	public String makeup() {
		return "Take my makeup";
	}
}
