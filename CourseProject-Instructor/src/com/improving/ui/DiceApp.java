package com.improving.ui;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.improving.dice.Die;

public class DiceApp {

	public static void main(String[] args) {
		Die die1 = new Die();
		Die die2 = new Die();
		Die die3 = new Die();
		Die die4 = new Die();
		

		
		List<Die> dice = new ArrayList<>();
		dice.add(die1);
		dice.add(die2);
		dice.add(die3);
		dice.add(die4);
		
		for (Die die : dice) {
			die.roll();
			System.out.println(die.getFaceValue());
		}
		

		Collections.sort(dice);
		
		for (Die die : dice) {
			System.out.println(die.getFaceValue());
		}
	}

}
