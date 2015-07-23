package com.improving.monopoly;

import static org.junit.Assert.*;

import org.junit.Test;

public class WhenSettingUpGame {

	@Test
	public void shouldHave40Squares() {
		Game game = new Game();
		
		Square[] squares = game.getSquares();
		
		assertEquals(40, squares.length);
		
	}
	
	@Test
	public void shouldHaveCorrectNameOnSquares() {
		Game game = new Game();
		
		Square[] squares = game.getSquares();

		assertEquals("Go", squares[0].getName());
		assertEquals("Square 1", squares[1].getName());
		assertEquals("Square 2", squares[2].getName());
		assertEquals("Square 3", squares[3].getName());
		assertEquals("Square 4", squares[4].getName());
		assertEquals("Square 5", squares[5].getName());
		assertEquals("Square 6", squares[6].getName());
		assertEquals("Square 39", squares[39].getName());
	}
	
	@Test
	public void shouldDefaultTo2Players() {
		Game game = new Game();
		
		Player[] players = game.getPlayers();
		
		assertEquals(2, players.length);
	}
	
	@Test
	public void shouldAllowMorePlayers() {
		Game game = new Game(8);
		
		Player[] players = game.getPlayers();
		
		assertEquals(8, players.length);
	}
	
	@Test
	public void shouldSetTokensForPlayers() {
		Game game = new Game(8);
		Player[] players = game.getPlayers();

		assertEquals(Token.Thimble, players[0].getToken());
		assertEquals(Token.Shoe, players[1].getToken());
		assertEquals(Token.Car, players[2].getToken());
		assertEquals(Token.TopHat, players[3].getToken());
		assertEquals(Token.Battleship, players[4].getToken());
		assertEquals(Token.Iron, players[5].getToken());
		assertEquals(Token.Dog, players[6].getToken());
		assertEquals(Token.Wheelbarrow, players[7].getToken());
	}
	
	@Test
	public void shouldStartEachPlayerWith$1500() {
		Game game = new Game();
		Player[] players = game.getPlayers();
		
		assertEquals(1500, players[0].getMoney());
		assertEquals(1500, players[1].getMoney());
	}
	
	@Test
	public void shouldStartAllPlayersOnGo() {
		Game game = new Game();
		Player[] players = game.getPlayers();
		Square[] squares = game.getSquares();

		assertEquals(squares[0], players[0].getLocation());
		assertEquals(squares[0], players[1].getLocation());
		
	}

}









