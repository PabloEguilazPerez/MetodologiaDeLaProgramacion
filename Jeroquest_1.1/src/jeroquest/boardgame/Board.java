package jeroquest.boardgame;

import jeroquest.items.Item;
import jeroquest.units.Character;
import jeroquest.utils.Position;

/**
 * Programming Methodology Practice. Mini-Chess - An example of Object Oriented
 * Programming. Class Board - class that represents the game board
 * 
 * @author Jorge Puente Peinador y Ramiro Varela Arias
 * @author Juan Luis Mateo
 *
 */

public class Board {
	private Square[][] squares; // squares matrix
	private int rows; // number of rows
	private int columns; // number of columns

	/**
	 * Create a board according to the specified dimensions (constructor)
	 * 
	 * @param rows    the number of rows in the board
	 * @param columns the number of columns in the board
	 */
	public Board(int rows, int columns) {
		this.rows = rows;
		this.columns = columns;
		squares = new Square[rows][columns];
		for (int i = 0; i < rows; i++)
			for (int j = 0; j < columns; j++)
				squares[i][j] = new Square();
	}

	/**
	 * Get the number of rows in the board
	 * 
	 * @return the number of rows
	 */
	public int getRows() {
		return rows;
	}

	/**
	 * Get the number of columns in the board
	 * 
	 * @return the number of columns
	 */
	public int getColumns() {
		return columns;
	}

	/**
	 * Get the square for a given position in the board
	 * 
	 * @param pos position in the board
	 * @return the square for that position
	 */
	private Square getSquare(Position pos) {
		return squares[pos.getRow()][pos.getColumn()];
	}

	/**
	 * Takes a piece out of the board
	 * 
	 * @param p the piece to take out of the board
	 */
	public void removePiece(Piece p) {
		// if the character is in the board
		if (p.getPosition() != null) {
			// it is taken out
			getSquare(p.getPosition()).setPiece(null);
			p.setPosition(null);
		}
	}

	/**
	 * Checks if the square is valid
	 * 
	 * @param pos position to check
	 * @return true if the square is valid
	 */
	private boolean validSquare(Position pos) {
		// if the square is not valid
		if ((pos.getRow() < 0) || (pos.getRow() >= rows))
			return false;
		if ((pos.getColumn() < 0) || (pos.getColumn() >= columns))
			return false;
		// otherwise it is valid
		return true;
	}

	/**
	 * Checks if a square is valid and it is free
	 * 
	 * @param pos position to check
	 * @return true if the square is free
	 */
	public boolean freeSquare(Position pos) {
		return validSquare(pos) && getSquare(pos).empty();
	}

	/**
	 * Place a Piece in an empty square
	 * 
	 * @param p   Piece to place
	 * @param pos square position
	 * @return true it the placement could be made, false if the square was occupied
	 *         or it wan't valid
	 */
	public boolean movePiece(Piece p, Position pos) {
		if (freeSquare(pos)) {
			// remove the piece from the current square
			removePiece(p);
			// set the piece to the new square
			p.setPosition(pos);
			getSquare(pos).setPiece(p);

			return true; // it could be moved
		} else
			return false; // it couldn't be moved
	}

	/**
	 * Generate a printable representation of the object (overridden method)
	 * 
	 * @return the printable representation of the board
	 */
	@Override
	public String toString() {
		String s = "";
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++)
				s += squares[i][j];
			s += "\n";
			;
		}
		return s;
	}

	public boolean movePiece(Character character, Position pos) {
		
		if (freeSquare(pos)) {
			// remove the piece from the current square
			removePiece(character);
			// set the piece to the new square
			character.setPosition(pos);
			getSquare(pos).setPiece(character);

			return true; // it could be moved
		} else
		
		return false;
		
	}

	public void addItem(Piece item, Position position) {

		getSquare(position).setPiece(item);
		item.setPosition(position);

	}
}
