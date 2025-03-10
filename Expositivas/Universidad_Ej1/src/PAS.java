
public class PAS extends Personal {

	private double salarioAnual;
	
	
	
	public PAS(String nombre, String dni, double salarioAnual) {
		super(nombre, dni);
		setSalarioAnual(salarioAnual);
	}

	@Override
	public double saldo() {
		// TODO Auto-generated method stub
		return -getSalarioAnual();
	}

	public double getSalarioAnual() {
		return salarioAnual;
	}

	public void setSalarioAnual(double salarioAnual) {
		this.salarioAnual = salarioAnual;
	}

}
