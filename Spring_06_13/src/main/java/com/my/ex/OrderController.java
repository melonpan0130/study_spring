package com.my.ex;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OrderController {
	@RequestMapping("/order/orderForm")
	public String form() {
		return "/order/orderForm";
	}
	
	@RequestMapping("order/orderCompletion")
	public String submit() {
		return "order/orderCompletion";
	}
}
