package Prefi_2021.Filtros;

import Prefi_2021.Video;

public class FiltroAnio extends Filtro{
	private int anio;
	
	
	public FiltroAnio(int anio) {
		super();
		this.anio = anio;
	}


	@Override
	public boolean cumple(Video v) {
		return v.getAnio()-this.anio==0;
	}
	
	
}
