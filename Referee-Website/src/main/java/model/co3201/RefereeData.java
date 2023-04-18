package model.co3201;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class RefereeData {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String name;
	
	private String date_birth;
	
	private int age;
	
	private String country;
	
	private int yellow_cards;
	
	private int red_cards;
	
	private int yellow_red_cards;
	
	private int games;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDate_birth() {
		return date_birth;
	}

	public void setDate_birth(String date_birth) {
		this.date_birth = date_birth;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getYellow_cards() {
		return yellow_cards;
	}

	public void setYellow_cards(int yellow_cards) {
		this.yellow_cards = yellow_cards;
	}

	public int getRed_cards() {
		return red_cards;
	}

	public void setRed_cards(int red_cards) {
		this.red_cards = red_cards;
	}

	public int getYellow_red_cards() {
		return yellow_red_cards;
	}

	public void setYellow_red_cards(int yellow_red_cards) {
		this.yellow_red_cards = yellow_red_cards;
	}

	public int getGames() {
		return games;
	}

	public void setGames(int games) {
		this.games = games;
	}
	
	//input getters and setters
	
	

}
