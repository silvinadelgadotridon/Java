package Composite.Filtros;

import Composite.ProdAbstracto;

public class FiltroPesoSuperior extends Filtro {
	private double precioMinimo;
	
	
	public FiltroPesoSuperior(double precioMinimo) {
		this.precioMinimo = precioMinimo;
	}


	@Override
	public boolean cumple(ProdAbstracto pa) {
		return (pa.getPeso()>this.precioMinimo);
	}
}
