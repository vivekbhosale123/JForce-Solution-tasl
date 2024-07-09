package org.techhub.JForceSolutionsTaskApplication.Model;

import java.time.LocalDate;

public class Attend {

	private int id;
	private int userid;
	private LocalDate date;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public boolean isSignin() {
		return signin;
	}
	public void setSignin(boolean signin) {
		this.signin = signin;
	}
	public boolean isSignout() {
		return signout;
	}
	public void setSignout(boolean signout) {
		this.signout = signout;
	}
	private boolean signin;
	private boolean signout;
}
