package chess;

import boardgame.Board;
import chess.pieces.King;
import chess.pieces.Rook;

public class ChessMatch {
	// partida de xadrez coração do jogo , regras do jogo

	private Board board;// tabuleiro

	public ChessMatch() {
		board = new Board(8, 8); // voce que obrigatoriamente define a quantidade de linhas e colunas
		initialSetup();
	}

	// metodo para retornar uma matriz de peças de xaddrez da partida
	public ChessPiece[][] getPieces() {
		ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
		for (int i = 0; i < board.getRows(); i++) {
			for (int j = 0; j < board.getColumns(); j++) {
				mat[i][j] = (ChessPiece) board.piece(i, j);
			}
		}
		return mat;
	}
	
	private void placeNewPiece(char column,int row, ChessPiece piece) {  	// cordenada do xadrez
		board.placePiece(piece, new ChessPosition(column, row).toPosition());
	}   	
	private void initialSetup () {
		placeNewPiece('b', 6, new Rook(board, Color.BLACK));
		placeNewPiece('e', 8, new King(board, Color.WHITE));
		
	}
}
