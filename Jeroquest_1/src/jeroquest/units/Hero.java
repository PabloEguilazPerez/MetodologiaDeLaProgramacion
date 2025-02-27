package jeroquest.units;

abstract class Hero extends Character {
	
	private String player;
	
	private Weapon weapon;

	public Hero(String itsName, int itsMovement, int itsAttack, int itsDefence, int itsBody, String player, Weapon weapon) {
		super(itsName, itsMovement, itsAttack, itsDefence, itsBody);
		setPlayer(player);
		setWeapon(weapon);
	}
	
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
	
	public Weapon getWeapon() {
		return weapon;
	}
	
	public void setWeapon(Weapon w) {
		weapon = w;
	}

	@Override
	public int getAttack() {
		
		return weapon != null ? weapon.getAttack() : super.getAttack();
		
	}
}
