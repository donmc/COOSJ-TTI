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
	

}
