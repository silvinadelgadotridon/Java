package Composite.Filtros;

import Composite.ProdAbstracto;

public class FiltroOr extends Filtro {
	private Filtro f1;
	private Filtro f2;
	
	
	public FiltroOr(Filtro f1, Filtro f2) {
		this.f1 = f1;
		this.f2 = f2;
	}


	@Override
	public boolean cumple(ProdAbstracto pa) {
		return (f1.cumple(pa)||f2.cumple(pa));
	}
	

}
