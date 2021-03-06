package com.udemy.appbackendninja.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="log")
public class Log {

	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	
	@Column(name="date")
	private Date date;
	
	@Column(name="details")
	private String details;
	
	@Column(name="username")
	private String username;
	
	@Column(name="url")
	private String url;
	
	//Constructores
	public Log(){}
	
	public Log(Date date, String details, String username, String url){
		this.date = date;
		this.details = details;
		this.username = username;
		this.url = url;
	}

	//Getters
	public int getId() {
		return id;
	}

	public Date getDate() {
		return date;
	}

	public String getDetails() {
		return details;
	}

	public String getUsername() {
		return username;
	}

	public String getUrl() {
		return url;
	}

	//Setters
	public void setId(int id) {
		this.id = id;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	
}
