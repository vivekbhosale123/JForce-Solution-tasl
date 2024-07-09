package org.techhub.JForceSolutionsTaskApplication.Repository;

import java.util.List;

import org.techhub.JForceSolutionsTaskApplication.Model.User;

public interface UserRepo{

	public boolean isAdd(User u);
	public User isLogin(User u);
	List<User> getAllUsers();
}
