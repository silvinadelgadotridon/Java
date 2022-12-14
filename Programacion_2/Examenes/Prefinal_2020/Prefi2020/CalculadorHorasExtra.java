package Prefi2020;

public class CalculadorHorasExtra extends CalculadorDeSueldo {
	private double precioPorHoraExtra;
	private CalculadorDeSueldo c;
	
	
	public CalculadorHorasExtra(double precioPorHoraExtra, CalculadorDeSueldo c) {
		this.precioPorHoraExtra = precioPorHoraExtra;
		this.c = c;
	}


	@Override
	public double calcularSueldo(Programador p) {
		return c.calcularSueldo(p)+ this.precioPorHoraExtra*p.getHorasExtra();
	}

}
