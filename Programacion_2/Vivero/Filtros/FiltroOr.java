package Vivero.Filtros;

import Vivero.Planta;

public class FiltroOr extends Filtro{
	private Filtro filtro1;
	private Filtro filtro2;
	
	public FiltroOr(Filtro filtro1, Filtro filtro2) {
		super();
		this.filtro1 = filtro1;
		this.filtro2 = filtro2;
	}
	
	@Override
	public boolean cumple(Planta p) {
		return (this.filtro1.cumple(p)||this.filtro2.cumple(p));
	}
}
