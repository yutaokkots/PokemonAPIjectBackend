package com.ethenthinkful.pokemonapijectapi.model;

import java.sql.Timestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "bookletdata")
public class BookletData {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String cardOne;
	private String cardTwo;
	private String cardThree;
	private String cardFour;
	private String cardFive;
	private String cardSix;
	private Timestamp measuredDateTime;
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "user_id", nullable = false)
	private User user;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCardOne() {
		return cardOne;
	}

	public void setCardOne(String cardOne) {
		this.cardOne = cardOne;
	}

	public String getCardTwo() {
		return cardTwo;
	}

	public void setCardTwo(String cardTwo) {
		this.cardTwo = cardTwo;
	}

	public String getCardThree() {
		return cardThree;
	}

	public void setCardThree(String cardThree) {
		this.cardThree = cardThree;
	}

	public String getCardFour() {
		return cardFour;
	}

	public void setCardFour(String cardFour) {
		this.cardFour = cardFour;
	}

	public String getCardFive() {
		return cardFive;
	}

	public void setCardFive(String cardFive) {
		this.cardFive = cardFive;
	}

	public String getCardSix() {
		return cardSix;
	}

	public void setCardSix(String cardSix) {
		this.cardSix = cardSix;
	}

	public Timestamp getMeasuredDateTime() {
		return measuredDateTime;
	}

	public void setMeasuredDateTime(Timestamp measuredDateTime) {
		this.measuredDateTime = measuredDateTime;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
}