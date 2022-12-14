package Prefi_2021.Filtros;

import Prefi_2021.Video;

public class FiltroCompuesto extends Filtro{
	private Filtro f1;
	private Filtro f2;
	
	public FiltroCompuesto(Filtro f1, Filtro f2) {
		this.f1 = f1;
		this.f2 = f2;
	}

	@Override
	public boolean cumple(Video v) {
		return f1.cumple(v)&&f2.cumple(v);
	}

}
