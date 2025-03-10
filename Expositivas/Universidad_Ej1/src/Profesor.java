
/**
 * Clase que modela a los profesores
 * @author puente
 *
 */
public class Profesor extends Personal{
	private double salarioAnual;
	private double cotizacionAnual;
	private String departamento;
	
	/**
	 * Constructor por componente de la clase Profesor, recibe tanto los valores iniciales de sus propios atributos como de los heredados
	 * @param nombre - nombre del estudiante
	 * @param dni - dni del profesor
	 * @param salarioAnual - salario anual del profesor
	 * @param cotizacionAnual - cotizaci�n anual del profesor
	 * @param departamento - departamento del profesor
	 */
	public Profesor(String nombre, String dni, double salarioAnual, double cotizacionAnual, String departamento) {
		super(nombre, dni);
		this.salarioAnual = salarioAnual;
		this.cotizacionAnual = cotizacionAnual;
		this.departamento = departamento;
	}


	/**
	 * Observador del salario anual
	 * @return el actual salario anual
	 */
	public double getSalarioAnual() {
		return salarioAnual;
	}

	/**
	 * Modificador del salario anual
	 * @param salarioAnual - el nuevo salario anual
	 */
	public void setSalarioAnual(double salarioAnual) {
		this.salarioAnual = salarioAnual;
	}

	/**
	 * Observador de la cotizaci�n anual
	 * @return la cotizaci�n anual
	 */
	public double getCotizacionAnual() {
		return cotizacionAnual;
	}

	/** 
	 * Modificador de la cotizaci�n anual
	 * @param cotizacionAnual - la nueva cotizaci�n anual
	 */
	public void setCotizacionAnual(double cotizacionAnual) {
		this.cotizacionAnual = cotizacionAnual;
	}


	/**
	 * Observador del departamento
	 * @return el departamento actual
	 */
	public String getDepartamento() {
		return departamento;
	}


	/** 
	 * Modificador del departamento
	 * @param departamento - el nuevo departamento
	 */
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}


	@Override
	public double saldo() {
		return -(this.getSalarioAnual() - this.getCotizacionAnual())
	}
}
