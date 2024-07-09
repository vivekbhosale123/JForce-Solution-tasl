package org.techhub.JForceSolutionsTaskApplication.Repository;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import org.techhub.JForceSolutionsTaskApplication.Model.Attend;

public interface AttendRepo {

	    boolean signIn(int userId, LocalDate date);
	    boolean signOut(int userId, LocalDate date);
	    List<Attend> getAttendanceReport(int userId);
}
