/**
 * Class Bicycle with visibility public and private
 * 
 */

class Bicycle {

	private int cadence = 0;
	private int speed = 0;
	private int gear = 1;

	// Constructors
	public Bicycle() {
		this(0, 0, 1);
	}
	
	public Bicycle(Bicycle bicycle) {
		setSpeed(bicycle.getSpeed());
		setGear(bicycle.getGear());
		setCadence(bicycle.getCadence());
	}

	public Bicycle(int startCadence, int startSpeed, int startGear) {
		gear = startGear;
		cadence = startCadence;
		speed = startSpeed;
	}

	// Observers
	public int getCadence() {
		return cadence;
	}

	public int getGear() {
		return gear;
	}
	

	public int getSpeed() {
		return speed;
	}

	// Modifiers
	public void setCadence(int newValue) {
		if (newValue >= 0) {
			cadence = newValue;
		}
	}

	public void setGear(int newValue) {
		if (newValue >= 1) {
			gear = newValue;
		}
	}
	
	public void setSpeed(int newValue) {
		if (newValue >= 0) {
			speed = newValue;
		}
	}

	public void applyBrake(int decrement) {
		speed -= decrement;
	}

	public void speedUp(int increment) {
		speed += increment;
	}

	// Other observer
	public void printStates() {
		System.out.println(" -- Bicycle -- ");
		System.out.println("cadence:"+cadence+" speed:"+speed+" gear:"+gear);
	}

	@Override
	public String toString() {
		return "Bicycle [cadence=" + cadence + ", speed=" + speed + ", gear=" + gear + "]";
	}
	
	
}

