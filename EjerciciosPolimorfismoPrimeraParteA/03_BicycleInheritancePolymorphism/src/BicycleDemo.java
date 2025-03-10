/**
 * Simple example using polymorphism and downcasting
 * 
 */

class BicycleDemo {
	public static void main(String[] args){
	    Bicycle bike01, bike02, bike03;
	    
	    bike01 = new Bicycle(20, 10, 1);
		bike02 = new MountainBike(20, 10, 5, "Dual");
		bike03 = new RoadBike(40, 20, 8, 23);
        
		// JVM calls the appropriate method for the referenced object
		// and not the method for the variable type
		//bike01.printStates();
		//bike02.printStates();
		//bike03.printStates();
		
		Bicycle [] vectBikes = {bike01, bike02, bike03, new MountainBike(30, 15, 7, "Front")};
		
		for (Bicycle bike : vectBikes){
			
			//((MountainBike) bike).getSuspension();
			
			if (bike instanceof MountainBike){
				System.out.println(((MountainBike) bike).getSuspension());
			} else if (bike instanceof RoadBike){
				System.out.println(((RoadBike) bike).getTireWidth());
			} else {
				bike.printStates();
			}
		}
		
		for (int i = 0; i < vectBikes.length; i++){
			System.out.format("%nBycicle [%d]:%n",i);
			vectBikes[i].printStates();
		}
		
		// To use the specific methods for each class
		// it is necessary to do downcast
		
		//MountainBike m2 = (MountainBike) bike02;
		//m2.setSuspension("Mono");
		((MountainBike)bike02).setSuspension("Mono");
		
		for (int i = 0; i < vectBikes.length; i++){
			System.out.format("%nBycicle [%d]:%n",i);
			vectBikes[i].printStates();
		}
	}
}



