package com.ananta.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="movie_table")
public class MovieDTO {
	
	@Id
	@GenericGenerator(name="myID", strategy="increment")
	@GeneratedValue(generator="myID")
	@Column(name="m_id")
	private int mid;
	
	@Column(name="m_name")
	private String mname;
	
	@Column(name="duration")
	private int duration;
	
	@Column(name="rating")
	private int rating;
	
	@Column(name="language")
	private String language;

	public int getMid() {
		return mid;
	}

	public void setMid(int mid) {
		this.mid = mid;
	}

	public String getMname() {
		return mname;
	}

	public void setMname(String mname) {
		this.mname = mname;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

}
