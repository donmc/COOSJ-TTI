package com.improving.monopoly;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

public class WhenSettingUpGame {

	
	@Test
	public void shouldHaveMoreThanOnePlayer() {
		
		try {
			Game game = new Game(1);
			fail("Should have thrown an exception!");
			
		}catch(IllegalArgumentException e) {
			assertEquals("Not enough Players!", e.getMessage());
		}catch(Exception e) {
			fail("WRONG EXCEPTION!");
		}
	}

	
	@Test
	public void shouldHaveLessThanNinePlayers() {
		
		try {
			Game game = new Game(9);
			fail("Should have thrown an exception!");
			
		}catch(IllegalArgumentException e) {
			assertEquals("Too many Players!", e.getMessage());
		}catch(Exception e) {
			fail("WRONG EXCEPTION!");
		}
	}
	
	@Test
	public void shouldHave40Squares() {
		Game game = new Game();
		
		//Square[] squares = game.getSquares();
		List<Square> squares = game.getSquares();
		
		assertEquals(40, squares.size());
		
	}
	
	@Test
	public void shouldHaveCorrectNameOnSquares() {
		Game game = new Game();

		List<Square> squares = game.getSquares();

		assertEquals("Go", squares.get(0).getName());
		assertEquals("Square 1", squares.get(1).getName());
		assertEquals("Square 2", squares.get(2).getName());
		assertEquals("Square 3", squares.get(3).getName());
		assertEquals("Square 4", squares.get(4).getName());
		assertEquals("Square 5", squares.get(5).getName());
		assertEquals("Square 6", squares.get(6).getName());
		assertEquals("Square 39", squares.get(39).getName());
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
		List<Square> squares = game.getSquares();

		Square startSquare = squares.get(0);
		
		assertEquals(startSquare, players[0].getLocation());
		assertEquals(startSquare, players[1].getLocation());
		
	}

}









