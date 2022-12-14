package Prefi2020;

public class CalculadorPorHora extends CalculadorDeSueldo {
	private double precioPorHora;
	private int cantHoras;
	
	
	public CalculadorPorHora(double precioPorHora, int cantHoras) {
		this.precioPorHora = precioPorHora;
		this.cantHoras = cantHoras;
	}



	@Override
	public double calcularSueldo(Programador p) {
		
		return this.precioPorHora*this.cantHoras;
	}

}
