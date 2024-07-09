package org.techhub.JForceSolutionsTaskApplication.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.techhub.JForceSolutionsTaskApplication.Model.User;
import org.techhub.JForceSolutionsTaskApplication.Repository.UserRepo;

@Service("uServ")
public class UserServiceImple implements UserService {

	@Autowired
	UserRepo uRepo;

	@Override
	public boolean isAdd(User u) {
		
		return uRepo.isAdd(u);
	}

	@Override
	public User isLogin(User u) {
		
		return uRepo.isLogin(u);
	}

	@Override
	public List<User> getAllUsers() {
		
		return uRepo.getAllUsers();
	}
}
