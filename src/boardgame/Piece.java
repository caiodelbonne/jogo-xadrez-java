package boardgame;

public class Piece { // pe�a

	protected Position position;
	protected Board board;

	public Piece(Position position, Board board) {
		this.board = board;
		position = null;
	}

	protected Board getBoard() { // so pact e sub classe pode acessar o metodo
		return board;
	}

}
