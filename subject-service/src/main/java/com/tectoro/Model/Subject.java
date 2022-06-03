package com.tectoro.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Subject {
	@Id
	private int sid;
	private String name;
	private String author;
	private int id;
	
	
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	public Subject(int sid, String name, String author, int id) {
		super();
		this.sid = sid;
		this.name = name;
		this.author = author;
		this.id = id;
	}
	public Subject() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Subject [sid=" + sid + ", name=" + name + ", author=" + author + "]";
	}
	
	
}
