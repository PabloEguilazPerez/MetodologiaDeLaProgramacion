/**
 * Example using the class Bicycle
 * 
 */

class BicycleDemo {
     public static void main(String[] args) {

          // Create two different Bicycle objects
          Bicycle bike1 = new Bicycle(50,10,2);
          Bicycle bike2 = new Bicycle();
          Bicycle bike3 = new Bicycle();
          
          /* 
           * Añade operaciones al ejemplo de uso en el método main(). Por ejemplo, crea
           * otra bicicleta con la misma gear que bike1 y con el doble de speed de
           * bike2.
           */
          
          Bicycle bike4 = new Bicycle(bike1.getCadence(), bike2.getSpeed() * 2, 1);

          // Invoke methods on those objects

          bike1.printStates();

          bike2.setCadence(50);
          bike2.speedUp(10);
          bike2.setGear(2);
          bike2.setCadence(40);
          bike2.speedUp(10);
          bike2.setGear(3);
          bike2.printStates();
          
          bike3.printStates();
     }
}

