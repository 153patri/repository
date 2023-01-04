package convertir;

public enum Divisas {
	//ARS: PESOS ARGENTINOS,
	//USD:DÓLARES,
	//USR: EUROS,
	//GBP:LIBRA ESTERLINA,
	//JPY:YEN JAPONÉS,
	//KRW:WON COREANO.
	
	ARS(1), USD(178.3600), EUR(188.4017),
	GBP(213.7466), JPY(1.3639), KRW(0.1398);

	private double equivalencia;
	
	Divisas(double equivalencia) {
		        this.equivalencia = equivalencia;
		    }
	
	public double getEquivalencia() {
		return equivalencia;
	}
	
	public String convertirARSADivisa(double cantidad) {
	 
		return String.format("El resultado es %.4f %s.", 
				(cantidad /this.equivalencia), this.toString());
	}

	public String convertirDivisaAARS (double cantidad) {
		
		return String.format("El resultado es %.4f  ARS.",
				(cantidad * this.equivalencia));
	}
	
}

