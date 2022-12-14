package Composite.Filtros;

import Composite.ProdAbstracto;

public class FiltroNot extends Filtro {
	private Filtro fNeg;
	
	
	public FiltroNot(Filtro fNeg) {
		this.fNeg = fNeg;
	}


	@Override
	public boolean cumple(ProdAbstracto pa) {
		return (!fNeg.cumple(pa));
	}

}
