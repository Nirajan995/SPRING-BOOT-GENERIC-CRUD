package com.nirajan.web.controller.core;

import org.springframework.web.bind.annotation.ModelAttribute;

public abstract class SiteController {
	protected String activeMenu;
	protected String pageTitle;
	protected String pageURI;
	
	@ModelAttribute(value = "activeMenu")
	public String getActiveMenu() {
		return activeMenu;
	}
	
	@ModelAttribute(value = "pageTitle")
	public String getPageTitle() {
		return pageTitle;
	}
	
	@ModelAttribute(value = "pageURI")
	public String getPageURI() {
		return pageURI;
	}
}
