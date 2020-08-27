package com.nirajan.web.controller.master;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nirajan.web.controller.core.CRUDController;
import com.nirajan.web.entity.EnquirySources;

@Controller
@RequestMapping(value = "/master/enquiry/sources")
public class EnquirySourceController extends CRUDController<EnquirySources>{
	public EnquirySourceController() {
		activeMenu="master";
		pageTitle="Enquiry Source";
		viewPath="master/enquiry_source";
		pageURI="/master/enquiry/sources";
	}
	

}
