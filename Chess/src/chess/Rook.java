package chess;

public class Rook extends Piece implements SpecialFirstMove {

	public Rook(Color color) {
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
		return 5;
	}

}
