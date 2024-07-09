package org.techhub.JForceSolutionsTaskApplication.controller;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.techhub.JForceSolutionsTaskApplication.Model.User;
import org.techhub.JForceSolutionsTaskApplication.Service.UserService;

@Controller
public class UserController {

	@Autowired
	UserService uServ;

	@RequestMapping(value = "/")
	public String test(HttpServletResponse response) throws IOException {
		return "home";
	}

	@RequestMapping(value = "/valid", method = RequestMethod.POST)
	public String validation(User u, Map map) {
		if (u.getUsername().equals(u.getUsername()) && u.getPassword().equals(u.getPassword())) {
			return "homeAttendPage";
		} else {
			map.put("msg", "invalid username and password");
			return "home";
		}
	}

	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String addUser() {

		return "register";
	}

	@RequestMapping(value = "/registerUser", method = RequestMethod.POST)
	public String saveRecord(User u, Map map) {
		boolean b = uServ.isAdd(u);
		if (b) {
			map.put("msg", "record save successfully");
		} else {
			map.put("msg", "record not save successfully");
		}
		return "register";
	}

	@RequestMapping(value = "/adminReport", method = RequestMethod.GET)
	public String adminReport(Map map) {
		List<User> allUsers = uServ.getAllUsers();
		map.put("allUsers", allUsers);
		return "adminReportPage";
	}
}
