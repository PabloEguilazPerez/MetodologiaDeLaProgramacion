package jeroquest;
import java.util.Random;

import jeroquest.units.Barbarian;
import jeroquest.units.Mummy;
import jeroquest.utils.Dice;

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

		/*
		// Conan attacks Ramses
		int impacts = conan.attack();
		ramses.defend(impacts);

		// if Ramses is alive attacks Conan
		if (ramses.isAlive())
			conan.defend(ramses.attack());
		 */

		// Completar esto en casa
		/*
		do {
			conan.defend(ramses.attack());
		} while (conan.isAlive());
		 */

		/*
		Define un vector de bárbaros y otro de momias, los dos del mismo tamaño, y haz
		que alternativamente un bárbaro ataque a una momia y viceversa, siguiendo el
		protocolo que se indica a continuación: 

		se realiza un número entero N de rondas,
		en cada ronda todos los bárbaros y todas las momias atacan en orden desde el
		primero al último; cuando ataca un bárbaro i elige a una momia j aleatoriamente;


		si el bárbaro i o la momia j no están vivos, entonces no hay ataque, en otro caso
		el bárbaro i ataca a la momia j. 

		Análogamente cuando ataca la momia i. 

		Es decir,
		primero ataca el bárbaro 0 a una momia aleatoria, luego ataca la momia 0 a un
		bárbaro aleatorio, luego ataca el bárbaro 1, y así sucesivamente. 

		El juego termina
		cuando se consumen los N rondas, o bien cuando todos los personajes de una
		clase se mueran.
		 */


		System.out.println(ramses);
		System.out.println(conan);

		int nElementos = 3;

		Mummy[] momias = new Mummy[nElementos];
		Barbarian[] barbaros = new Barbarian[nElementos];

		for (int i = 0; i < nElementos; i++) {
			momias[i] = new Mummy("Momia " + i);
			barbaros[i] = new Barbarian("Barbaro " + i);
		}

		int nRondas = 5;

		Random rand = new Random();

		System.out.println("=================== Comienza juego ===================");

		// Juego
		for (int ronda = 0; ronda < nRondas; ronda++) {
			
			System.out.println("=================== Comienza ronda " + (ronda + 1) + " ===================");

			ronda(barbaros, momias, ronda, nElementos);
			
			System.out.println("");

			System.out.println("Barbaro con mas vida: " + barbaroMasVida(barbaros));
			System.out.println("Momia con mas vida: " + momiaMasVida(momias));
			
			System.out.println("");
			
			System.out.println("=================== Fin ronda " + (ronda + 1) + " ===================");

			if (barbarosVivos(barbaros) == 0) {
				System.out.println("Murieron todos los barbaros");
				break;
			}

			if (momiasVivas(momias) == 0) {
				System.out.println("Murieron todas las momias");
				break;
			}

		}
		
		System.out.println("Barbaros restantes: " + barbarosVivos(barbaros));
		System.out.println("Momias restantes: " + momiasVivas(momias));
		
		mostrar(barbaros, momias);

	}

	public static void ronda(Barbarian[] barbaros, Mummy[] momias, int nRonda, int nElementos) {

		for (int i = 0; i < nElementos; i++) {

			if (barbaros[i].isAlive()) {
				//int objetivo = Dice.roll(nElementos) - 1;
				int objetivo = momiaMasVida(momias);
				
				if (momias[objetivo].isAlive()) {
					momias[objetivo].defend(barbaros[i].attack());
				}
			}

			if (momias[i].isAlive()) {
				//int objetivo = Dice.roll(nElementos) - 1;
				int objetivo = barbaroMasVida(barbaros);
				if (barbaros[objetivo].isAlive()) {
					barbaros[objetivo].defend(momias[i].attack());
				}
			}

		}

	}

	public static int barbarosVivos(Barbarian[] barbaros) {

		int v = 0;

		for (int i = 0; i < barbaros.length; i++) {
			if (barbaros[i].isAlive()) {
				v++;
			}
		}

		return v;

	}
	
	public static int momiasVivas(Mummy[] momias) {

		int v = 0;

		for (int i = 0; i < momias.length; i++) {
			if (momias[i].isAlive()) {
				v++;
			}
		}

		return v;

	}

	public static int barbaroMasVida(Barbarian[] barbaros) {

		int max = barbaros.length > 0 ? barbaros[0].getBody() : 0;
		int index = 0;
		
		for (int i = 0; i < barbaros.length; i++) {
			
			if (max < barbaros[i].getBody()) {
				
				max = barbaros[i].getBody();
				index = i;
				
			}
			
		}
		
		return index;

	}
	
	public static int momiaMasVida(Mummy[] momias) {
		
		int max = momias.length > 0 ? momias[0].getBody() : 0;
		int index = 0;
		
		for (int i = 0; i < momias.length; i++) {
			
			if (max < momias[i].getBody()) {
				
				max = momias[i].getBody();
				index = i;
				
			}
			
		}
		
		return index;
		
	}

	public static void mostrar(Barbarian[] barbaros, Mummy[] momias) {

		Barbarian aux;

		for (int i = 1; i < barbaros.length - 1; i++) {
			for (int j = 0; j < (barbaros.length - i); j++) {
				if (barbaros[j].getBody() > barbaros[j + 1].getBody()) {
					aux = barbaros[j];
					barbaros[j] = barbaros[j + 1];
					barbaros[j + 1] = aux;
				}
			}
		}
		
		
		Mummy aux2;

		for (int i = 1; i < momias.length - 1; i++) {
			for (int j = 0; j < (momias.length - i); j++) {
				if (momias[j].getBody() > momias[j + 1].getBody()) {
					aux2 = momias[j];
					momias[j] = momias[j + 1];
					momias[j + 1] = aux2;
				}
			}
		}

		
		System.out.println("Barbaros:");
		for (int i = 0; i < barbaros.length; i++) {
			System.out.println("Barbaro - " + barbaros[i].getName() + " Vida: " + barbaros[i].getBody());
		}
		
		System.out.println("Momias:");
		for (int i = 0; i < momias.length; i++) {
			System.out.println("Momias - " + momias[i].getName() + " Vida: " + momias[i].getBody());
		}

	}
}


