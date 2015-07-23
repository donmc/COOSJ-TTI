package com.improving.monopoly;

public class Player {

	private Token token;
	private int money;
	private Square location;

	public Player(Token token, int seedCapital, Square startLocation) {
		this.token = token;
		this.money = seedCapital; 
		this.location = startLocation;
	}

	public Token getToken() {
		return token;
	}

	public int getMoney() {
		return money;
	}

	public Square getLocation() {
		return location;
	}

}
