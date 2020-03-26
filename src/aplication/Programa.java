package aplication;

import boardgame.Board;
import boardgame.Position;
import chess.ChessMatch;

public class Programa {

	public static void main(String[] args) {
		Board bor = new Board(8, 8);
		ChessMatch chessMatch = new ChessMatch();
		UI.printBoard(chessMatch.getPieces());

	}

}
