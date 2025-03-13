/**
 * Class RoadBike, inherits from Bicycle
 * and overrides the method printState
 * 
 */

public class RoadBike extends Bicycle implements Driveable {

	private int tireWidth; // In millimeters (mm)

	public RoadBike(int startCadence, int startSpeed, int startGear, int newTireWidth){
		super();
		this.setTireWidth(newTireWidth);
	}

	public int getTireWidth(){
		return this.tireWidth;
	}

	public void setTireWidth(int newTireWidth){
		this.tireWidth = newTireWidth;
	}

	public void printStates(){
		System.out.println(" -- RoadBike -- ");  
		//super.printStates();
		System.out.println("The RoadBike has " + getTireWidth()
		+ " MM tires.");
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

