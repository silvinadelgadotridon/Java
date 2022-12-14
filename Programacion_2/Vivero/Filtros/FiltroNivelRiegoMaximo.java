package Vivero.Filtros;

import Vivero.Planta;

public class FiltroNivelRiegoMaximo extends Filtro {
	private int nivelMaximo;

	public FiltroNivelRiegoMaximo(int nivelMaximo) {
		this.nivelMaximo = nivelMaximo;
	}
	
	@Override
	public boolean cumple(Planta p) {
		return (nivelMaximo>p.getRequerimRiego());
	}
}
