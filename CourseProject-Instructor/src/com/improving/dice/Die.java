package com.improving.dice;

public class Die {

	private int faceValue;
	private int numberOfSides;
	
	public Die() {
		this.numberOfSides = 6;
	}
	
	public Die(int numberOfSides) {
		this.numberOfSides = numberOfSides;
	}
	
	
	public void roll() {
		faceValue = (int)(Math.random() * numberOfSides) + 1;
	}

	public int getFaceValue() {
		return faceValue;
	}
	
}
