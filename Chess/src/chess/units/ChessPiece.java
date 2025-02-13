package chess.units;

import chess.boardgame.Board;
import chess.utils.DynamicVectorPosition;
import chess.utils.Position;

public abstract class ChessPiece {

	private Position pos;
	
	public ChessPiece() {}
	
	public ChessPiece(Position pos) {
		this.pos = pos; 
	}
	
	public Position getPosition() {
		return pos;
	}
	
	public void setPosition(Position pos) {
		this.pos = pos;
	}
	
	public DynamicVectorPosition validPositions(Board currentBoard) {

		DynamicVectorPosition positions = null;

		positions = generatePossiblePositions(currentBoard);

		filterValidPositions(currentBoard, positions);

		return positions;
	}

	protected void filterValidPositions(Board board, DynamicVectorPosition positions) {
		int x = 0;
		while (x < positions.length()) {
			if (!board.freeSquare(positions.get(x)))
				positions.remove(x);
			else
				x++;
		}
	}


	protected abstract DynamicVectorPosition generatePossiblePositions(Board currentBoard);
	
	public abstract char toChar();
	
}
