package chess;

public abstract class Piece {
	private Color color;
	private Square position;
	
	public Piece(Color color) {
		this.color = color;
	}
	
	public Color getColor() {
		return color;
	}
	
	public Square getPosition() {
		return position;
	}

	public boolean move(Square newPosition) {
		if (isLegalMove(newPosition)) {
			this.position = newPosition;
			return true;
		}
		
		return false;
	}
	
	public abstract boolean isLegalMove(Square newPosition);
	
	public abstract int getValue();
}
