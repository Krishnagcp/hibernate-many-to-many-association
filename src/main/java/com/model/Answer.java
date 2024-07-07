package com.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="ans323")
public class Answer {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String answer;
	private String postedBy;
	
	public Answer() {
		super();
	}
	
	public Answer(String answer, String postedBy) {
		super();
		this.answer = answer;
		this.postedBy = postedBy;
	}

	public Answer(int id, String answer, String postedBy) {
		super();
		this.id = id;
		this.answer = answer;
		this.postedBy = postedBy;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public String getPostedBy() {
		return postedBy;
	}
	public void setPostedBy(String postedBy) {
		this.postedBy = postedBy;
	}
	
	
	

}
