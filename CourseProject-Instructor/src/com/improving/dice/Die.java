package com.improving.dice;

public class Die {

	private int faceValue;
	private int numberOfSides;
	
	public Die() {
		this(6);  
	}
	
	public Die(int numberOfSides) {
		this.numberOfSides = numberOfSides;
		this.faceValue = 1;
	}
	
	
	public void roll() {
		faceValue = (int)(Math.random() * numberOfSides) + 1;
	}
 
	public int getFaceValue() {
		return faceValue;
	}
	
}
