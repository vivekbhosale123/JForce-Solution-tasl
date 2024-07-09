package org.techhub.JForceSolutionsTaskApplication.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import org.techhub.JForceSolutionsTaskApplication.Model.Attend;
import org.techhub.JForceSolutionsTaskApplication.Model.User;

public interface AttendService {

	boolean signIn(User u, LocalDate date);
	boolean signOut(User u, LocalDate date);
	List<Attend> getAttendanceReport(User u);
}
