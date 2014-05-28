package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import chess.Board;
import chess.Color;
import chess.Square;

public class TestBoard {
	private Board board;
	
	@Before
	public void setUp() throws Exception {
		board = new Board();
	}

	@Test
	public void testBoardInitialized() {
		assertNotNull(board);
	}

	@Test
	public void testBoardSize() {
		assertNotNull(board.getSquares());
		
		int count = 0;
		for (int i = 0; i < board.getSquares().length; i++) {
			for (int j = 0; j < board.getSquares()[i].length; j++) {
				assertEquals(Square.class.getName(), board.getSquares()[i][j].getClass().getName());
				count += 1;
			}
		}
		
		assertEquals(64, count);
	}
	
	@Test
	public void testSquareColor() {
		assertEquals(Color.BLACK, board.getSquares()[0][0].getColor());
		assertEquals(Color.BLACK, board.getSquares()[0][4].getColor());
		assertEquals(Color.WHITE, board.getSquares()[0][7].getColor());		
	}
	
}
