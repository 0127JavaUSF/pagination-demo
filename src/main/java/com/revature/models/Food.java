package com.revature.models;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
public class Food {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(nullable = false, unique = true)
//	@NotEmpty - at least one character, can be white space
	@NotBlank(message="Name must not be blank!")
	private String name;
	
	private boolean tasty;

	@Column(nullable = false)
	private boolean poisonous;
	
	private LocalDate dateAdded;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isTasty() {
		return tasty;
	}

	public void setTasty(boolean tasty) {
		this.tasty = tasty;
	}

	public boolean isPoisonous() {
		return poisonous;
	}

	public void setPoisonous(boolean poisonous) {
		this.poisonous = poisonous;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + (poisonous ? 1231 : 1237);
		result = prime * result + (tasty ? 1231 : 1237);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Food other = (Food) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (poisonous != other.poisonous)
			return false;
		if (tasty != other.tasty)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Food [id=" + id + ", name=" + name + ", tasty=" + tasty + ", poisonous=" + poisonous + "]";
	}

	public Food(int id, String name, boolean tasty, boolean poisonous) {
		super();
		this.id = id;
		this.name = name;
		this.tasty = tasty;
		this.poisonous = poisonous;
	}

	public Food() {
		super();
		// TODO Auto-generated constructor stub
	}

}
