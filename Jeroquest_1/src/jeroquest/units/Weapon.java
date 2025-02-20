package jeroquest.units;

public class Weapon {

	private String name;
	private int attack;

	public Weapon(String name, int attack) {
		this.name = name;
		this.attack = attack;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAttack() {
		return attack;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}

	@Override
	public String toString() {
		return "Weapon [name=" + name + ", attack=" + attack + "]";
	}

}
