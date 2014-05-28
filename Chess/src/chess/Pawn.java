package chess;

public class Pawn extends Piece implements SpecialFirstMove {

	public Pawn(Color color) {
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
		return 1;
	}

	@Override
	public boolean hasMoved() {
		// TODO Auto-generated method stub
		return false;
	}

}
