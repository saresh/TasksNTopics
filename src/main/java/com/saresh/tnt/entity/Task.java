package com.saresh.tnt.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Task {
	@Id
    @GeneratedValue(generator="increment")
    @GenericGenerator(name="increment", strategy = "increment")
	private int id;
	private String title;
	private String description;
	
	@ManyToOne
    @JoinColumn(name="topicId")
	private Topic topic;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "task")
	private List<TaskFile> files;
	
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
	public Topic getTopic() {
		return topic;
	}
	public void setTopic(Topic topic) {
		this.topic = topic;
	}
	public List<TaskFile> getFiles() {
		return files;
	}
	public void setFiles(List<TaskFile> files) {
		this.files = files;
	}
	
	
	
	
}
