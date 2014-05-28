package chess;

public class Queen extends Piece {

	public Queen(Color color) {
		super(color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean isLegalMove(Square newPosition) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int getValue() {
		return 9;
	}

}
