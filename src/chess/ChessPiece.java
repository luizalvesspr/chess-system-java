package chess;

import boardGame.Board;
import boardGame.Piece;

public abstract class ChessPiece extends Piece {
	private Color color;

	public ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

	public boolean[][] possibleMoves() {
		// TODO Auto-generated method stub
		return null;
	}

    

}
