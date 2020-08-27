package com.nirajan.web.controller.master;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nirajan.web.controller.core.CRUDController;
import com.nirajan.web.entity.EnquiryStatus;

@Controller
@RequestMapping(value = "/master/enquiry/status")
public class EnquiryStatusController extends CRUDController<EnquiryStatus>{
		public EnquiryStatusController() {
			activeMenu="master";
			pageTitle="Enquiry Status";
			viewPath="master/enquiry_status";
			pageURI="/master/enquiry/status";
		}
	
		
		
}
