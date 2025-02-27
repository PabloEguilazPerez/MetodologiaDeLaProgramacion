package jeroquest.units;

public class FuriousMummy extends Mummy {

	public FuriousMummy(String itsName) {
		super(itsName);
	}
	
	@Override
	public int defend(int impacts) {
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
	
	@Override
	public int attack() {
		return super.attack() * 2;
	}

	@Override
	public String toString() {
		return "FuriousMummy []";
	}  	

}
