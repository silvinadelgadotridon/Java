package Composite;

import Composite.Filtros.Filtro;

public class ComboPagaUno extends Combo {

	public ComboPagaUno(String nombre, double porcentajeDto, double porcentajeTopeDto, Filtro filtro) {
		super(nombre, porcentajeDto, porcentajeTopeDto, filtro);
		
	}
	
	@Override
	public double getPrecio() {
		double mayor = 0.0;
		for(ProdAbstracto e:elementos) {
			double temp = e.getPrecio();
			if(mayor<temp) {
				mayor = temp;
			}
		}
		return mayor;
	}
	
	@Override
	public Producto copia(Filtro f) {
		if (f.cumple(this)){
			return this.copia(f);
		}else {
			return null;
		}
	}
	
	
}
