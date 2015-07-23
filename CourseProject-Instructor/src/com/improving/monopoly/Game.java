package com.improving.monopoly;

import java.util.ArrayList;
import java.util.List;

import com.improving.dice.Die;

public class Game {
	
	//private Square[] squares;
	private List<Square> squares;
	
	private Player[] players;
	private Die die1;
	private Die die2;
	
	public Game(int numberOfPlayers) {
		if (numberOfPlayers < 2)
			throw new IllegalArgumentException("Not enough Players!");
		if (numberOfPlayers > 8)
			throw new IllegalArgumentException("Too many Players!");
		
		buildDice();
		buildSquares();
		linkSquares(); 
		buildPlayers(numberOfPlayers);
	}

	private void linkSquares() {
		for (int i = 0; i < squares.size()-1; i++) {
			
			Square currentSquare = squares.get(i);
			Square nextSquare = squares.get(i+1);
			currentSquare.setNextSquare(nextSquare);
		}
		Square lastSquare = squares.get(39);
		Square startSquare = squares.get(0);
		lastSquare.setNextSquare(startSquare);
	}

	private void buildDice() {
		die1 = new Die();
		die2 = new Die();
	}

	private void buildPlayers(int numberOfPlayers) {
		players = new Player[numberOfPlayers];
		for (int i = 0; i < players.length; i++) {
			players[i] = new Player(Token.values()[i], 1500, squares.get(0));
		}
	}

	private void buildSquares() {
		//squares = new Square[40];
		squares = new ArrayList<Square>();
		
		for (int i = 0; i < 40; i++) {
			
			switch (i) {
			case 0: 
				//squares[i] = new Square("Go");
				squares.add(new GoSquare());
				break;

			default:
				//squares[i] = new Square("Square " + i);
				squares.add(new Square("Square " + i));
				break;
			}
		}
	}
	
	public Game() {
		this(2); 
	}
	
	public void playRound() {
		for (Player player : players) {
			player.takeTurn(die1, die2);
		}
	}

	public List<Square> getSquares() {
		return squares;
	}

	public Player[] getPlayers() {
		return players;
	}

}
