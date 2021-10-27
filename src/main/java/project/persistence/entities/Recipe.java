package main.java.project.persistence.entities;

import javax.persistence.Entity;
import javax.persistence.*;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Recipe {
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String name;
	private String description;
	private Tags tags;

	//Getters & Setters
	public long getID() {
		return id;
	}
	public void setID(long id) {
		this.id = id;
	}
	public long getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	@Embedded
	public Tags getTags() {
		return tags;
	}
	public void setTags(Tags tags) {
		this.tags = tags;
	}
}