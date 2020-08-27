package com.nirajan.web.controller.master;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nirajan.web.controller.core.CRUDController;
import com.nirajan.web.entity.FollowupStatus;

@Controller
@RequestMapping(value = "/master/followup/status")
public class FollowupStatusController extends CRUDController<FollowupStatus>{
	public FollowupStatusController() {
		activeMenu="master";
		pageTitle="Followup Status";
		viewPath="master/followup_status";
		pageURI="/master/followup/status";
	}
}
