package com.improving.monopoly;

import com.improving.dice.Die;

public class Player implements IPlayer {

	private Token token;
	private int money;
	private Square location;
	private int steps;

	public Player(Token token, int seedCapital, Square startLocation) {
		this.token = token;
		this.money = seedCapital; 
		this.location = startLocation;
	}

	@Override
	public Token getToken() {
		return token; 
	}

	@Override
	public int getMoney() {
		return money;
	}

	@Override
	public Square getLocation() {
		return location;
	}

	public void takeTurn(Die die1, Die die2) {
		die1.roll();
		die2.roll();
		
		steps = die1.getFaceValue() + die2.getFaceValue();
		
		for (int i = 0; i < steps; i++) {
			location = location.getNextSquare();
			location.passOverBy(this);
		}

		location.landOnBy(this);
		
	}

	@Override
	public int getLastRoll() {
		return steps;
	}

	public void credit(int amount) {
		money += amount;
	}

	public void debit(int amount) {
		money -= amount;
	}

}
