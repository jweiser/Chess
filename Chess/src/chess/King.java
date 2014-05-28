package chess;

public class King extends Piece implements SpecialFirstMove {

	public King(Color color) {
		super(color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean hasMoved() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isLegalMove(Square newPosition) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int getValue() {
		return Integer.MAX_VALUE;
	}

}
