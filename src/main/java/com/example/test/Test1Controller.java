package com.example.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Test1Controller {
	@RequestMapping(value="/")
	private String index(){
	return "/index.html";
	}
}
