package org.techhub.JForceSolutionsTaskApplication.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.techhub.JForceSolutionsTaskApplication.Model.Attend;
import org.techhub.JForceSolutionsTaskApplication.Model.User;
import org.techhub.JForceSolutionsTaskApplication.Repository.AttendRepo;

@Service("aServ")
public class AttendServiceImple implements AttendService {

	@Autowired
	AttendRepo aRepo;

	 @Override
	    public boolean signIn(User user, LocalDate date) {
	        return aRepo.signIn(user.getId(), date);
	    }

	    @Override
	    public boolean signOut(User user, LocalDate date) {
	        return aRepo.signOut(user.getId(), date);
	    }

	    @Override
	    public List<Attend> getAttendanceReport(User user) {
	        return aRepo.getAttendanceReport(user.getId());
	    }
	
}
