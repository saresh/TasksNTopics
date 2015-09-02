package com.saresh.subnlab.entity;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class User {
	private int id;
    private String login;
    private String password;
    private boolean enabled;
    private List<Topic> topicsCreated;
    private List<Topic> topicsAssigned;
    private Set<Role> userRoles = new HashSet<Role>(0);
    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean isEnabled() {
		return enabled;
	}
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
	public List<Topic> getTopicsCreated() {
		return topicsCreated;
	}
	public void setTopicsCreated(List<Topic> topicsCreated) {
		this.topicsCreated = topicsCreated;
	}
	public List<Topic> getTopicsAssigned() {
		return topicsAssigned;
	}
	public void setTopicsAssigned(List<Topic> topicsAssigned) {
		this.topicsAssigned = topicsAssigned;
	}
	public Set<Role> getUserRoles() {
		return userRoles;
	}
	public void setUserRoles(Set<Role> userRoles) {
		this.userRoles = userRoles;
	}
    
    
	
}
