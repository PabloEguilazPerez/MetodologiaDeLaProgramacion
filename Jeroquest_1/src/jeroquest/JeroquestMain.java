package jeroquest;
import jeroquest.units.Barbarian;
import jeroquest.units.Mummy;

/**
 * Programming Methodology Practice.
 * Jeroquest - An example of Object Oriented Programming.
 * Main program
 * @author Jorge Puente Peinador y Ramiro Varela Arias
 * @author Juan Luis Mateo Cerdán
 * @version 1
 *
 */

public class JeroquestMain {

	public static void main(String[] args) {
		
		Mummy ramses = new Mummy("Ramses");
		Barbarian conan = new Barbarian("Conan2");
		
		System.out.println(ramses);
		System.out.println(conan);
		
		// Conan attacks Ramses
		int impacts = conan.attack();
		ramses.defend(impacts);
		
		// if Ramses is alive attacks Conan
		if (ramses.isAlive())
			conan.defend(ramses.attack());
			
		System.out.println(ramses);
		System.out.println(conan);
	}

}
