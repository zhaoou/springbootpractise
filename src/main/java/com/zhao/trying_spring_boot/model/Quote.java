package com.zhao.trying_spring_boot.model;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.PrePersist;

@Entity
public class Quote {
	
	@Id
	String id;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}

	private String text;
	private String author;
	
	public Quote(String text, String author) {
		this.text =text;
		this.author = author;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	@PrePersist
	public void sedId() {
		id=UUID.randomUUID().toString();
	}
	@Override
	public String toString() {
		return "Quote [id=" + id + ", text=" + text + ", author=" + author + "]";
	}
	
	
}
