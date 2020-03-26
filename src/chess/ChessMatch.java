package chess;

import boardgame.Board;
import boardgame.Position;
import chess.pieces.King;
import chess.pieces.Rook;

public class ChessMatch {
	// partida de xadrez cora��o do jogo , regras do jogo

	private Board board;// tabuleiro

	public ChessMatch() {
		board = new Board(8, 8); // voce que obrigatoriamente define a quantidade de linhas e colunas
		initialSetup();
	}

	// metodo para retornar uma matriz de pe�as de xaddrez da partida
	public ChessPiece[][] getPieces() {
		ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
		for (int i = 0; i < board.getRows(); i++) {
			for (int j = 0; j < board.getColumns(); j++) {
				mat[i][j] = (ChessPiece) board.piece(i, j);
			}
		}
		return mat;
	}
	
	private void initialSetup () {
		board.placePiece(new Rook(board, Color.WHITE), new Position(2,1));
		board.placePiece(new King(board, Color.BLACK), new Position(3,1));
		
	}
}
