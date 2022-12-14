package Prefi2020;

public class CalculadorSueldoMensual extends CalculadorDeSueldo {
	private double sueldoMensual;
	
	
	public CalculadorSueldoMensual(double sueldoMensual) {
		this.sueldoMensual = sueldoMensual;
	}


	@Override
	public double calcularSueldo(Programador p) {
		return this.sueldoMensual;
	}

}
