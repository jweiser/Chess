package chess;

import java.awt.Point;
import java.util.HashMap;
import java.util.Map;

public class Board {
	private static final int RANKS = 8;
	private static final int FILES = 8;
	
	private Square[][] squares;
	private static Map<Character, Integer> fileIndexMap;
	static {
		fileIndexMap = new HashMap<Character, Integer>();
		fileIndexMap.put('A', 0);
		fileIndexMap.put('B', 1);
		fileIndexMap.put('C', 2);
		fileIndexMap.put('D', 3);
		fileIndexMap.put('E', 4);
		fileIndexMap.put('F', 5);
		fileIndexMap.put('G', 5);
		fileIndexMap.put('H', 7);
	}
	
	public Board() {
		squares = new Square[RANKS][FILES];
		createSquares();
	}
		
	public Diagonal getDiagonal(Point start, Point end) {
		return null;
		
	}
	
	public Rank getRank(int rank) {
		if (rankInvalid(rank))
			return null;
		
		return new Rank(rank - 1);
	}
	
	private boolean rankInvalid(int rank) {
		return rank > 8 || rank < 1;
	}
	
	public File getFile(char file) {
		return null;
		
	}
	
	public void setStartPosition(PieceSet whitePieces, PieceSet blackPieces) {
		
	}

	public Square getSquare(String coordinates) throws IndexOutOfBoundsException {
		if (coordinates.length() != 2)
			return null;
		
		char file = coordinates.toUpperCase().charAt(0);
		int rank = Character.digit(coordinates.charAt(1), 10);
		
		return this.squares[getFileCoordinate(file)][rank  - 1];
	}
	
	private int getFileCoordinate(char file) {
		final int ASCII_A = 65;
		
		return file - ASCII_A;
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
		
		public Rank(int rank) {
			squares = new Square[8];
		}
	}
	
	private class File {
		private Square[] squares;
		
		public File(char file) {
			squares = new Square[8];
			populateSquares(file);
		}
		
		public Square[] getSquares() {
			return squares;
		}
		
		public Square getSquareAtRank(int rank) {
			if (rankInvalid(rank))
				return null;
			return getSquares()[rank];
		}
		
		private void populateSquares(char file) {
			int fileIndex = fileIndexMap.get(file);
		}
		
		private int getFileIndex(char file) {
			return fileIndexMap.get(file);
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
