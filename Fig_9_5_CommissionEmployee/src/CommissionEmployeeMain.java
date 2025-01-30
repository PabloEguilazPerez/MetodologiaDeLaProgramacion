// Fig. 9.5: CommissionEmployeeTest.java
// CommissionEmployee class test program.
import java.util.ArrayList;

public class CommissionEmployeeMain 
{
   public static void main( String[] args ) 
   {
      // instantiate CommissionEmployee object
      CommissionEmployee employee = new CommissionEmployee( 
         "Sue", "Jones", "222-22-2222", 10000, .06 );
      
      // get commission employee data
      System.out.println( 
         "Employee information obtained by get methods: \n" );
      System.out.printf( "%s %s\n", "First name is",
         employee.getFirstName() );
      System.out.printf( "%s %s\n", "Last name is", 
         employee.getLastName() );
      System.out.printf( "%s %s\n", "Social security number is", 
         employee.getSocialSecurityNumber() );
      System.out.printf( "%s %.2f\n", "Gross sales is", 
         employee.getGrossSales() );
      System.out.printf( "%s %.2f\n", "Commission rate is",
         employee.getCommissionRate() ); 

      employee.setGrossSales( 500 ); // set gross sales
      employee.setCommissionRate( .1 ); // set commission rate
      
      System.out.printf( "\n%s:\n\n%s\n", 
         "Updated employee information obtained by toString", employee );
      
      CommissionEmployee[] empleados = new CommissionEmployee[4];
      
      empleados[0] = new CommissionEmployee("Sue", "Jones", "222-22-2222", 10000, .06 );
      empleados[1] = new CommissionEmployee("John", "Smith", "333-33-3333", 15000, .08);
      empleados[2] = new CommissionEmployee("Alice", "Brown", "444-44-4444", 12000, .05);
      empleados[3] = new CommissionEmployee("Bob", "Davis", "555-55-5555", 8000, .10);
      
      System.out.print("\n");
      System.out.print("maxEarningsEmployee \n");
      System.out.print(maxEarningsEmployee(empleados));

      sortEmployees(empleados);
      
      System.out.print("\n");
      System.out.print("Lista Ordenada \n");
      showEmployees(empleados);

      
   } // end main
   
   public static CommissionEmployee maxEarningsEmployee(CommissionEmployee[] maxEarningsEmployee) {
	   
	   CommissionEmployee sueldoMasAlto = maxEarningsEmployee[0];
       for (int i = 1; i < maxEarningsEmployee.length; i++) {
           if (maxEarningsEmployee[i].earnings() > sueldoMasAlto.earnings()) {
        	   sueldoMasAlto = maxEarningsEmployee[i];
           }
       }

       return sueldoMasAlto;
	   
   }
   
   
   public static void sortEmployees(CommissionEmployee[] v) {
	   
	   CommissionEmployee aux;
		
		for (int i = 1; i < v.length - 1; i++) {
			for (int j = 0; j < (v.length - i); j++) {
				if (v[j].earnings() > v[j + 1].earnings()) {
					aux = v[j];
					v[j] = v[j + 1];
					v[j + 1] = aux;
				}
			}
		}
	   
   }
   
   public static void showEmployees(CommissionEmployee[] v) {
	   
	   for(int i = 0; i < v.length; i++) {
		   System.out.println(v[i]);
		   System.out.print("\n");
	   }
	   
   }
} // end class CommissionEmployeeTest


/**************************************************************************
 * (C) Copyright 1992-2010 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/
