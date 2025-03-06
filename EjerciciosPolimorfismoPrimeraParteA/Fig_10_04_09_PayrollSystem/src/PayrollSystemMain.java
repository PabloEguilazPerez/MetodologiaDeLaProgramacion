// Fig. 10.9: PayrollSystemTest.java
// Employee hierarchy test program.

public class PayrollSystemMain 
{
	public static void main( String[] args ) 
	{
		// create subclass objects
		SalariedEmployee salariedEmployee = 
				new SalariedEmployee( "John", "Smith", "111-11-1111", 800.00 );
		HourlyEmployee hourlyEmployee = 
				new HourlyEmployee( "Karen", "Price", "222-22-2222", 16.75, 40 );
		CommissionEmployee commissionEmployee = 
				new CommissionEmployee( 
						"Sue", "Jones", "333-33-3333", 10000, .06 );
		BasePlusCommissionEmployee basePlusCommissionEmployee = 
				new BasePlusCommissionEmployee( 
						"Bob", "Lewis", "444-44-4444", 5000, .04, 300 );

		System.out.println( "Employees processed individually:\n" );

		System.out.printf( "%s\n%s: $%,.2f\n\n", 
				salariedEmployee, "earned", salariedEmployee.earnings() );
		System.out.printf( "%s\n%s: $%,.2f\n\n",
				hourlyEmployee, "earned", hourlyEmployee.earnings() );
		System.out.printf( "%s\n%s: $%,.2f\n\n",
				commissionEmployee, "earned", commissionEmployee.earnings() );
		System.out.printf( "%s\n%s: $%,.2f\n\n", 
				basePlusCommissionEmployee, 
				"earned", basePlusCommissionEmployee.earnings() );

		// create four-element Employee array
		Employee[] employees = new Employee[ 4 ]; 

		// initialize array with Employees
		employees[ 0 ] = salariedEmployee;
		employees[ 1 ] = hourlyEmployee;
		employees[ 2 ] = commissionEmployee; 
		employees[ 3 ] = basePlusCommissionEmployee;

		System.out.println( "Employees processed polymorphically:\n" );

		// POLIMORFISM: generically process each element in array employees
		for ( Employee currentEmployee : employees ) 
		{
			System.out.println( currentEmployee ); // invokes toString

			// determine whether element is a BasePlusCommissionEmployee
			if ( currentEmployee instanceof BasePlusCommissionEmployee ) 
			{
				((BasePlusCommissionEmployee) currentEmployee)
				.setBaseSalary(1.10 * ((BasePlusCommissionEmployee) currentEmployee).getBaseSalary());

				System.out.printf(
						"new base salary with 10%% increase is: $%,.2f\n",
						((BasePlusCommissionEmployee) currentEmployee).getBaseSalary()
						);
			} // end if

			System.out.printf( 
					"earned $%,.2f\n\n", currentEmployee.earnings() );
		} // end for

		// get type name of each object in employees array
		for ( int j = 0; j < employees.length; j++ )
			System.out.printf( "Employee %d is a %s\n", j, 
					employees[ j ].getClass().getName() ); 

		System.out.println("\n\nMas gana \n");
		System.out.println(earnsTheMost(employees) + "\n");

		sortAscending(employees);
		System.out.println("\nOrdenados \n");
		for (Employee employee : employees){
			System.out.println(employee + "\n");
		}

	} // end main

	public static Employee earnsTheMost(Employee[] employees){
		
		if (employees == null || employees.length == 0 ){
			return null;
		}

		Employee max = employees[0];
		for (int i = 1; i < employees.length; i++){
			if (employees[i].earnings() > max.earnings()){
				max = employees[i];
			}
		}
		return max;

	}

	public static void sortAscending(Employee[] v) {
		
		if (v == null || v.length == 0){
			return;
		}

		Employee temp;

		for (int i = 0; i < v.length; i++){
			for (int j = 0; j < v.length - 1; j++){
				if (v[j].earnings() > v[j+1].earnings()){
					temp = v[j];
					v[j] = v[j+1];
					v[j+1] = temp;
				}
			}
		}

	}
	
	/**
	/* @param employees un vector de trabajadores
	/* @param inc lo que hay que incrementar commissionRate
	/* @param toWhom entero que indica a quienes hay que cambiar
	/* el valor: 0 a todos los que tienen este dato, 1 solo a los
	/* de la clase CommissionEmployee, 2 solo a los de la clase
	/* BasePlusCommissionEmployee
	*/
	public static void changeCommissionRate( Employee[] employees, double inc, int toWhom){
		
		if (employees == null || employees.length == 0){
			return;
		}
		
		for (Employee employee : employees){
			if (toWhom == 0){
				if (employee instanceof CommissionEmployee){
					((CommissionEmployee) employee).setCommissionRate(inc);
				}
				else if (employee instanceof BasePlusCommissionEmployee){
					((BasePlusCommissionEmployee) employee).setCommissionRate(inc);
				}
			}
			else if (toWhom == 1){
				if (employee instanceof CommissionEmployee){
					((CommissionEmployee) employee).setCommissionRate(inc);
				}
			}
			else if (toWhom == 2){
				if (employee instanceof BasePlusCommissionEmployee){
					((BasePlusCommissionEmployee) employee).setCommissionRate(inc);
				}
			}
		}
		
	}

} // end class PayrollSystemTest

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
