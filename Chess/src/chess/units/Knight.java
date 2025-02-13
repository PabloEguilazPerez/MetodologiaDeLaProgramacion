package chess.units;

import chess.boardgame.Board;
import chess.utils.DynamicVectorPosition;
import chess.utils.Position;

/**
 * Programming Methodology Practice. MiniChess - An example of Object Oriented
 * Programming. Class Knight - class that represents knight piece in chess
 * 
 * @author Jorge Puente Peinador y Ramiro Varela Arias
 * @author Juan Luis Mateo
 *
 */

// Knight: Caballo

public class Knight {
	
	private Position pos;

	/**
	 * Constructor
	 * 
	 */
	public Knight() {
		this.pos = null;
	}

	/**
	 * Get the position in the board
	 * 
	 * @return the position in the board
	 */
	public Position getPosition() {
		return pos;
	}

	/**
	 * Set the position of the piece in the board
	 * 
	 * @param pos new position of the piece in the board
	 */
	public void setPosition(Position pos) {
		this.pos = pos;
	}

	public char toChar() {
		// TODO
		return 'N';
	}

	/**
	 * Returns an array with the valid squares where a Knight can move directly from
	 * its current position:(NNW, NNE, WWN, WWS, EEN, EES, SSW and SSE)
	 * 
	 * @param currentBoard the board whith the Pieces
	 * @return the vector of positions (possibly free) where it can move
	 */
	public DynamicVectorPosition validPositions(Board currentBoard) {

		DynamicVectorPosition positions = null;

		positions = generatePossiblePositions(currentBoard);

		filterValidPositions(currentBoard, positions);

		return positions;
	}

	/**
	 * Given a board and a vector of positions, eliminate the invalid positions
	 * w.r.t. the board
	 * 
	 * @param board     the board
	 * @param positions the vector of positions
	 */
	private void filterValidPositions(Board board, DynamicVectorPosition positions) {
		int x = 0;
		while (x < positions.length()) {
			if (!board.freeSquare(positions.get(x)))
				positions.remove(x);
			else
				x++;
		}
	}

	@Override
	public String toString() {
		return "Knight [pos=" + pos + "]";
	}

	/**
	 * Generate all possible positions after all possible movements of the Piece
	 * 
	 * @param currentBoard the board
	 * @return the dynamic vector of XYLocations of possible movements
	 */
	private DynamicVectorPosition generatePossiblePositions(Board currentBoard) {
		DynamicVectorPosition positions = new DynamicVectorPosition();

		// TODO
		// S -> S -> E

		// S -> S -> W

		// N -> N -> E

		// N -> N -> W

		// E -> E -> N

		// E -> E -> S

		// W -> W -> N

		// W -> W -> S

		return positions;
	}

}
