/**
 * Class MountainBike, inherits from Bicycle
 * and overrides the method printState
 * 
 */

public class MountainBike extends Bicycle implements Driveable {

	private String suspension;

	public MountainBike(int startCadence, int startSpeed, int startGear, String suspensionType){
		super();
		this.setSuspension(suspensionType);
	}

	public String getSuspension(){
		return this.suspension;
	}

	public void setSuspension(String suspensionType){
		this.suspension = suspensionType;
	}

	public void printStates(){
		System.out.println(" -- MountainBike -- ");  
		//super.printStates();
		System.out.println("The MountainBike has a " + getSuspension()
		+ " suspension.");
	}

	@Override
	public void turnLeft(int amount) {
		// TODO Auto-generated method stub

	}

	@Override
	public void turnRight(int amount) {
		// TODO Auto-generated method stub

	}

	@Override
	public void speedUp(int increment) {
		// TODO Auto-generated method stub

	}

	@Override
	public void slowDown(int decrement) {
		// TODO Auto-generated method stub

	}
} 





