package chess;


public class Game {
	private Board board;
	private Player whitePlayer;
	private Player blackPlayer;
	private Player activePlayer;
	
	public Game() {
		this.board = new Board();
		this.whitePlayer = new Player(Color.WHITE);
		this.blackPlayer = new Player(Color.BLACK);
	}
	
	public Board getBoard() {
		return this.board;
	}
	
	public Player getWhitePlayer() {
		return this.whitePlayer;
	}
	
	public Player getBlackPlayer() {
		return this.blackPlayer;
	}

	public void setActivePlayer(Player activePlayer) {
		this.activePlayer = activePlayer;
	}
	
	public Player getActivePlayer() {
		return this.activePlayer;
	}
		
	
	public void startGame() {
		getBoard().setStartPosition(getWhitePlayer().getPieces(),
									getBlackPlayer().getPieces());
		setActivePlayer(getWhitePlayer());
	}
}
