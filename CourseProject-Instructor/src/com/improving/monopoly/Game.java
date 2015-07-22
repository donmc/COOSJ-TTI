package com.improving.monopoly;

public class Game {
	
	private Square[] squares;
	
	public Game() {
		squares = new Square[40];

		for (int i = 0; i < squares.length; i++) {
			squares[i] = new Square();
		}
	}

	public Square[] getSquares() {
		return squares;
	}

}
