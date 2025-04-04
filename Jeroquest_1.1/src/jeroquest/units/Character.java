package jeroquest.units;

import jeroquest.boardgame.Board;
import jeroquest.boardgame.Dice;
import jeroquest.boardgame.Piece;
import jeroquest.utils.DynamicVectorPosition;
import jeroquest.utils.Position;

/**
 * Programming Methodology Practice.
 * Jeroquest - An example of Object Oriented Programming.
 * Class Character
 * @author Jorge Puente Peinador y Ramiro Varela Arias
 * @author Juan Luis Mateo Cerdán
 * @version 1.1
 * 
 */

public abstract class Character implements Piece {
	// current attributes of a character
	private int movement; // movement units per turn
	private int attack; // total dices for an attack
	private int defence; // total dices for defence
	private int body; // body points
	private String name; // name of the character

	protected Position position;


	/**
	 * Create a character with its name and initial attributes
	 * @param itsName the name
	 * @param itsMovement number of tiles to move per turn
	 * @param itsAttack number of dices to roll for an attack
	 * @param itsDefence number of dices to roll for defence
	 * @param itsBody initial body points
	 */
	public Character(String itsName, int itsMovement, int itsAttack, int itsDefence,int itsBody) {
		name = itsName;
		movement = itsMovement;
		attack = itsAttack;
		defence = itsDefence;
		body = itsBody;
}

	/**
	 * Get the units of movements per turn
	 * @return units of movement of the character
	 */
	public int getMovement() {
		return movement;
	}

	/**
	 * Get dices for attack
	 * @return character's attack dices
	 */
	public int getAttack() {
		return attack;
	}

	/**
	 * Get dices for defence
	 * @return character's defence dices
	 */
	public int getDefence() {
		return defence;
	}

	/** 
	 * Get the body points 
	 * @return character's body points
	 */
	public int getBody() {
		return body;
	}

	/**
	 * Get the name 
	 * @return character's name 
	 */
	public String getName() {
		return name;
	}
	
	protected void setMovement(int movement) {
		this.movement = movement;
	}

	protected void setAttack(int attack) {
		this.attack = attack;
	}

	protected void setDefence(int defence) {
		this.defence = defence;
	}

	protected void setBody(int body) {
		this.body = body;
	}

	protected void setName(String name) {
		this.name = name;
	}

	/**
	 * Check if the character has any body point left
	 * @return true if it is alive, false otherwise
	 */
	public boolean isAlive() {
		return body > 0;
	}

	/** 
	 * Computes the attack of a character getting the number of impacts,
	 * to do so roll as many dices as indicated by the attribute attack
	 * @return the number of impacts
	 */
	public int attack() {
		int impacts = 0;
		for (int x = 0; x < this.getAttack(); x++)
			if (Dice.roll() > 3)
				impacts++;
		return impacts;
	}

	/** 
	 * The character defends itself from an attack
	 * abstract method: each subclass must define its behaviour
	 * @param impacts The total number of impacts that it needs to try to block of suffer
	 * @return the number of suffered wounds
	 */
	public abstract int defend(int impacts);

	/** 
	 * Generate a printable String version of the object
	 *  (overriden method)
	 * @return the character's printable info as a String 
	 */
	@Override
	public String toString() {
		return String
				.format("%s (movement:%d attack:%d defence:%d body:%d)",
						getName(), getMovement(), getAttack(), getDefence(),
						getBody());
	}

	/**
	* Returns a dynamic array with the valid squares where a Piece can
	move directly from
	* its current position
	*
	* @param currentBoard the board with the Pieces
	* @return the vector of positions (possibly free) where it can move
	*/
	public DynamicVectorPosition validPositions(Board theBoard) {
		
		DynamicVectorPosition positions = new DynamicVectorPosition();

		// N
		if (theBoard.freeSquare(this.getPosition().north()))
			positions.add(this.getPosition().north());
		
		// S
		if (theBoard.freeSquare(this.getPosition().south()))
			positions.add(this.getPosition().south());
		
		// E
		if (theBoard.freeSquare(this.getPosition().east()))
			positions.add(this.getPosition().east());
		
		// W
		if (theBoard.freeSquare(this.getPosition().west()))
			positions.add(this.getPosition().west());
		
		/*
		// NE
		if (theBoard.freeSquare(this.getPosition().north().east()))
			positions.add(this.getPosition().north().east());
		
		// NW
		if (theBoard.freeSquare(this.getPosition().north().west()))
			positions.add(this.getPosition().north().west());
		
		// SE
		if (theBoard.freeSquare(this.getPosition().south().east()))
			positions.add(this.getPosition().south().east());
		
		// SW
		if (theBoard.freeSquare(this.getPosition().south().west()))
			positions.add(this.getPosition().south().west());
		*/

		return positions;

	}

}
