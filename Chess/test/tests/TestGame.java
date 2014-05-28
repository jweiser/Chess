package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import chess.Game;

public class TestGame {
	private Game game;
	
	@Before
	public void setUp() throws Exception {
		game = new Game();
	}

	@Test
	public void testGameInitialized() {
		assertNotNull(game);
	}
	
	@Test
	public void testStartGame() {
		assertNotNull(game.getBoard());
		assertNotNull(game.getWhitePlayer());
		assertNotNull(game.getBlackPlayer());
		
		game.startGame();
		
		assertEquals(game.getActivePlayer(), game.getWhitePlayer());
		
	}

}
