package com.saresh.tnt.entity;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class User {
	@Id
    @GeneratedValue(generator="increment")
    @GenericGenerator(name="increment", strategy = "increment")
	private int id;	
	
    private String login;
    private String password;
    private boolean enabled;
    
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "creator")
    private List<Topic> topicsCreated;
    
    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "usersAssigned")
    private List<Topic> topicsAssigned;
    
    @ManyToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    @JoinTable(name = "user_role", joinColumns = { 
			@JoinColumn(name = "userId", nullable = false, updatable = false) }, 
			inverseJoinColumns = { @JoinColumn(name = "roleId", 
					nullable = false, updatable = false) })
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
