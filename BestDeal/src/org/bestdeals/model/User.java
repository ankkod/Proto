package org.bestdeals.model;

import java.util.Date;

public class User {

	private String username;
	private String password;
	private int views;
	private int dealsPostedCount;
	private String privilegeLevel;
	private String emailAdd;
	private int totalViews;
	private int totalUpVotes;
	private Date date;
	
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getViews() {
		return views;
	}
	public void setViews(int views) {
		this.views = views;
	}
	public int getDealsPostedCount() {
		return dealsPostedCount;
	}
	public void setDealsPostedCount(int dealsPostedCount) {
		this.dealsPostedCount = dealsPostedCount;
	}
	public String getPrivilegeLevel() {
		return privilegeLevel;
	}
	public void setPrivilegeLevel(String privilegeLevel) {
		this.privilegeLevel = privilegeLevel;
	}
	public String getEmailAdd() {
		return emailAdd;
	}
	public void setEmailAdd(String emailAdd) {
		this.emailAdd = emailAdd;
	}
	public int getTotalViews() {
		return totalViews;
	}
	public void setTotalViews(int totalViews) {
		this.totalViews = totalViews;
	}
	public int getTotalUpVotes() {
		return totalUpVotes;
	}
	public void setTotalUpVotes(int totalUpVotes) {
		this.totalUpVotes = totalUpVotes;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
}
