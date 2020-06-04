package com.example.springboot.controler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloControler {
	@ResponseBody
	@RequestMapping("hello")
	public String hello() {
		return "hello world, hello springboot!";
	}
}
