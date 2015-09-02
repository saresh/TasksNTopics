package com.saresh.subnlab.entity;

import java.util.ArrayList;
import java.util.List;

public class Topic {
	private int id;
    private String title;
    private String description;
    private List<Task> tasks = new ArrayList<Task>();
    private User creator;
    private List<User> usersAssigned = new ArrayList<User>();
    
    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public List<Task> getTasks() {
		return tasks;
	}
	public void setTasks(List<Task> tasks) {
		this.tasks = tasks;
	}
	public User getCreator() {
		return creator;
	}
	public void setCreator(User creator) {
		this.creator = creator;
	}
	public List<User> getUsersAssigned() {
		return usersAssigned;
	}
	public void setUsersAssigned(List<User> usersAssigned) {
		this.usersAssigned = usersAssigned;
	}
    
	    
    

}
