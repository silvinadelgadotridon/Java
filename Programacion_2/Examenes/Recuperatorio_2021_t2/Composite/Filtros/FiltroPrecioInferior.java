package Composite.Filtros;

import Composite.ProdAbstracto;

public class FiltroPrecioInferior extends Filtro {
	private double precioMaximo;
	
	public FiltroPrecioInferior (double precioMaximo) {
		this.precioMaximo = precioMaximo;
	}
	@Override
	public boolean cumple(ProdAbstracto pa) {
		return (pa.getPrecio()<this.precioMaximo);
	}

}
