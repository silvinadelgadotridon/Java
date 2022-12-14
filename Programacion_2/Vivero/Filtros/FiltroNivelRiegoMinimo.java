package Vivero.Filtros;

import Vivero.Planta;

public class FiltroNivelRiegoMinimo extends Filtro{
	private int nivelMinimo;

	public FiltroNivelRiegoMinimo(int nivelMinimo) {
		this.nivelMinimo = nivelMinimo;
	}
	
	@Override
	public boolean cumple(Planta p) {
		return (nivelMinimo<p.getRequerimRiego());
	}
}

