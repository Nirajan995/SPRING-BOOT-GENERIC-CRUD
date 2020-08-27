package com.nirajan.web.controller.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

public abstract class CRUDController<T> extends SiteController {
	
	protected String viewPath;
	
	@Autowired
	protected JpaRepository<T, Integer> repository;
	
	@GetMapping()
	public String index(Model model,@RequestParam(value = "page",defaultValue = "0",
				required=false)int page) {
		Pageable pageable=PageRequest.of(page,10);
		model.addAttribute("records", repository.findAll(pageable));
		return viewPath+"/index";
	}
	
	@GetMapping(value = "/create")
	public String create() {
		
		return viewPath + "/create";
	}
	
	@PostMapping()
	public String post(T model) {
		repository.save(model);
		return "redirect:"+pageURI;
	}
	
}
