package Prefi_2021.Filtros;

import Prefi_2021.Video;

public class FiltroNot extends Filtro {
	private Filtro fNot;
	
	
	public FiltroNot(Filtro fNot) {
		this.fNot = fNot;
	}

	@Override
	public boolean cumple(Video v) {
		return !fNot.cumple(v);
	}

}
