package chess;

public class PromotionFactory {
	public Piece obtainPiece(Square promotionSquare, PromotionPieces promotionPiece) {
		if (promotionPiece == PromotionPieces.BISHOP) {
			return new Bishop(null);
		} else if (promotionPiece == PromotionPieces.KNIGHT) {
			return new Knight(null);
		} else if (promotionPiece == PromotionPieces.QUEEN) {
			return new Queen(null);
		} else if (promotionPiece == PromotionPieces.ROOK) {
			return new Rook(null);
		} else {
			return null;
		}
	}
}
