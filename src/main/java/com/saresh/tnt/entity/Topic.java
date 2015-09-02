package com.saresh.tnt.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Topic {
	@Id
    @GeneratedValue(generator="increment")
    @GenericGenerator(name="increment", strategy = "increment")
	private int id;
	
    private String title;
    private String description;
    
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "topic")
    private List<Task> tasks = new ArrayList<Task>();
    
    @ManyToOne
    @JoinColumn(name="creatorId")
    private User creator;
    
    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "user_topic", joinColumns = { 
                    @JoinColumn(name = "topicId", nullable = false, updatable = false) }, 
                    inverseJoinColumns = { @JoinColumn(name = "userId", 
					nullable = false, updatable = false) })
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
