package org.techhub.JForceSolutionsTaskApplication.Service;

import java.util.List;

import org.techhub.JForceSolutionsTaskApplication.Model.User;

public interface UserService {

	public boolean isAdd(User u);
	public User isLogin(User u);
	List<User> getAllUsers();
}
