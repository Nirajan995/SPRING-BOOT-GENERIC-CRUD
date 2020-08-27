package com.nirajan.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.nirajan.web.controller.core.SiteController;

@Controller
@RequestMapping(value = "/")
public class HomeController extends SiteController {
	 public HomeController() {
		 activeMenu="home";
		 pageTitle="Dashboard";
	}
	@GetMapping()
	public String index(Model model) {
		model.addAttribute("colors", new String[] {"red","blue","green"});
		return "index";
	}
	
}

