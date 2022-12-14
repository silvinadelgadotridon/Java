package Prefi_2021.Filtros;

import Prefi_2021.Video;

public class FiltroAutor extends Filtro{
	private String autorBuscado;
	
	
	public FiltroAutor(String autorBuscado) {
		this.autorBuscado = autorBuscado;
	}


	@Override
	public boolean cumple(Video v) {
		return v.getAutor().equals(autorBuscado);
	}

}
