package jeroquest.units;

import jeroquest.utils.Dice;

public class Dwarf extends Hero {

	protected static final int MOVEMENT = 7;
	protected static final int ATTACK = 1;
	protected static final int DEFENCE = 2;
	protected static final int BODY = 7;

	public Dwarf(String itsName) {
		// setting the attributes with the initial values
		this(itsName, "no-name");
	}
	
	public Dwarf(String itsName, String playerName) {
		// setting the attributes with the initial values
		super(itsName, MOVEMENT, ATTACK, DEFENCE, BODY, playerName, new Weapon("Hand axe", 2));

	}

	@Override
	public int defend(int impacts) {
		// trying to block the impacts with its defence
		for (int totalDefenceDices = getDefence(); (impacts > 0) && (totalDefenceDices > 0); totalDefenceDices--)
			if (Dice.roll() > 4) // bloquear un impacto con un 5 o 6
				impacts--;

		// if there are not blocked impacts reduce body points
		if (impacts > 0) {
			// a character life cannot be lower than zero
			setBody(Math.max(0, getBody() - impacts));
			System.out.printf("The mummy " + this.getName() + " cannot block %d impacts%s", impacts,
					(isAlive() ? "\n" : " and dies\n"));
		} else {
			System.out.printf("The mummy " + this.getName() + " blocks completely the attack\n");
		}

		return impacts;
	}
	
}
