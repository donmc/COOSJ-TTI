package com.improving.ui;

import com.improving.dice.Die;

public class DiceApp {

	public static void main(String[] args) {
		Die die1 = new Die(20);
		Die die2 = new Die();
		
		die1.roll();
		die2.roll();
		
		int value1 = die1.getFaceValue();
		int value2 = die2.getFaceValue();

		System.out.println("Die 1 roll: " + value1);
		System.out.println("Die 2 roll: " + value2);
	}

}
