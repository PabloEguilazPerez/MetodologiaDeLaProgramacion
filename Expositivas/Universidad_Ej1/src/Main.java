
public class Main {

	public static void main(String[] args) {
		ProgramaDoctorado pd = new ProgramaDoctorado("Informatica", 3000);
		Personal vU[] = {
				new EGrado("Nombre EGrado 03", "DNI 03", 1000, "Grado 03"),
				new EGrado("Nombre EGrado 04", "DNI 04", 1100, "Grado 04"),
				new EMaster("Nombre EMaster 05", "DNI 05", 1200, 1500, "Ingenier�a Inform�tica"),
				new EMaster("Nombre EMaster 06", "DNI 06", 1300, 1600,  "Big Data"),
				new EDoctorado("Nombre EDoctorado 07", "DNI 07", 1400, 1700,  "Ingenier�a Inform�tica", pd),
				new EDoctorado("Nombre EDoctorado 08", "DNI 08", 1500, 1800,  "Ingenier�a Inform�tica", pd),	
				new Profesor("Nombre Profesor 01", "DNI 01", 30000, 6000, "Dpto 01"),
				new Profesor("Nombre Profesor 02", "DNI 02", 40000, 10000, "Dpto 02"),
		};

		double totalSaldo = saldoTotal(vU);
		System.out.println("El saldo total es: " + totalSaldo );
		
		int totalMaster = estudiantesMaster(vU, "Ingenier�a Inform�tica");
		System.out.println("El total de alumnos del M�ster de Ingnier�a Inform�tica son: " + totalMaster);
		
		double totalIngresos = cobroTotal(vU);
		System.out.println("El total de ingresos es: " + totalIngresos);
		
		ordenaPorCobro(vU);
		System.out.println("array ordenado:");
		for(Personal p: vU)
			System.out.println(p);
	}

	/*
	saldoTotal(vU). Calcula y retorna el saldo total de la instituci�n. Este saldo es la
	suma de los saldos individuales. El saldo individual de un estudiante de grado o m�ster es
	positivo y su importe corresponde a las tasas que paga. El saldo de un profesor es
	negativo y corresponde a la suma del salario y la cotizaci�n. En el caso de los estudiantes
	de doctorado el saldo es la diferencia entre las tasas que pagan y la beca que reciben.
	 */
	private static double saldoTotal(Personal[] vU) {
		double total = 0;
		
		for (Personal p: vU) {
			
			if (p instanceof Profesor) {
				total += p.getSalarioAnual();
			}
			
		}

		return total;
	}
	
	/*
	estudiantesMaster(vU,�Ingenieria Inform�tica�). Calcula y retorna el
	n�mero de estudiantes que cursan o han cursado el master con nombre �Ingenier�a
	Inform�tica�.
	 */
	private static int estudiantesMaster(Personal[] vU, String master) {
		int total = 0;

		return total;
	}

	/*
	cobroTotal(vU). Es la suma de lo que cobran los miembros de la instituci�n en
	salarios. Actualmente son los profesores pero en un futuro se quiere incluir a otros tipos
	de empleados a�n no contemplados. El m�todo no deber�a verse modificado ante la
	aparici�n de nuevos tipos de asalariados.
	 */
	private static double cobroTotal(Personal[] vU) {
		double total = 0;

		return total;
	}

	/*
	ordenaPorCobro(vU). Ordena el vector de modo que queden primero los que
	cobran y luego los que no cobran.
	 */
	private static void ordenaPorCobro(Personal[] vU) {
	}


}

