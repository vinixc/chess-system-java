package application;

import chess.ChessMatch;

public class Program {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ChessMatch chessMatch = new ChessMatch();
		
		UI.printBoard(chessMatch.getPieces());
		
	}

}

