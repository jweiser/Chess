package chess;


public class Player {
	private Color color;
	private PieceSet pieceSet;
	
	public Player(Color color) {
		this.color = color;
		this.pieceSet = new PieceSet(color);
	}

	public Color getColor() {
		return color;
	}
	
	public PieceSet getPieces() {
		return pieceSet;
	}

}
