package jeroquest.units;

abstract class Hero extends Character {
	
	private String player;

	public Hero(String itsName, int itsMovement, int itsAttack, int itsDefence, int itsBody, String player) {
		super(itsName, itsMovement, itsAttack, itsDefence, itsBody);
		setPlayer(player);
	}
	
	@Override
	public int defend(int impacts) {
		return 0;
	}

	public String getPlayer() {
		return player;
	}

	public void setPlayer(String player) {
		this.player = player;
	}
	
}
