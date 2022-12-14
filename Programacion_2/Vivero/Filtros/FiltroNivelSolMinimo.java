package Vivero.Filtros;

import Vivero.Planta;

public class FiltroNivelSolMinimo extends Filtro{
	private int nivelMinimo;

	public FiltroNivelSolMinimo(int nivelMinimo) {
		this.nivelMinimo = nivelMinimo;
	}
	
	@Override
	public boolean cumple(Planta p) {
		return (nivelMinimo<p.getRequerimSol());
	}
}
