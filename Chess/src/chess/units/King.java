package chess.units;

import chess.boardgame.Board;
import chess.utils.DynamicVectorPosition;
import chess.utils.Position;

/**
 * Programming Methodology Practice. MiniChess - An example of Object Oriented
 * Programming. Class Position - class that represents the king piece in chess
 * 
 * @author Jorge Puente Peinador y Ramiro Varela Arias
 * @author Juan Luis Mateo
 *
 */
public class King {
	private Position pos;

	/**
	 * Constructor
	 * 
	 */
	public King() {
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
		return 'K';
	}

	/**
	 * Returns an array with the valid squares where a King can move directly from
	 * its current position:(N, S, E, W, NW, NE, SW and SE)
	 * 
	 * @param currentBoard the board with the Pieces
	 * @return the vector of positions (possibly free) where it can move
	 */
	public DynamicVectorPosition validPositions(Board currentBoard) {

		DynamicVectorPosition positions = null;

		positions = generatePossiblePositions(currentBoard);

		filterValidPositions(currentBoard, positions);

		return positions;
	}

	/**
	 * Filter the valid positions on a board of a dynamic vector of positions
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

	/**
	 * Return the dynamic array of possible squares where a King can move directly
	 * from its current position:(N, S, E, W, NW, NE, SW and SE)
	 * 
	 * @param currentBoard the board
	 * @return a dynamic vector of positions
	 */
	private DynamicVectorPosition generatePossiblePositions(Board currentBoard) {
		DynamicVectorPosition positions = new DynamicVectorPosition();

		// N
		positions.add(this.getPosition().north());
		// S
		positions.add(this.getPosition().south());
		// W
		positions.add(this.getPosition().west());
		// E
		positions.add(this.getPosition().east());
		// S->E
		positions.add(this.getPosition().south().east());
		// S->W
		positions.add(this.getPosition().south().west());
		// N->E
		positions.add(this.getPosition().north().east());
		// N->W
		positions.add(this.getPosition().north().west());

		return positions;
	}

	@Override
	public String toString() {
		return "The king in position " + ((this.getPosition() != null) ? this.getPosition() : "(-,-)");
	}
}
