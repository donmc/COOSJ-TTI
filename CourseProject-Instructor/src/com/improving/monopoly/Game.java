package com.improving.monopoly;

import com.improving.dice.Die;

public class Game {
	
	private Square[] squares;
	private Player[] players;
	private Die die1;
	private Die die2;
	
	public Game(int numberOfPlayers) {
		buildDice();
		buildSquares();
		buildPlayers(numberOfPlayers);
	}

	private void buildDice() {
		die1 = new Die();
		die2 = new Die();
	}

	private void buildPlayers(int numberOfPlayers) {
		players = new Player[numberOfPlayers];
		for (int i = 0; i < players.length; i++) {
			players[i] = new Player(Token.values()[i], 1500, squares[0]);
		}
	}

	private void buildSquares() {
		squares = new Square[40];
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
