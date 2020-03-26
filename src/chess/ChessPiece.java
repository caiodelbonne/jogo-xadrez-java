package chess;

import boardgame.Board;
import boardgame.Piece;


public class ChessPiece extends Piece { // pe�a de xadrez // sub classe da pe�a

	private Color color;

	public ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}

	public Color getColor() { // somente acess nao modificada
		return color;
	}



	

}
