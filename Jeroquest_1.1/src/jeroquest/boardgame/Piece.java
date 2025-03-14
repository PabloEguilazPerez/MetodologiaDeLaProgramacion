package jeroquest.boardgame;

import jeroquest.utils.Position;

/*
 ¿Tendría sentido que la clase Item implementara la interface Piece? Razona la respuesta e incluye un comentario al inicio del fichero Piece.java con el formato:
 */

// 2.4.3.: No tendría sentido que la clase Item implementara la interface Piece, ya que la clase Item no es una pieza del tablero, sino que es una clase que representa un objeto que puede ser colocado en una casilla del tablero. Por otro lado, la clase Wall sí que implementa la interface Piece, ya que representa una pieza del tablero.

/*
 ¿Podría ser Piece una clase abstracta de la que hereden tanto Character como Wall? Razona la respuesta.
 */

// 2.4.3.: No, Piece no podría ser una clase abstracta de la que hereden tanto Character como Wall, ya que Piece es una interface y no una clase abstracta. En Java, una clase no puede heredar de una interface, sino que debe implementarla. Por otro lado, en Java, una clase puede implementar múltiples interfaces, pero no puede heredar de múltiples clases.

public interface Piece {
	/**
	 * Get the position in the board
	 *
	 * @return the position in the board
	 */
	Position getPosition();

	/**
	 * Set the position of the piece in the board
	 *
	 * @param pos new position of the piece in the board
	 */
	void setPosition(Position pos);

	/**
	 * Get the character representation of the piece
	 *
	 * @return the character representation of the piece
	 */
	char toChar();
}