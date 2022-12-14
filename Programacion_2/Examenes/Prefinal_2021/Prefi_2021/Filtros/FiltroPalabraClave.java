package Prefi_2021.Filtros;

import Prefi_2021.Video;

public class FiltroPalabraClave extends Filtro {
	private String palabraBuscada;
	
	
	public FiltroPalabraClave(String palabraBuscada) {
		this.palabraBuscada = palabraBuscada;
	}


	@Override
	public boolean cumple(Video v) {
		return v.tienePalabraClave(palabraBuscada);
	}

}
