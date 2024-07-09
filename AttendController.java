package org.techhub.JForceSolutionsTaskApplication.controller;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.techhub.JForceSolutionsTaskApplication.Model.Attend;
import org.techhub.JForceSolutionsTaskApplication.Model.User;
import org.techhub.JForceSolutionsTaskApplication.Service.AttendService;

@Controller
public class AttendController {

	@Autowired
	AttendService aServ;

	@RequestMapping(value = "/signIn", method = RequestMethod.POST)
	public String signIn(User user, Map map) {
		LocalDate today = LocalDate.now();
	    boolean isSignedIn = aServ.signIn(user, today);
	    if (isSignedIn) {
	        map.put("msg",today);
	    } else {
	        map.put("msg", "Failed to sign in for today");
	    }
	    return "homeAttendPage";
	}


	@RequestMapping(value = "/signOut", method = RequestMethod.POST)
	public String signOut(User user, Map map) {
	    LocalDate today =LocalDate.now();
	    boolean isSignedOut = aServ.signOut(user, today);
	    if (isSignedOut) {
	        map.put("msg", today);
	    } else {
	        map.put("msg", "Failed to sign out for today");
	    }
	    return "homeAttendPage";
	}

	@RequestMapping(value = "/viewReport", method = RequestMethod.GET)
	public String viewReport(User user, Map map) {
	    List<Attend> attendanceReport = aServ.getAttendanceReport(user);
	    map.put("attendanceReport", attendanceReport);
	    return "userAttendanceReport";
	}

}
