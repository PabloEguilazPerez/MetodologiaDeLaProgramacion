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

public class Knight extends ChessPiece {
	
	/**
	 * Constructor
	 * 
	 */
	public Knight() {
		
	}

	public char toChar() {
		return 'N';
	}
	
	protected DynamicVectorPosition generatePossiblePositions(Board currentBoard) {
		DynamicVectorPosition positions = new DynamicVectorPosition();
		
		// TODO
		// S -> S -> E
		positions.add(this.getPosition().south().south().east());
		// S -> S -> W
		positions.add(this.getPosition().south().south().west());
		// N -> N -> E
		positions.add(this.getPosition().north().north().east());
		// N -> N -> W
		positions.add(this.getPosition().north().north().west());
		// E -> E -> N
		positions.add(this.getPosition().east().east().north());
		// E -> E -> S
		positions.add(this.getPosition().east().east().south());
		// W -> W -> N
		positions.add(this.getPosition().west().west().north());
		// W -> W -> S
		positions.add(this.getPosition().west().west().south());
		
		return positions;
	}

	@Override
	public String toString() {
		return "Knight []";
	}
	

}
