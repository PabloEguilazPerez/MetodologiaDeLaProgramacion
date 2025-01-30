import java.util.Arrays;

public class CommissionAndBasePlusEmployeesMain {

	public static void main(String[] args) {
		// TODO 
		CommissionEmployee[] v1 = new CommissionEmployee[4];
		BasePlusCommissionEmployee[] v2 = new BasePlusCommissionEmployee[4];

		v1[0] = new CommissionEmployee("Sue", "Jones", "222-22-2222", 10000, .06 );
		v1[1] = new CommissionEmployee("John", "Smith", "333-33-3333", 15000, .08);
		v1[2] = new CommissionEmployee("Alice", "Brown", "444-44-4444", 12000, .05);
		v1[3] = new CommissionEmployee("Bob", "Davis", "555-55-5555", 8000, .10);

		v2[0] = new BasePlusCommissionEmployee("Sue", "Jones", "222-22-2222", 10000.00, .06, 100 );
		v2[1] = new BasePlusCommissionEmployee("John", "Smith", "333-33-3333", 15000, .08, 200);
		v2[2] = new BasePlusCommissionEmployee("Alice", "Brown", "444-44-4444", 12000, .05, 300);
		v2[3] = new BasePlusCommissionEmployee("Bob", "Davis", "555-55-5555", 8000, .10, 38400);

		System.out.println("maxEarnings: " + maxEarnings(v1, v2));
		
		double v3[] = new double[v1.length + v2.length];
		
		generateSortedEarnings(v1, v2, v3);

	}
	
	public static void generateSortedEarnings(CommissionEmployee[] v1, BasePlusCommissionEmployee[] v2, double[] v3) {
		
		for (int i = 0; i < v1.length; i++) {
			v3[i] = v1[i].earnings();
		}
		
		for (int i = 0; i < v2.length; i++) {
			v3[i + v1.length] = v2[i].earnings();
		}
		
		
		double aux;
		
		for (int i = 1; i < v3.length - 1; i++) {
			for (int j = 0; j < (v3.length - i); j++) {
				if (v3[j] > v3[j + 1]) {
					aux = v3[j];
					v3[j] = v3[j + 1];
					v3[j + 1] = aux;
				}
			}
		}
		
	}

	public static double maxEarnings(CommissionEmployee[] v1, BasePlusCommissionEmployee[] v2) {

		CommissionEmployee sueldoMasAlto = v1[0];
		for (int i = 1; i < v1.length; i++) {
			if (v1[i].earnings() > sueldoMasAlto.earnings()) {
				sueldoMasAlto = v1[i];
			}
		}

		BasePlusCommissionEmployee sueldoMasAltoPlus = v2[0];
		for (int i = 1; i < v2.length; i++) {
			if (v2[i].earnings() > sueldoMasAltoPlus.earnings()) {
				sueldoMasAltoPlus = v2[i];
			}
		}

		return sueldoMasAlto.earnings() > sueldoMasAltoPlus.earnings() ? sueldoMasAlto.earnings() : sueldoMasAltoPlus.earnings() ;

	}
}
