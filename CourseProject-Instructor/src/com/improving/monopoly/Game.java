package com.improving.monopoly;

public class Game {
	
	private Square[] squares;
	private Player[] players;
	
	public Game(int numberOfPlayers) {
		squares = new Square[40];
		players = new Player[numberOfPlayers];

		for (int i = 0; i < squares.length; i++) {
			
			switch (i) {
			case 0: 
				squares[i] = new Square("Go");
				break;

			default:
				squares[i] = new Square("Square " + i);
				break;
			}
		}
		 
		for (int i = 0; i < players.length; i++) {
			players[i] = new Player(Token.values()[i]);
		}
	}
	
	public Game() {
		this(2);
	}

	public Square[] getSquares() {
		return squares;
	}

	public Player[] getPlayers() {
		return players;
	}

}
