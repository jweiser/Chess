package chess;

import java.awt.Point;

public class Board {
	private static final int RANKS = 8;
	private static final int FILES = 8;
	
	private Square[][] squares;
	
	public Board() {
		squares = new Square[RANKS][FILES];
		createSquares();
	}
		
	public Diagonal getDiagonal(Point start, Point end) {
		return null;
		
	}
	
	public Rank getRank(Point start, Point end) {
		return null;
		
	}
	
	public File getFile(Point start, Point end) {
		return null;
		
	}
	
	public void setStartPosition(PieceSet whitePieces, PieceSet blackPieces) {
		// TODO Auto-generated method stub
	}

	public Square[][] getSquares() {
		return this.squares;
	}

	private void createSquares() {
		for (int rank = 0; rank < RANKS; rank++) {
			for (int file = 0; file < FILES; file++) {
				createSquare(file, rank);
			}
		}
	}
	
	private void createSquare(int file, int rank) {
		squares[file][rank] = new Square(new Point(file, rank)); 
	}
	
	private class Rank {
		private Square[] squares;
		
		public Rank(Square start, Square end) {
			squares = new Square[8];
		}
	}
	
	private class File {
		private Square[] squares;
		
		public File(Square start, Square end) {
			squares = new Square[8];
		}
	}
	
	private class Diagonal {
		private Square[] squares;
		
		public Diagonal(Square start, Square end) {
			createDiagonal(start, end); 
		}
		
		private void createDiagonal(Square start, Square end) {
			
		}
	}
}
