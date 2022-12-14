package Vivero.Filtros;

import Vivero.Planta;

public class FiltroNot extends Filtro{
	private Filtro filtroNeg;

	public FiltroNot(Filtro filtroNeg) {
		super();
		this.filtroNeg = filtroNeg;
	}
	
	@Override
	public boolean cumple(Planta p) {
		return (!filtroNeg.cumple(p));
	}
}
