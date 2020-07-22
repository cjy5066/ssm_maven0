package com.ssm_maven.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class Index {

	@RequestMapping("/aa")
	public String  index() {
		System.out.println("?????????????");
		return "forward:index.jsp";
	}
}
