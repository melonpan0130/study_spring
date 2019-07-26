package com.my.ex;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NewArticleController {
	@RequestMapping("/article/newArticleForm")
	public String form() {
		return "/article/newArticleForm";
	}
	
	@RequestMapping("/article/newArticleSubmitted")
	public String submit(@ModelAttribute("command") NewArticleCommand command) {
		return "/article/newArticleSubmitted";
	}
}
