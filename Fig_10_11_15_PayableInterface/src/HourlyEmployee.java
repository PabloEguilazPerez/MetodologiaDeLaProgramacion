
/*
Incluye otra clase, por ejemplo HourlyEmployee para representar a
trabajadores que trabajan por horas, cuyo salario se calcula como wage *
hours, para las primeras 40 horas trabajadas, mientras que las siguientes
horas son extraordinarias y se computan como 1,5 horas cada una en el salario.
 */

public class HourlyEmployee extends Employee  implements Payable {
	
	private double wage;
	private double hours;
	
	public HourlyEmployee(String first, String last, String ssn, double wage, double hours) {
		super(first, last, ssn);
		setWage(wage);
		setHours(hours);
	}

	public double getWage() {
		return wage;
	}

	public void setWage(double wage) {
		this.wage = wage;
	}

	public double getHours() {
		return hours;
	}

	public void setHours(double hours) {
		this.hours = hours;
	}

	@Override
	public double getPaymentAmount() {
		if (hours <= 40) {
			return wage * hours;
		} else {
			return wage * 40 + (wage * 1.5 * (hours - 40));
		}	
	}
	
	@Override
	public String toString() {
		return String.format( "salaried employee: %s\n%s: %s\n%s: $%,.2f", 
		         super.toString(), "hours", getHours(), "wage", getWage());
	}

}
