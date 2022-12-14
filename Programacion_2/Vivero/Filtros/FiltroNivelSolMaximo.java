package Vivero.Filtros;

import Vivero.Planta;

public class FiltroNivelSolMaximo extends Filtro{
	private int nivelMaximo;

	public FiltroNivelSolMaximo(int nivelMaximo) {
		this.nivelMaximo = nivelMaximo;
	}
	
	@Override
	public boolean cumple(Planta p) {
		return (nivelMaximo>p.getRequerimSol());
	}
}

