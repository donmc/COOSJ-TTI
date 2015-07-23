package com.improving.monopoly;

import com.improving.dice.Die;

public class Player {

	private Token token;
	private int money;
	private Square location;
	private int steps;

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

	public void takeTurn(Die die1, Die die2) {
		die1.roll();
		die2.roll();
		
		steps = die1.getFaceValue() + die2.getFaceValue();
		
		for (int i = 0; i < steps; i++) {
			location = location.getNextSquare();
		}
		
		location.landOnBy(this);
		
	}

	public int getLastRoll() {
		return steps;
	}

	public void credit(int amount) {
		this.money += amount;
	}

}
