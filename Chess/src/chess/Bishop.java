package chess;

public class Bishop extends Piece {

	public Bishop(Color color) {
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
		return 3;
	}

}
